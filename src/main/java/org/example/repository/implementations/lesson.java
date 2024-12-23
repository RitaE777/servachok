package org.example.repository.implementations;

import org.example.entities.LessonEntity;
import org.example.repository.Lesson;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class lesson implements Lesson {

    List<LessonEntity> lessons;

    @Override
    public long add(LessonEntity lesson) {
        try {
            if(lesson.getIdOfLesson() == 0){
                long newId = lessons.size() + 1;
                lesson.setIdOfLesson(newId);
                lessons.add(lesson);
            }
            else {
                lessons.removeIf(existingLesson -> existingLesson.getIdOfLesson() == lesson.getIdOfLesson());
                lessons.add(lesson);
            }
            return lesson.getIdOfLesson();
        } catch (Exception e) {
            throw new RuntimeException("Error while adding a lesson", e);
        }
    }

    @Override
    public void deleteByTeacherId(long teacherId) {
        try {
            lessons.removeIf(existingLesson -> existingLesson.getTeacherId() == teacherId);
        } catch (Exception e){
            throw new RuntimeException("Error while removing a teacherById", e);
        }
    }

    @Override
    public void deleteByGroupId(long groupId) {
        try {
            lessons.removeIf(existingLesson -> existingLesson.getGroupId() == groupId);
        } catch (Exception e){
            throw new RuntimeException("Error while removing a groupById", e);
        }
    }

    @Override
    public LessonEntity getById(long id) {
        try {
            return lessons.stream().filter(existingLesson -> existingLesson.
                    getIdOfLesson() == id).findFirst().orElseThrow(() ->
                    new IllegalArgumentException("Lesson with id " + id + " not found"));
        } catch (Exception e) {
            throw new RuntimeException("Error, on get lesson by id");
        }
    }

    @Override
    public List<LessonEntity> getByIdTeacherForPeriod(long teacherId, LocalDate dateStart, LocalDate dateEnd) {
        try {
            return lessons.stream()
                    .filter(lesson -> lesson.getTeacherId() == teacherId)
                    .filter(lesson ->
                            lesson.getDate().isAfter(dateStart) && lesson.getDate().isBefore(dateEnd))
                    .collect(Collectors.toList());
        } catch (Exception e) {
            throw new RuntimeException("db error, on getByIdTeacherForPeriod", e);
        }
    }

    @Override
    public List<LessonEntity> getByIdGroupForPeriod(long groupId, LocalDate dateStart, LocalDate dateEnd) {
        try {
            return lessons.stream()
                    .filter(lesson -> lesson.getGroupId() == groupId)
                    .filter(lesson ->
                            lesson.getDate().isAfter(dateStart) && lesson.getDate().isBefore(dateEnd))
                    .collect(Collectors.toList());
        } catch (Exception e) {
            throw new RuntimeException("db error, on getByIdGroupForPeriod", e);
        }
    }
}
