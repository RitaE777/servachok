package org.example.repository;

import org.example.entities.AttendancingOfLessonEntity;

public interface AttendancingRepository {
    long add(AttendancingOfLessonEntity attendingLesson);

    void deleteById(long id);

    AttendancingOfLessonEntity getById(long id);

    long addByLessonId(long lessonId, AttendancingOfLessonEntity attendingLesson);

    void removeByLessonId(long lessonId);
}
