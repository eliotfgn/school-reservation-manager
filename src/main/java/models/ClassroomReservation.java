package models;

import java.time.LocalDateTime;

public class ClassroomReservation extends Reservation {
    private Classroom classroom;

    public ClassroomReservation(Long id, LocalDateTime date, ReservationStatus status, Classroom classroom) {
        super(id, date, status);
        this.classroom = classroom;
    }

    public ClassroomReservation() {
    }

    public Classroom getClassroom() {
        return classroom;
    }

    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }
}
