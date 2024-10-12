package com.deliveryapp.DeliveryApp.Service;

import com.deliveryapp.DeliveryApp.DTO.ProductDTO;
import com.deliveryapp.DeliveryApp.Entity.Restaurant;
import com.deliveryapp.DeliveryApp.Repository.ProductRepository;
import com.deliveryapp.DeliveryApp.Repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.deliveryapp.DeliveryApp.Entity.Product;
import com.deliveryapp.DeliveryApp.Enum.ProductCategory;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private RestaurantRepository restaurantRepository;

    public List<Product> getProductsByCategory(ProductCategory category) {
        return productRepository.findByCategory(category);
    }

    public Product addProduct(ProductDTO productDTO) {
        Product product = new Product();
        product.setCategories(productDTO.getCategories());
        product.setDescription(productDTO.getDescription());
        product.setName(productDTO.getName());
        Restaurant restaurant = restaurantRepository.findById(productDTO.getRestaurantId()).orElseThrow(() -> new RuntimeException("Restaurant not found!"));
        product.setRestaurant(restaurant);
        product.setCategories(productDTO.getCategories());
        return productRepository.save(product);
    }

    public Optional<Product> getProduct(Long productId) {
        return productRepository.findById(productId);
    }
}
