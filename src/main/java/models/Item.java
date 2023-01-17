package models;

import java.util.List;

public class Item {
    private Long id;
    private String name;
    private Integer availableQty;
    private ItemType type;
    private List<Reservation> reservations;
}
