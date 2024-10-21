package com.deliveryapp.DeliveryApp.Service;

import com.deliveryapp.DeliveryApp.DTO.RestaurantDTO;
import com.deliveryapp.DeliveryApp.Entity.Restaurant;
import com.deliveryapp.DeliveryApp.Repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RestaurantService {

    @Autowired
    private RestaurantRepository restaurantRepository;

    public Restaurant addRestaurant(Restaurant restaurant) {
        return restaurantRepository.save(restaurant);
    }

    public Optional<Restaurant> getRestaurant(Long restaurantId) {
        return restaurantRepository.findById(restaurantId);
    }

    public List<Restaurant> getAllRestaurants() {
        return restaurantRepository.findAll();
    }

    public Restaurant updateRestaurant(Long restaurantId, RestaurantDTO restaurantDTO) {
        Restaurant restaurant = restaurantRepository.findById(restaurantId)
                .orElseThrow(() -> new RuntimeException("Restaurant not found!"));
        restaurant.setAddress(restaurantDTO.getAddress());
        restaurant.setName(restaurantDTO.getName());
        restaurant.setEmail(restaurantDTO.getEmail());
        restaurant.setCloseTime(restaurantDTO.getCloseTime());
        restaurant.setOpenTime(restaurantDTO.getOpenTime());
        restaurant.setOrderCloseTime(restaurantDTO.getOrderCloseTime());
        restaurant.setOrderOpenTime(restaurantDTO.getOrderOpenTime());
        return restaurantRepository.save(restaurant);
    }

    public void deleteRestaurant(Long restaurantId) {
        Restaurant restaurant = restaurantRepository.findById(restaurantId)
                .orElseThrow(() -> new RuntimeException("Restaurant not found!"));
        restaurantRepository.delete(restaurant);
    }
}
