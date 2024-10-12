package com.deliveryapp.DeliveryApp.Entity;

import com.deliveryapp.DeliveryApp.Enum.ProductCategory;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
@Entity
public class Product {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String name;
        private String description;
        private BigDecimal price;

        @ManyToOne
        @JoinColumn(name = "restaurant_id")
        private Restaurant restaurant;

        @ElementCollection(targetClass = ProductCategory.class)
        @CollectionTable(name = "product_categories", joinColumns = @JoinColumn(name = "product_id"))
        @Column(name = "category")
        @Enumerated(EnumType.STRING)
        private List<ProductCategory> categories;

}
