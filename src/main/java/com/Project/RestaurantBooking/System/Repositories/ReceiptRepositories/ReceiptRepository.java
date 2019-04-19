package com.Project.RestaurantBooking.System.Repositories.ReceiptRepositories;

import com.Project.RestaurantBooking.System.Models.Receipt;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReceiptRepository extends JpaRepository<Receipt, Long>, ReceiptRepositoryCustom {
}

