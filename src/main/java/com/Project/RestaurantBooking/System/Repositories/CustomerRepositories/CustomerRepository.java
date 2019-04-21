package com.Project.RestaurantBooking.System.Repositories.CustomerRepositories;

import com.Project.RestaurantBooking.System.Models.Booking;
import com.Project.RestaurantBooking.System.Models.Customer;
import com.Project.RestaurantBooking.System.Projections.BookingProjection;
import com.Project.RestaurantBooking.System.Projections.CustomerProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@RepositoryRestResource(excerptProjection = CustomerProjection.class)
public interface CustomerRepository extends JpaRepository<Customer, Long>, CustomerRepositoryCustom {
}
