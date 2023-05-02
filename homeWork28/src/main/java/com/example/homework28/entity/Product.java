package com.example.homework28.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double cost;
    @ManyToOne()
    @JoinColumn(name = "order_id", referencedColumnName = "id")
    private Order order;
}
