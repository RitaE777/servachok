package org.example.repository;

import org.example.entities.StudentEntity;

import java.util.List;

public interface StudentRepository {
    long add(StudentEntity student);

    void deleteById(long id);

    StudentEntity getById(long id);

    List<StudentEntity> getAll(long groupId);
}
