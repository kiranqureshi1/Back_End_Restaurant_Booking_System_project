package com.Project.RestaurantBooking.System.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import javax.persistence.Table;

@Entity
@Table(name = "bookings")
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private int time;

    @Column
    private int date;

    @JsonIgnoreProperties("bookings")
    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;

    @JsonIgnoreProperties("bookings")
    @ManyToOne
    @JoinColumn(name = "restaurantTable_id", nullable = false)
    private RestaurantTable restaurantTable;

    @Column
    private boolean bookingStatus;

    @JsonIgnore
    @OneToOne
    @JoinColumn(name = "receipt_id")
    private Receipt receipt;

    public Booking(int time, int date, Customer customer, RestaurantTable restaurantTable, boolean bookingStatus) {
        this.time = time;
        this.date = date;
        this.customer = customer;
        this.restaurantTable = restaurantTable;
        this.bookingStatus = bookingStatus;
    }

    public Booking(){

    }

    public boolean isBookingStatus() {
        return bookingStatus;
    }

    public void setBookingStatus(boolean bookingStatus) {
        this.bookingStatus = bookingStatus;
    }

    public boolean dontAllowDoubleBooking(){
        if(this.bookingStatus == true){
            return false;
        }return true;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public RestaurantTable getRestaurantTable() {
        return restaurantTable;
    }

    public void setRestaurantTable(RestaurantTable restaurantTable) {
        this.restaurantTable = restaurantTable;
    }

    public Receipt getReceipt() {
        return receipt;
    }

    public void setReceipt(Receipt receipt) {
        this.receipt = receipt;
    }
}
