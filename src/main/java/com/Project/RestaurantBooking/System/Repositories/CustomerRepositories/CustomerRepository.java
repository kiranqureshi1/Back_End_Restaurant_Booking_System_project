package com.Project.RestaurantBooking.System.Repositories.CustomerRepositories;

import com.Project.RestaurantBooking.System.Models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>, CustomerRepositoryCustom {
}
