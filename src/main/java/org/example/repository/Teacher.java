package org.example.repository;

import org.example.entities.TeacherEntity;

import java.util.List;

public interface Teacher {
    Long add(TeacherEntity entity);

    void deleteById(Long id);

    TeacherEntity getById(Long id);

    List<TeacherEntity> findAll();
}
