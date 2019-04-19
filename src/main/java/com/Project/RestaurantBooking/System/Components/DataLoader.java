package com.Project.RestaurantBooking.System.Components;

import com.Project.RestaurantBooking.System.Models.Customer;
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
    }


}
