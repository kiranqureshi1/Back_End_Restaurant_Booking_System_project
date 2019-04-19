package com.Project.RestaurantBooking.System.Repositories.RecieptRepositories;

import com.Project.RestaurantBooking.System.Models.Reciept;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecieptRepository extends JpaRepository<Reciept, Long>, RecieptRepositoryCustom {
}
