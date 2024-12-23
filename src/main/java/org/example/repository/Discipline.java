package org.example.repository;

import org.example.entities.DisciplineEntity;

import java.util.List;

public interface Discipline{

    long add(DisciplineEntity entity);

    void deleteById(long id);

    DisciplineEntity getById(long id);

    List<DisciplineEntity> findAll();
}
