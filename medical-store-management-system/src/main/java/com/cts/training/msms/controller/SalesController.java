package com.cts.training.msms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.training.msms.dto.SalesDTO;
import com.cts.training.msms.entity.Sales;
import com.cts.training.msms.service.MedicineService;
import com.cts.training.msms.service.SalesService;

@CrossOrigin("*")
@RestController
@RequestMapping("/msms/v1")
public class SalesController {
	
	@Autowired
	private SalesService salesService;

//	@Autowired
//	private MedicineService medicineService;
	
//	@PutMapping("/customer/{phone}/medicines/{id}/order/{quantity}")
//	public void updateQuantity(@PathVariable Long id,@PathVariable Integer quantity){
//		medicineService.getAfterOrder(id, quantity);
//		//System.out.println(id + "" + quantity);
		
//	}
	
	@PostMapping("/sales")
	public ResponseEntity<Sales> addSales(@RequestBody SalesDTO salesDTO){
		Sales sale = salesService.addSale(salesDTO);
		return ResponseEntity.ok(sale);
		
	}
	
	@GetMapping("/sales")
	public List<Sales> getAllSales(){
		List<Sales> sales = salesService.getSales();
		return sales;
		
	}
}
