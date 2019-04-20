package com.Project.RestaurantBooking.System.Repositories.CustomerRepositories;

import com.Project.RestaurantBooking.System.Models.Booking;
import com.Project.RestaurantBooking.System.Models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>, CustomerRepositoryCustom {
}
