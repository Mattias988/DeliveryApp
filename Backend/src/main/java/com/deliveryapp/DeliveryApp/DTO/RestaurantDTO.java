package com.deliveryapp.DeliveryApp.DTO;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalTime;

@Getter
@Setter
public class RestaurantDTO {
    private String name;
    private String address;
    private String phoneNumber;
    private String email;
    private LocalTime openTime;
    private LocalTime closeTime;
    private LocalTime orderOpenTime;
    private LocalTime orderCloseTime;
}
