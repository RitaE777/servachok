package org.example.entities;

import java.util.Objects;

public class GroupOfStudentsEntity {

    private String nameOfGroup;

    private long idOfGroup;

    public GroupOfStudentsEntity(String nameOfGroup, long idOfGroup) {
        this.nameOfGroup = nameOfGroup;
        this.idOfGroup = idOfGroup;
    }

    public void setNameOfGroup(String nameOfGroup) {
        this.nameOfGroup = nameOfGroup;
    }

    public void setIdOfGroup(long idOfGroup) {
        this.idOfGroup = idOfGroup;
    }

    public long getIdOfGroup() {
        return idOfGroup;
    }

    public String getNameOfGroup() {
        return nameOfGroup;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GroupOfStudentsEntity that = (GroupOfStudentsEntity) o;
        return Objects.equals(nameOfGroup, that.nameOfGroup);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nameOfGroup);
    }
}
