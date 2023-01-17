package services;

import dto.ClassroomReservationRequest;
import models.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ClassroomReservationService implements ReservationService{
    private static final List<ClassroomReservation> reservations = new ArrayList<>();

    private static ClassroomReservationService instance;
    public static ClassroomReservationService getInstance() {
        if (instance == null) {
            instance = new ClassroomReservationService();
        }
        return instance;
    }

    public String reserve(ClassroomReservationRequest request) {
        Random random = new Random();
        ClassroomReservation reservation;

        if (request.getUser().getRole() != ERole.ROLE_STUDENT) {
            reservation = new ClassroomReservation(random.nextLong(),
                    request.getDate(),
                    ReservationStatus.NOT_STARTED,
                    request.getClassroom());
            request.getUser().addReservation(reservation);
            request.getClassroom().addReservation(reservation);
            reservations.add(reservation);
        } else {
            return "Could not reserve a class.";
        }

        return "Reservation successfully done!";
    }

    public static List<ClassroomReservation> getReservations() {
        return reservations;
    }
}
