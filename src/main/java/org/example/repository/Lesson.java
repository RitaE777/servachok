package org.example.repository;

import org.example.entities.LessonEntity;

import java.time.LocalDate;
import java.util.List;

public interface Lesson {
    long add(LessonEntity lesson);

    void deleteByTeacherId(long teacherId);

    void deleteByGroupId(long groupId);

    LessonEntity getById(long id);

    List<LessonEntity> getByIdTeacherForPeriod(long teacherId, LocalDate dateStart, LocalDate dateEnd);

    List<LessonEntity> getByIdGroupForPeriod(long groupId, LocalDate dateStart, LocalDate dateEnd);

}
