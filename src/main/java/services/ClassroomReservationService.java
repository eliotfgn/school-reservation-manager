package services;

import dto.ClassroomReservationRequest;
import models.ClassroomReservation;
import models.ERole;
import models.Reservation;
import models.ReservationStatus;

import java.util.Random;

public class ClassroomReservationService implements ReservationService{

    public String reserve(ClassroomReservationRequest request) {
        Random random = new Random();
        ClassroomReservation reservation;

        if (request.getUser().getRole() != ERole.ROLE_STUDENT) {
            reservation = new ClassroomReservation(random.nextLong(),
                    request.getDate(),
                    ReservationStatus.NOT_STARTED,
                    request.getClassroom());
        } else {
            return "Could not reserve a class.";
        }

        return "Reservation successfully done!";
    }
}
