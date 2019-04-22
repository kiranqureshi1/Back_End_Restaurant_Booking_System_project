package com.Project.RestaurantBooking.System.Repositories.ReceiptRepositories;

import com.Project.RestaurantBooking.System.Models.Receipt;
import com.Project.RestaurantBooking.System.Projections.CustomerProjection;
import com.Project.RestaurantBooking.System.Projections.ReceiptProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = ReceiptProjection.class)
public interface ReceiptRepository extends JpaRepository<Receipt, Long>, ReceiptRepositoryCustom {
}

