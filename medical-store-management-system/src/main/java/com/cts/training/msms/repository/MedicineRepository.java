package com.cts.training.msms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.training.msms.entity.Medicine;

@Repository
public interface MedicineRepository extends JpaRepository<Medicine, Long> {

	Medicine findByCategory(String category);

	Medicine findByName(String name);
	
	Medicine findByIdAndQuantity(Long id, String quantity);

}
