package com.zakaria.billingservice.repository;

import com.zakaria.billingservice.entities.ProductItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductItemRepository extends JpaRepository<ProductItem,Long> {
}
