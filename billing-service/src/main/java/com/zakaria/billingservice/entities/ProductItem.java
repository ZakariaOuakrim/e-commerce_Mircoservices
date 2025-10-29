package com.zakaria.billingservice.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.zakaria.billingservice.model.Product;
import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor @NoArgsConstructor @Getter @Setter @Builder
public class ProductItem {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String productId;
    @ManyToOne
    //when I see a productItem it will not be serialized to json
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Bill bill;
    private int quantity;
    private double unitPrice;
    @Transient private Product product;
}
