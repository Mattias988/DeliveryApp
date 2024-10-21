package com.deliveryapp.DeliveryApp.Controller;

import com.deliveryapp.DeliveryApp.DTO.ProductDTO;
import com.deliveryapp.DeliveryApp.DTO.RestaurantDTO;
import com.deliveryapp.DeliveryApp.Entity.Product;
import com.deliveryapp.DeliveryApp.Entity.Restaurant;
import com.deliveryapp.DeliveryApp.Service.ProductService;
import com.deliveryapp.DeliveryApp.Service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class RestaurantController {

    @Autowired
    private RestaurantService restaurantService;

    @PostMapping("/restaurant")
    public ResponseEntity<Restaurant> createRestaurant(@RequestBody Restaurant restaurant) {
        restaurantService.addRestaurant(restaurant);
        return ResponseEntity.status(HttpStatus.CREATED).body(restaurant);
    }

    @GetMapping("/restaurant/{restaurantId}")
    public ResponseEntity<Restaurant> getRestaurant(@PathVariable Long restaurantId) {
        Optional<Restaurant> restaurant = restaurantService.getRestaurant(restaurantId);

        return restaurant.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }

    @GetMapping("/restaurant")
    public ResponseEntity<List<Restaurant>> getAllRestaurants() {
        List<Restaurant> restaurants = restaurantService.getAllRestaurants();

        return ResponseEntity.ok(restaurants);
    }

    @PutMapping("/restaurant/{restaurantId}")
    public ResponseEntity<Restaurant> updateRestaurant(@PathVariable Long restaurantId, @RequestBody RestaurantDTO restaurantDTO) {
        Restaurant restaurants = restaurantService.updateRestaurant(restaurantId, restaurantDTO);
        return ResponseEntity.ok(restaurants);
    }

    @DeleteMapping("/restaurant/{restaurantId}")
    public void deleteRestaurant(@PathVariable Long restaurantId) {
        restaurantService.deleteRestaurant(restaurantId);
    }
}
