package com.Project.RestaurantBooking.System.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import javax.persistence.Table;
import java.awt.print.Book;

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
    @JoinColumn(name = "resturantTable_id", nullable = false)
    private ResturantTable resturantTable;

    @JsonIgnore
    @OneToOne
    @JoinColumn(name = "reciept_id", nullable = false)
    private Reciept reciept;

    public Booking(int time, int date, Customer customer, ResturantTable resturantTable, Reciept reciept) {
        this.time = time;
        this.date = date;
        this.customer = customer;
        this.resturantTable = resturantTable;
        this.reciept = reciept;
    }

    public Booking(){

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

    public ResturantTable getResturantTable() {
        return resturantTable;
    }

    public void setResturantTable(ResturantTable resturantTable) {
        this.resturantTable = resturantTable;
    }

    public Reciept getReciept() {
        return reciept;
    }

    public void setReciept(Reciept reciept) {
        this.reciept = reciept;
    }
}
