package com.Project.RestaurantBooking.System.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "resturantTables")
public class ResturantTable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonIgnore
    @OneToMany(mappedBy = "resturantTable", fetch = FetchType.LAZY)
    private List<Booking> bookings;

    @Column
    private int tableNumber;

    public ResturantTable(int tableNumber) {
        this.tableNumber = tableNumber;
    }

    public ResturantTable(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(List<Booking> bookings) {
        this.bookings = bookings;
    }

    public int getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(int tableNumber) {
        this.tableNumber = tableNumber;
    }


}
