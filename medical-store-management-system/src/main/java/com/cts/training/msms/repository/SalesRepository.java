package com.cts.training.msms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.training.msms.entity.Sales;

@Repository
public interface SalesRepository extends JpaRepository<Sales, Long> {

}
