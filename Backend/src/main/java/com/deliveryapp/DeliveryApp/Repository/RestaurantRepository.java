package com.deliveryapp.DeliveryApp.Repository;

import com.deliveryapp.DeliveryApp.Entity.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {
}
