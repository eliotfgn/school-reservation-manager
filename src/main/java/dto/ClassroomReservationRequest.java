package dto;

import models.Classroom;
import models.User;

public class ClassroomReservationRequest extends ReservationRequest{
    private final Classroom classroom;
    public ClassroomReservationRequest(User user, Classroom classroom) {
        super(user, date);
        this.classroom = classroom;
    }

    public Classroom getClassroom() {
        return classroom;
    }
}
