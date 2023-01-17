package models;

import java.time.LocalDateTime;

public abstract class Reservation {
    private Long id;
    private LocalDateTime date;
    private ReservationStatus status;

    public Reservation(Long id, LocalDateTime date, ReservationStatus status) {
        this.id = id;
        this.date = date;
        this.status = status;
    }

    public Reservation() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public ReservationStatus getStatus() {
        return status;
    }

    public void setStatus(ReservationStatus status) {
        this.status = status;
    }
}
