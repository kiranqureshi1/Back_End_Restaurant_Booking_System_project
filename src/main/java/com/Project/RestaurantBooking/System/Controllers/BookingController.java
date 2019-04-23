package com.Project.RestaurantBooking.System.Controllers;


import com.Project.RestaurantBooking.System.Models.Booking;
import com.Project.RestaurantBooking.System.Repositories.BookingRepositories.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/bookings")
public class BookingController {

    @Autowired
    BookingRepository bookingRepo;

    @GetMapping(value = "/date/{date}")
    public List<Booking> findBookingsByDate(@PathVariable int date) {
        return bookingRepo.findBookingsByDate(date);
    }

    @GetMapping(value = "/date/{date}/time/{time}")
    public List<Booking> findBookingsByDateAndTime(@PathVariable int date, @PathVariable int time) {
        return bookingRepo.findBookingsByDateAndTime(date, time);
    }
}
