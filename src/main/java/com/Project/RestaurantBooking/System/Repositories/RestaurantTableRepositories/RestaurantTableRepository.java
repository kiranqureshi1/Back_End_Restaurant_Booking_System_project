package com.Project.RestaurantBooking.System.Repositories.RestaurantTableRepositories;

import com.Project.RestaurantBooking.System.Models.RestaurantTable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantTableRepository extends JpaRepository<RestaurantTable, Long>, RestaurantTableRepositoryCustom {
}
