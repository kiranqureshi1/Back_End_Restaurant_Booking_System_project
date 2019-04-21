package com.Project.RestaurantBooking.System;

import com.Project.RestaurantBooking.System.Models.Booking;
import com.Project.RestaurantBooking.System.Repositories.BookingRepositories.BookingRepository;
import com.Project.RestaurantBooking.System.Repositories.CustomerRepositories.CustomerRepository;
import com.Project.RestaurantBooking.System.Repositories.ReceiptRepositories.ReceiptRepository;
import com.Project.RestaurantBooking.System.Repositories.RestaurantTableRepositories.RestaurantTableRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RestaurantBookingSystemApplicationTests {

	@Autowired
	BookingRepository bookingRepository;

	@Autowired
	CustomerRepository customerRepository;

	@Autowired
	RestaurantTableRepository restaurantTableRepository;

	@Autowired
	ReceiptRepository receiptRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void canGetBookingsByDate(){
		List<Booking> found = bookingRepository.findBookingByDate(05);
		assertEquals(1, found.size());
		assertEquals(2, found.get(0).getId(), 0);
	}

}
