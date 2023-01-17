package dto;

import models.Classroom;
import models.User;

import java.time.LocalDateTime;

public class ClassroomReservationRequest extends ReservationRequest{
    private final Classroom classroom;
    public ClassroomReservationRequest(User user, LocalDateTime date, Classroom classroom) {
        super(user, date);
        this.classroom = classroom;
    }

    public Classroom getClassroom() {
        return classroom;
    }
}
