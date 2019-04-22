package com.Project.RestaurantBooking.System.Projections;


import com.Project.RestaurantBooking.System.Models.Booking;
import com.Project.RestaurantBooking.System.Models.Customer;
import com.Project.RestaurantBooking.System.Models.Receipt;
import com.Project.RestaurantBooking.System.Models.RestaurantTable;
import org.springframework.data.rest.core.config.Projection;

@Projection(name= "embedCustomer", types = Booking.class)
public interface BookingProjection {
    long getId();
    int getTime();
    int getDate();
    Customer getCustomer();
    RestaurantTable getRestaurantTable();
    int getReceipt();
}
