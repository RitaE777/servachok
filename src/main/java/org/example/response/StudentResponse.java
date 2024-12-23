package org.example.response;

import org.example.entities.StatusOfStudentEntity;

import java.util.Objects;

public class StudentResponse {

    private long id;
    private String name;
    private String surname;
    private String patronymic;
    private StatusOfStudentEntity statusOfStudents;
    private long groupId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentResponse that = (StudentResponse) o;
        return id == that.id && groupId == that.groupId && Objects.equals(name, that.name) && Objects.equals(surname, that.surname) && Objects.equals(patronymic, that.patronymic) && statusOfStudents == that.statusOfStudents;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, patronymic, statusOfStudents, groupId);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public StatusOfStudentEntity getStatusOfStudents() {
        return statusOfStudents;
    }

    public void setStatusOfStudents(StatusOfStudentEntity statusOfStudents) {
        this.statusOfStudents = statusOfStudents;
    }

    public long getGroupId() {
        return groupId;
    }

    public void setGroupId(long groupId) {
        this.groupId = groupId;
    }

    public StudentResponse(long id, String name, String surname, String patronymic, StatusOfStudentEntity statusOfStudents, long groupId) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.statusOfStudents = statusOfStudents;
        this.groupId = groupId;
    }
}
