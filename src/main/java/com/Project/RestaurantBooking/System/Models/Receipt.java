package com.Project.RestaurantBooking.System.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.persistence.Table;

@Entity
@Table(name = "receipts")
public class Receipt {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private int amount;

    @JsonIgnore
    @OneToOne
    @JoinColumn(name = "booking_id", nullable = false)
    private Booking booking;

    public Receipt(int amount, Booking booking) {
        this.amount = amount;
        this.booking = booking;
    }

    public Receipt(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
