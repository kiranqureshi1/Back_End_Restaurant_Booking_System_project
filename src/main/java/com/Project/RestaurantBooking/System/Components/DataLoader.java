package com.Project.RestaurantBooking.System.Components;

import com.Project.RestaurantBooking.System.Models.Booking;
import com.Project.RestaurantBooking.System.Models.Customer;
import com.Project.RestaurantBooking.System.Models.Reciept;
import com.Project.RestaurantBooking.System.Models.ResturantTable;
import com.Project.RestaurantBooking.System.Repositories.BookingRepositories.BookingRepository;
import com.Project.RestaurantBooking.System.Repositories.CustomerRepositories.CustomerRepository;
import com.Project.RestaurantBooking.System.Repositories.RecieptRepositories.RecieptRepository;
import com.Project.RestaurantBooking.System.Repositories.ResturantTableRepositories.ResturantTableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import javax.persistence.Table;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    ResturantTableRepository resturantTableRepository;

    @Autowired
    RecieptRepository recieptRepository;

    public DataLoader(){

    }

    public void run(ApplicationArguments args){
        Customer customer1 = new Customer("John");
        customerRepository.save(customer1);

        Customer customer2 = new Customer("Jay");
        customerRepository.save(customer2);

        ResturantTable resturantTable1 = new ResturantTable(1);
        resturantTableRepository.save(resturantTable1);

        ResturantTable resturantTable2 = new ResturantTable(2);
        resturantTableRepository.save(resturantTable2);

        Reciept reciept1 = new Reciept(30);
        recieptRepository.save(reciept1);

        Reciept reciept2 = new Reciept(40);
        recieptRepository.save(reciept2);

        Booking booking1 = new Booking(3, 04, customer1, resturantTable1, reciept1);
        bookingRepository.save(booking1);

        Booking booking2 = new Booking(4, 05, customer2, resturantTable2, reciept2);
        bookingRepository.save(booking2);
    }


}
