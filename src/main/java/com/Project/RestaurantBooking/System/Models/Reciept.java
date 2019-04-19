package com.Project.RestaurantBooking.System.Models;

import javax.persistence.*;
import javax.persistence.Table;

@Entity
@Table(name = "reciepts")
public class Reciept {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private int amount;

    public Reciept(int amount) {
        this.amount = amount;
    }

    public Reciept(){

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
