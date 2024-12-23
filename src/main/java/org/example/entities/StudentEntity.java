package org.example.entities;

import java.util.Objects;

public class StudentEntity {

    private long idOfStudent;

    private String firstName;

    private String lastName;

    private int serName;

    private StatusOfStudentEntity statusOfStudent;

    private GroupOfStudentsEntity group;



    public StudentEntity(long idOfStudent, String firstName, String lastName,
                         int serName, StatusOfStudentEntity statusOfStudent,
                         GroupOfStudentsEntity group) {
        this.idOfStudent = idOfStudent;
        this.firstName = firstName;
        this.lastName = lastName;
        this.serName = serName;
        this.statusOfStudent = statusOfStudent;
        this.group = group;
    }

    public long getIdOfStudent() {
        return idOfStudent;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getSerName() {
        return serName;
    }

    public StatusOfStudentEntity getStatusOfStudent() {
        return statusOfStudent;
    }

    public GroupOfStudentsEntity getGroup() {
        return group;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentEntity that = (StudentEntity) o;
        return idOfStudent == that.idOfStudent && serName == that.serName && Objects.equals(firstName, that.firstName) && Objects.equals(lastName, that.lastName) && statusOfStudent == that.statusOfStudent && Objects.equals(group, that.group);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idOfStudent, firstName, lastName, serName, statusOfStudent, group);
    }

    public void setIdOfStudent(long idOfStudent) {
        this.idOfStudent = idOfStudent;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSerName(int serName) {
        this.serName = serName;
    }

    public void setStatusOfStudent(StatusOfStudentEntity statusOfStudent) {
        this.statusOfStudent = statusOfStudent;
    }

    public void setGroup(GroupOfStudentsEntity group) {
        this.group = group;
    }
}
