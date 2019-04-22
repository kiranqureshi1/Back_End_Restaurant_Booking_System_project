package com.Project.RestaurantBooking.System.Repositories.BookingRepositories;


import com.Project.RestaurantBooking.System.Models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long>, BookingRepositoryCustom{

    List<Booking> findBookingsByDate(int date);

    List<Booking> findBookingsByDateAndTime(int date, int time);

}
