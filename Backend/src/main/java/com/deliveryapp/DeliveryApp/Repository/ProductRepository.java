package com.deliveryapp.DeliveryApp.Repository;

import com.deliveryapp.DeliveryApp.Entity.Product;
import com.deliveryapp.DeliveryApp.Enum.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    @Query("SELECT p FROM Product p WHERE :category MEMBER OF p.categories")
    List<Product> findByCategory(@Param("category") ProductCategory category);
}
