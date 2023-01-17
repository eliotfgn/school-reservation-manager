package models;

import java.util.ArrayList;
import java.util.List;

public class Classroom {
    private Long id;
    private String name;
    private Boolean isAvailable;
    private List<Reservation> reservations;

    public Classroom(Long id, String name, Boolean isAvailable) {
        this.id = id;
        this.name = name;
        this.isAvailable = isAvailable;
        this.reservations = new ArrayList<>();
    }

    public Classroom() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getAvailable() {
        return isAvailable;
    }

    public void setAvailable(Boolean available) {
        isAvailable = available;
    }

    public void addReservation(Reservation reservation) {
        reservations.add(reservation);
    }
}
