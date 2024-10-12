package com.deliveryapp.DeliveryApp.DTO;

import com.deliveryapp.DeliveryApp.Entity.Product;
import com.deliveryapp.DeliveryApp.Entity.Restaurant;
import com.deliveryapp.DeliveryApp.Enum.ProductCategory;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
public class ProductDTO {

    private String name;
    private String description;
    private BigDecimal price;

    private Long restaurantId;

    private List<ProductCategory> categories;

}
