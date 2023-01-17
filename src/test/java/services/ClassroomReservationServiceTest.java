package services;

import dto.ClassroomReservationRequest;
import models.Classroom;
import models.ERole;
import models.User;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class ClassroomReservationServiceTest {

    @Test
    void testReservationFromTeacher() {
        User testUser = new User(1L, "John", "Doe", "johndoe@gmail.com", "password", ERole.ROLE_TEACHER);
        Classroom testClassroom = new Classroom(1L, "A1", true);
        ClassroomReservationRequest request = new ClassroomReservationRequest(testUser, LocalDateTime.now(), testClassroom);

        assertEquals("Reservation successfully done!", ClassroomReservationService.getInstance().reserve(request));
    }

    @Test
    void testStudentCannotReserve() {
        User testUser = new User(1L, "John", "Doe", "johndoe@gmail.com", "password", ERole.ROLE_STUDENT);
        Classroom testClassroom = new Classroom(1L, "A1", true);
        ClassroomReservationRequest request = new ClassroomReservationRequest(testUser, LocalDateTime.now(), testClassroom);

        assertEquals("Could not reserve a class.", ClassroomReservationService.getInstance().reserve(request));
    }
}