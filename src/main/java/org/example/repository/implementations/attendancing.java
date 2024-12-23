package org.example.repository.implementations;

import org.example.entities.AttendancingOfLessonEntity;
import org.example.repository.AttendancingRepository;

import java.util.List;

public class attendancing implements AttendancingRepository {

    List<AttendancingOfLessonEntity> attendances;

    @Override
    public long add(AttendancingOfLessonEntity attendingLesson) {
        try {
            if(attendingLesson.getIdOfAttendance() == 0){
                long newId = attendances.size() + 1;
                attendingLesson.setIdOfAttendance(newId);
                attendances.add(attendingLesson);
            }
            else {
                attendances.removeIf(existingAttendance -> existingAttendance.getIdOfAttendance() == attendingLesson.getIdOfAttendance());
                attendances.add(attendingLesson);
            }
            return attendingLesson.getIdOfAttendance();
        } catch (Exception e) {
            throw new RuntimeException("Error while adding an attendance", e);
        }
    }

    @Override
    public void deleteById(long id) {
        try {
            attendances.removeIf(existingAttendance -> existingAttendance.getIdOfAttendance() == id);
        } catch (Exception e){
            throw new RuntimeException("Error while removing an attendance", e);
        }
    }

    @Override
    public AttendancingOfLessonEntity getById(long id) {
        try {
            return attendances.stream().filter(existingAttendance -> existingAttendance.
                    getIdOfAttendance() == id).findFirst().orElseThrow(() ->
                    new IllegalArgumentException("Attendance with id " + id + " not found"));
        } catch (Exception e) {
            throw new RuntimeException("Error, on get attendance by id");
        }
    }

    @Override
    public long addByLessonId(long lessonId, AttendancingOfLessonEntity attendingLesson) {
        try{
            long newId = attendances.size() + 1;
            if(attendingLesson.getIdOfAttendance() == 0){
                attendingLesson.setIdOfAttendance(newId);
                attendingLesson.setIdOfLesson(lessonId);
                attendances.add(attendingLesson);
            }
            else {
                attendances.removeIf(oldAttendance -> oldAttendance.getIdOfLesson() == lessonId);
                attendances.add(attendingLesson);
            }
            return attendingLesson.getIdOfAttendance();

        } catch (Exception e) {
            throw new RuntimeException("Error while adding an attendance", e);
        }
    }

    @Override
    public void removeByLessonId(long lessonId) {
        try {
            attendances.removeIf(attendancingOfLessonEntity -> attendancingOfLessonEntity.getIdOfLesson() == lessonId);
        } catch (Exception e){
            throw new RuntimeException("Error while removing an attendance", e);
        }
    }
}
