package com.example.configureswagger.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Table(name = "product")
public class Product {

    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private Integer stock;
    private Long price;

    public Product (String name, String description, Integer stock, Long price) {
        this.name = name;
        this.description = description;
        this.stock = stock;
        this.price = price;
    }
}
