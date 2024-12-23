package org.example.request;

import java.util.List;
import java.util.Objects;

public class AttendingLessonRequest {
    private long id;
    private long lessonId;
    private List<Long> studentIds;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AttendingLessonRequest that = (AttendingLessonRequest) o;
        return id == that.id && lessonId == that.lessonId && Objects.equals(studentIds, that.studentIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, lessonId, studentIds);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getLessonId() {
        return lessonId;
    }

    public void setLessonId(long lessonId) {
        this.lessonId = lessonId;
    }

    public List<Long> getStudentIds() {
        return studentIds;
    }

    public void setStudentIds(List<Long> studentIds) {
        this.studentIds = studentIds;
    }

    public AttendingLessonRequest(long id, long lessonId, List<Long> studentIds) {
        this.id = id;
        this.lessonId = lessonId;
        this.studentIds = studentIds;
    }
}
