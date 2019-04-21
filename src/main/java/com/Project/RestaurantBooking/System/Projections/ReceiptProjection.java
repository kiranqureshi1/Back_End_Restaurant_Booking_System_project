package com.Project.RestaurantBooking.System.Projections;


import com.Project.RestaurantBooking.System.Models.Booking;
import com.Project.RestaurantBooking.System.Models.Receipt;
import org.springframework.data.rest.core.config.Projection;

@Projection(name= "embedBooking", types = Receipt.class)
public interface ReceiptProjection {
    long getId();
    int getAmount();
    Booking getBooking();
}
