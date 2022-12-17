package com.example.inventory_service.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity @AllArgsConstructor @NoArgsConstructor @Builder
public class Product {

    @Id
    private String id;
    private String name;
    private double price;
    private int quantity;
    @ManyToOne
    private Category category;
}
