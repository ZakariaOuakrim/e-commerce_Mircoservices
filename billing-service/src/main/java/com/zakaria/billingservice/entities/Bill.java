package com.zakaria.billingservice.entities;

import com.zakaria.billingservice.model.Customer;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@AllArgsConstructor @NoArgsConstructor @Getter @Setter @Builder
public class Bill {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private Date date;
    private long customerId;
    @OneToMany(mappedBy = "bill")
    private List<ProductItem> productItems=new ArrayList<>();
    @Transient private Customer customer;//@Transient means that this attribute exist in the class but not in the database so JPA won't do anything to it
}
