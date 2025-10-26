package com.zakaria.billingservice.repository;

import com.zakaria.billingservice.entities.Bill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillRepository extends JpaRepository<Bill,Long> {
}
