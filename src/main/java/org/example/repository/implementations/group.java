package org.example.repository.implementations;

import org.example.entities.GroupOfStudentsEntity;
import org.example.repository.GroupOfStudents;

import java.util.List;
import java.util.stream.Collectors;

public class group implements GroupOfStudents {

    List<GroupOfStudentsEntity> groupOfStudents;

    @Override
    public long add(GroupOfStudentsEntity group) {
        try {
            if (group.getIdOfGroup() == 0) {
                long newId = groupOfStudents.size() + 1;
                group.setIdOfGroup(newId);
                groupOfStudents.add(group);
            }
            else {
                groupOfStudents.removeIf(existingStudent -> existingStudent.getIdOfGroup() == group.getIdOfGroup());
                groupOfStudents.add(group);
            }
            return group.getIdOfGroup();
        } catch (Exception e) {
            throw new RuntimeException("Error while adding a group", e);
        }
    }

    @Override
    public void deleteById(Long id) {
        try {
            groupOfStudents.removeIf(existingGroup -> existingGroup.getIdOfGroup() == id);
        } catch (Exception e){
            throw new RuntimeException("Error while removing a group", e);
        }
    }

    @Override
    public GroupOfStudentsEntity getById(Long id) {
        try {
            return groupOfStudents.stream().filter(existingGroup -> existingGroup.
                    getIdOfGroup() == id).findFirst().orElseThrow(() ->
                    new IllegalArgumentException("Group with id " + id + " not found"));
        } catch (Exception e) {
            throw new RuntimeException("Error, on get group by id");
        }
    }

    @Override
    public List<GroupOfStudentsEntity> findAll() {
        try {
            return this.groupOfStudents;
        }catch (Exception e) {
            throw new RuntimeException("db error, on getGroups", e);
        }
    }
}
