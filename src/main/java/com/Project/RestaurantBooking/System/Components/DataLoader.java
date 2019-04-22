package com.Project.RestaurantBooking.System.Components;

import com.Project.RestaurantBooking.System.Models.Booking;
import com.Project.RestaurantBooking.System.Models.Customer;
import com.Project.RestaurantBooking.System.Models.Receipt;
import com.Project.RestaurantBooking.System.Models.RestaurantTable;
import com.Project.RestaurantBooking.System.Repositories.BookingRepositories.BookingRepository;
import com.Project.RestaurantBooking.System.Repositories.CustomerRepositories.CustomerRepository;
import com.Project.RestaurantBooking.System.Repositories.ReceiptRepositories.ReceiptRepository;
import com.Project.RestaurantBooking.System.Repositories.RestaurantTableRepositories.RestaurantTableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    RestaurantTableRepository restaurantTableRepository;

    @Autowired
    ReceiptRepository receiptRepository;

    Booking booking1;
    Booking booking2;

    public DataLoader(){

    }

    public void run(ApplicationArguments args){

//        ArrayList<Booking> bookings = new ArrayList<Booking>();
//        bookings.add(booking1);
//        bookings.add(booking2);
        Customer customer1 = new Customer("John");
        customerRepository.save(customer1);

        Customer customer2 = new Customer("Jay");
        customerRepository.save(customer2);

        RestaurantTable restaurantTable1 = new RestaurantTable(1);
        restaurantTableRepository.save(restaurantTable1);

        RestaurantTable restaurantTable2 = new RestaurantTable(2);
        restaurantTableRepository.save(restaurantTable2);

        RestaurantTable restaurantTable3 = new RestaurantTable(3);
        restaurantTableRepository.save(restaurantTable3);

        RestaurantTable restaurantTable4 = new RestaurantTable(4);
        restaurantTableRepository.save(restaurantTable4);

        RestaurantTable restaurantTable5 = new RestaurantTable(5);
        restaurantTableRepository.save(restaurantTable5);


        Booking booking1 = new Booking(3, 04, customer1, restaurantTable1);
        bookingRepository.save(booking1);

        Booking booking2 = new Booking(4, 05, customer2, restaurantTable2);
        bookingRepository.save(booking2);

        Booking booking3 = new Booking(4, 05, customer1, restaurantTable4);
        bookingRepository.save(booking3);

        Receipt receipt1 = new Receipt(30, booking1);
        receiptRepository.save(receipt1);

        Receipt receipt2 = new Receipt(40, booking2);
        receiptRepository.save(receipt2);

        booking1.setReceipt(receipt1);
        bookingRepository.save(booking1);

        booking2.setReceipt(receipt2);
        bookingRepository.save(booking2);


    }


}
