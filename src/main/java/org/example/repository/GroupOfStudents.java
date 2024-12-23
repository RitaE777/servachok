package org.example.repository;

import org.example.entities.GroupOfStudentsEntity;

import java.util.List;

public interface GroupOfStudents {

    long add(GroupOfStudentsEntity entity);

    void deleteById(Long id);

    GroupOfStudentsEntity getById(Long id);

    List<GroupOfStudentsEntity> findAll();
}
