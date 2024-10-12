package com.deliveryapp.DeliveryApp.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalTime;

@Entity
public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String address;
    private String phoneNumber;
    private String email;
    private LocalTime openTime;
    private LocalTime closeTime;
    private LocalTime orderOpenTime;
    private LocalTime orderCloseTime;
}
