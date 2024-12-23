package org.example.entities;

import java.time.LocalDate;
import java.util.Objects;

public class LessonEntity {

    private long idOfLesson;

    private LocalDate date;

    private int numberOfLesson;

    private long teacherId;

    private long groupId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LessonEntity that = (LessonEntity) o;
        return idOfLesson == that.idOfLesson && numberOfLesson == that.numberOfLesson && teacherId == that.teacherId && groupId == that.groupId && Objects.equals(date, that.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idOfLesson, date, numberOfLesson, teacherId, groupId);
    }

    public long getIdOfLesson() {
        return idOfLesson;
    }

    public void setIdOfLesson(long idOfLesson) {
        this.idOfLesson = idOfLesson;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getNumberOfLesson() {
        return numberOfLesson;
    }

    public void setNumberOfLesson(int numberOfLesson) {
        this.numberOfLesson = numberOfLesson;
    }

    public long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(long teacherId) {
        this.teacherId = teacherId;
    }

    public long getGroupId() {
        return groupId;
    }

    public void setGroupId(long groupId) {
        this.groupId = groupId;
    }

    public LessonEntity(long idOfLesson, LocalDate date, int numberOfLesson, long teacherId, long groupId) {
        this.idOfLesson = idOfLesson;
        this.date = date;
        this.numberOfLesson = numberOfLesson;
        this.teacherId = teacherId;
        this.groupId = groupId;
    }
}

