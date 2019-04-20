package com.Project.RestaurantBooking.System.Controllers;


import com.Project.RestaurantBooking.System.Models.Booking;
import com.Project.RestaurantBooking.System.Repositories.BookingRepositories.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.print.Book;
import java.util.List;

@RestController
@RequestMapping(value = "/bookings")
public class BookingController {

    @Autowired
    BookingRepository bookingRepository;

    @GetMapping(value = "/date/{date}")
    public List<Booking> findBookingForGivenDate(int date){
        return bookingRepository.findBookingByDate(date);
    }
}
