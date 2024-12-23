package org.example.repository.implementations;

import org.example.entities.StudentEntity;
import org.example.repository.StudentRepository;

import java.util.List;
import java.util.stream.Collectors;

public class student implements StudentRepository {
    List<StudentEntity> students;

    @Override
    public long add(StudentEntity student) {
        try {
            if(student.getIdOfStudent() == 0){
                long newId = students.size() + 1;
                student.setIdOfStudent(newId);
                students.add(student);
            }
            else {
                students.removeIf(existingStudent -> existingStudent.getIdOfStudent() == student.getIdOfStudent());
                students.add(student);
            }
            return student.getIdOfStudent();
        } catch (Exception e) {
            throw new RuntimeException("Error while adding a student");
        }
    }

    @Override
    public void deleteById(long id) {
        try {
            students.removeIf(existingStudent -> existingStudent.getIdOfStudent() == id);
        } catch (Exception e){
            throw new RuntimeException("Error while removing a student");
        }

    }

    @Override
    public StudentEntity getById(long id) {
        try {
            return students.stream().filter(existingStudent -> existingStudent.
                    getIdOfStudent() == id).findFirst().orElseThrow(() ->
                    new IllegalArgumentException("Student with id " + id + " not found"));
        } catch (Exception e) {
            throw new RuntimeException("Error, on get student by id");
        }
    }

    @Override
    public List<StudentEntity> getAll(long groupId) {
        try {
            return students.stream().
                    filter(student -> student.getGroup().getIdOfGroup() == groupId).collect(Collectors.toList());
        } catch (Exception e) {
            throw new RuntimeException("Error on get student by group");
        }
    }

}
