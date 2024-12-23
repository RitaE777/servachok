package org.example.entities;

import java.util.Objects;

public class DisciplineEntity {

    private long idOfDiscipline;

    private String nameOfDiscipline;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DisciplineEntity that = (DisciplineEntity) o;
        return idOfDiscipline == that.idOfDiscipline && Objects.equals(nameOfDiscipline, that.nameOfDiscipline);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idOfDiscipline, nameOfDiscipline);
    }

    public long getIdOfDiscipline() {
        return idOfDiscipline;
    }

    public String getNameOfDiscipline() {
        return nameOfDiscipline;
    }

    public DisciplineEntity(long idOfDiscipline, String nameOfDiscipline) {
        this.idOfDiscipline = idOfDiscipline;
        this.nameOfDiscipline = nameOfDiscipline;
    }

    public void setIdOfDiscipline(long idOfDiscipline) {
        this.idOfDiscipline = idOfDiscipline;
    }

    public void setNameOfDiscipline(String nameOfDiscipline) {
        this.nameOfDiscipline = nameOfDiscipline;
    }
}
