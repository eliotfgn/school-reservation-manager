package models;

import java.time.LocalDateTime;

public abstract class Reservation {
    private Long id;
    private LocalDateTime startAt;
    private LocalDateTime endAt;
    private ReservationStatus status;

    public Reservation(Long id, LocalDateTime startAt, LocalDateTime endAt, ReservationStatus status) {
        this.id = id;
        this.startAt = startAt;
        this.endAt = endAt;
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

    public ReservationStatus getStatus() {
        return status;
    }

    public void setStatus(ReservationStatus status) {
        this.status = status;
    }

    public LocalDateTime getStartAt() {
        return startAt;
    }

    public void setStartAt(LocalDateTime startAt) {
        this.startAt = startAt;
    }

    public LocalDateTime getEndAt() {
        return endAt;
    }

    public void setEndAt(LocalDateTime endAt) {
        this.endAt = endAt;
    }
}
