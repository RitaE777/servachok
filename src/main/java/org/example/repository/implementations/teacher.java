package org.example.repository.implementations;

import org.example.entities.TeacherEntity;
import org.example.repository.Teacher;

import java.util.List;

public class teacher implements Teacher {

    List<TeacherEntity> teachers;

    @Override
    public Long add(TeacherEntity teacher) {
        try {
            if(teacher.getIdOfTeacher() == 0){
                long newId = teachers.size() + 1;
                teacher.setIdOfTeacher(newId);
                teachers.add(teacher);
            }
            else {
                teachers.removeIf(existingTeacher -> existingTeacher.getIdOfTeacher() == teacher.getIdOfTeacher());
                teachers.add(teacher);
            }
            return teacher.getIdOfTeacher();
        } catch (Exception e) {
            throw new RuntimeException("Error while adding a teacher", e);
        }
    }

    @Override
    public void deleteById(Long id) {
        try {
            teachers.removeIf(existingTeacher -> existingTeacher.getIdOfTeacher() == id);
        } catch (Exception e){
            throw new RuntimeException("Error while removing a teacher", e);
        }
    }

    @Override
    public TeacherEntity getById(Long id) {
        try {
            return teachers.stream().filter(existingTeacher -> existingTeacher.
                    getIdOfTeacher() == id).findFirst().orElseThrow(() ->
                    new IllegalArgumentException("Teacher with id " + id + " not found"));
        } catch (Exception e) {
            throw new RuntimeException("Error, on get teacher by id");
        }
    }

    @Override
    public List<TeacherEntity> findAll() {
        return teachers;
    }
}
