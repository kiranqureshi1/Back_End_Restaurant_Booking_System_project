package com.Project.RestaurantBooking.System.Repositories.ResturantTableRepositories;

import com.Project.RestaurantBooking.System.Models.ResturantTable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResturantTableRepository extends JpaRepository<ResturantTable, Long>, ResturantTableRepositoryCustom {
}
