package com.Project.RestaurantBooking.System.Repositories.BookingRepositories;


import com.Project.RestaurantBooking.System.Models.Booking;
import com.Project.RestaurantBooking.System.Projections.BookingProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(excerptProjection = BookingProjection.class)
public interface BookingRepository extends JpaRepository<Booking, Long>, BookingRepositoryCustom{
}
