package com.example.inventory_service.dto;

public record ProductRequestDTO (
        String id,
        String name,
        double price,
        int quantity,
        Long categoryId

){}


