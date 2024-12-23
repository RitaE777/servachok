package org.example.entities;

import java.util.Objects;

public class TeacherEntity {
    private long idOfTeacher;

    private String firstName;

    private String lastName;

    private String serName;

    public TeacherEntity(long idOfTeacher, String firstName, String lastName, String serName) {
        this.idOfTeacher = idOfTeacher;
        this.firstName = firstName;
        this.lastName = lastName;
        this.serName = serName;
    }

    public long getIdOfTeacher() {
        return idOfTeacher;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSerName() {
        return serName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TeacherEntity that = (TeacherEntity) o;
        return idOfTeacher == that.idOfTeacher && Objects.equals(firstName, that.firstName) && Objects.equals(lastName, that.lastName) && Objects.equals(serName, that.serName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idOfTeacher, firstName, lastName, serName);
    }

    public void setIdOfTeacher(long idOfTeacher) {
        this.idOfTeacher = idOfTeacher;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSerName(String serName) {
        this.serName = serName;
    }
}
