package org.example.entities;

import java.util.List;
import java.util.Objects;

public class AttendancingOfLessonEntity {

    private long idOfAttendance;

    private LessonEntity lesson;

    private List<StudentEntity> students;

    private long idOfLesson;

    public long getIdOfLesson() {
        return idOfLesson;
    }

    public void setIdOfLesson(long idOfLesson) {
        this.idOfLesson = idOfLesson;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AttendancingOfLessonEntity that = (AttendancingOfLessonEntity) o;
        return idOfAttendance == that.idOfAttendance && Objects.equals(lesson, that.lesson) && Objects.equals(students, that.students);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idOfAttendance, lesson, students);
    }

    public long getIdOfAttendance() {
        return idOfAttendance;
    }

    public LessonEntity getLesson() {
        return lesson;
    }

    public List<StudentEntity> getStudents() {
        return students;
    }

    public AttendancingOfLessonEntity(long idOfAttendance, LessonEntity lesson,
                                      List<StudentEntity> students) {
        this.idOfAttendance = idOfAttendance;
        this.lesson = lesson;
        this.students = students;
    }

    public void setIdOfAttendance(long idOfAttendance) {
        this.idOfAttendance = idOfAttendance;
    }

    public void setLesson(LessonEntity lesson) {
        this.lesson = lesson;
    }

    public void setStudents(List<StudentEntity> students) {
        this.students = students;
    }
}
