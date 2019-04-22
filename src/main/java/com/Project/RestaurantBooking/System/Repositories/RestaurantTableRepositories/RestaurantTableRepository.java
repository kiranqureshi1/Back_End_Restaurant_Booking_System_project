package com.Project.RestaurantBooking.System.Repositories.RestaurantTableRepositories;

import com.Project.RestaurantBooking.System.Models.Receipt;
import com.Project.RestaurantBooking.System.Models.RestaurantTable;
import com.Project.RestaurantBooking.System.Projections.CustomerProjection;
import com.Project.RestaurantBooking.System.Projections.RestaurantTableProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = RestaurantTableProjection.class)
public interface RestaurantTableRepository extends JpaRepository<RestaurantTable, Long>, RestaurantTableRepositoryCustom {
}
