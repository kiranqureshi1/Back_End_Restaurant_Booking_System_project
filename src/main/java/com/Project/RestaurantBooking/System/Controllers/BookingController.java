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

    @GetMapping(value = "/day/{day}")
    public List<Booking> findBookingsByDay(@PathVariable int day) {
        return bookingRepo.findBookingsByDay(day);
    }

    @GetMapping(value = "/day/{day}/month/{month}")
    public List<Booking> findBookingsByDayAndTime(@PathVariable int day,
                                                   @PathVariable int month) {
        return bookingRepo.findBookingsByDayAndMonth(day, month);
    }

    @GetMapping(value = "/day/{day}/month/{month}/time/{time}")
    public List<Booking> findBookingsByDayAndMonthAndTime(@PathVariable int day, @PathVariable int month,
                                                          @PathVariable int time) {
        return bookingRepo.findBookingsByDayAndMonthAndTime(day, month, time);
    }
}
