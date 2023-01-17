package dto;

import models.User;

import java.time.LocalDateTime;

public abstract class ReservationRequest {
    private final User user;
    private final LocalDateTime date;

    public ReservationRequest(User user, LocalDateTime date) {
        this.user = user;
        this.date = date;
    }

    public User getUser() {
        return user;
    }

    public LocalDateTime getDate() {
        return date;
    }
}
