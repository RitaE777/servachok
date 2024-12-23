package org.example.response;

import java.time.LocalDate;
import java.util.Objects;

public class LessonResponse {
    private long id;
    private long teacherId;
    private long groupId;
    private LocalDate dateOfLesson;
    private int numberOfLesson;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LessonResponse that = (LessonResponse) o;
        return id == that.id && teacherId == that.teacherId && groupId == that.groupId && numberOfLesson == that.numberOfLesson && Objects.equals(dateOfLesson, that.dateOfLesson);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, teacherId, groupId, dateOfLesson, numberOfLesson);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public LocalDate getDateOfLesson() {
        return dateOfLesson;
    }

    public void setDateOfLesson(LocalDate dateOfLesson) {
        this.dateOfLesson = dateOfLesson;
    }

    public int getNumberOfLesson() {
        return numberOfLesson;
    }

    public void setNumberOfLesson(int numberOfLesson) {
        this.numberOfLesson = numberOfLesson;
    }

    public LessonResponse(long id, long teacherId, long groupId, LocalDate dateOfLesson, int numberOfLesson) {
        this.id = id;
        this.teacherId = teacherId;
        this.groupId = groupId;
        this.dateOfLesson = dateOfLesson;
        this.numberOfLesson = numberOfLesson;
    }
}
