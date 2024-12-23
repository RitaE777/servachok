package org.example.repository.implementations;

import org.example.entities.DisciplineEntity;
import org.example.repository.Discipline;

import java.util.List;

public class discipline implements Discipline {

    List<DisciplineEntity> disciplines;

    @Override
    public long add(DisciplineEntity discipline) {
        try {
            if(discipline.getIdOfDiscipline() == 0){
                long newId = disciplines.size() + 1;
                discipline.setIdOfDiscipline(newId);
                disciplines.add(discipline);
            }
            else {
                disciplines.removeIf(existingDiscipline -> existingDiscipline.getIdOfDiscipline() == discipline.getIdOfDiscipline());
                disciplines.add(discipline);
            }
            return discipline.getIdOfDiscipline();
        } catch (Exception e) {
            throw new RuntimeException("Error while adding a teacher", e);
        }
    }

    @Override
    public void deleteById(long id) {
        try {
            disciplines.removeIf(existingDiscipline -> existingDiscipline.getIdOfDiscipline() == id);
        } catch (Exception e){
            throw new RuntimeException("Error while removing a discipline", e);
        }
    }

    @Override
    public DisciplineEntity getById(long id) {
        try {
            return disciplines.stream().filter(existingDiscipline -> existingDiscipline.
                    getIdOfDiscipline() == id).findFirst().orElseThrow(() ->
                    new IllegalArgumentException("Discipline with id " + id + " not found"));
        } catch (Exception e) {
            throw new RuntimeException("Error, on get discipline by id");
        }
    }

    @Override
    public List<DisciplineEntity> findAll() {
        return disciplines;
    }
}
