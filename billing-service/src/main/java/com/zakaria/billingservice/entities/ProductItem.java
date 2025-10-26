package com.zakaria.billingservice.entities;

import com.zakaria.billingservice.model.Product;
import jakarta.persistence.*;

@Entity
public class ProductItem {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String productId;
    @ManyToOne
    private Bill bill;
    private int quantity;
    private double unitPrice;
    @Transient private Product product;
}
