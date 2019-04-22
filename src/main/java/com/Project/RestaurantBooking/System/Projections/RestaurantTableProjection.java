package com.Project.RestaurantBooking.System.Projections;

import com.Project.RestaurantBooking.System.Models.Booking;
import com.Project.RestaurantBooking.System.Models.RestaurantTable;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name= "embedBookings", types = RestaurantTable.class)
public interface RestaurantTableProjection {
    long getId();
    List<BookingProjection> getBookings();
    int getTableNumber();
}