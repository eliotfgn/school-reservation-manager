package models;

import java.time.LocalDateTime;

public class ItemReservation extends Reservation {
    private Item item;

    public ItemReservation(Long id, LocalDateTime date, ReservationStatus status, Item item) {
        super(id, date, status);
        this.item = item;
    }

    public ItemReservation() {

    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
}
