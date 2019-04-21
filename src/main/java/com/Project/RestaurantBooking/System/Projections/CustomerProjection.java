package com.Project.RestaurantBooking.System.Projections;

import com.Project.RestaurantBooking.System.Models.Booking;
import com.Project.RestaurantBooking.System.Models.Customer;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name= "embedBookings", types = Customer.class)
public interface CustomerProjection {
    long getId();
    String getName();
    List<BookingProjection> getBookings();

}