package com.cts.training.msms.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.training.msms.entity.Medicine;
import com.cts.training.msms.service.MedicineService;

@CrossOrigin("*")
@RestController
@RequestMapping("/msms/v1")
public class MedicineController {
	
	@Autowired
	private MedicineService medicineService;
	
	private final Logger LOGGER = LoggerFactory.getLogger(MedicineController.class);
	
	//Get list of medicines
	@GetMapping("/medicines")
	public List<Medicine> getMedicines(){
		LOGGER.info("Inside get all medicines in Medicine Controller");
		return medicineService.getAllMedicines();
	}
	
	//Add a medicine
	@PostMapping("/medicines")
	public Medicine createMedicine(@Valid @RequestBody Medicine medicine) {
		return medicineService.saveMedicine(medicine);		
	}
	
	//Get a medicine by id
	@GetMapping("/medicines/{id}")
	public ResponseEntity<Medicine> getMedicineById(@PathVariable Long id) {
		Medicine medicine = medicineService.getMedicineById(id);
		return ResponseEntity.ok(medicine);
	}
	
	//Update medicine
	@PutMapping("/medicines/{id}")
	public ResponseEntity<Medicine> updateMedicineById(@Valid @PathVariable Long id, @RequestBody Medicine medicine){
		Medicine updatedMedicine = medicineService.updateMedicine(id, medicine);
		return ResponseEntity.ok(updatedMedicine);
	}
	
	//Delete Medicine
	@DeleteMapping("medicines/{id}")
	public ResponseEntity<Map<String,Boolean>> deleteMedicineById(@PathVariable Long id){
		medicineService.deleteMedicine(id);
		Map<String, Boolean> response = new HashMap<>();
		response.put("Medicine deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);		
	}
	
	//Get medicines by category
	@GetMapping("/medicines/category/{category}")
	public Medicine getMedicineByCategory(@PathVariable String category){
			return medicineService.getMedicineByCategory(category);
	}	
	
//	@PutMapping("medicines/reduce/reducemedicine")
//	public Medicine reduceOrderedQunatity(@PathVariable Long id, @RequestBody Long id1, Integer quantity) {
//		Medicine medicineById = medicineService.getMedicineById(id1);
//		if(medicineById.getQuantity()< quantity) {
//			throw new ResourceNotFoundException("Quantity less");
//		}
//		else {
//			medicineById.setQuantity(medicineById.getQuantity() - quantity);
//			return medicineService.updateMedicine(id1, medicineById);
//		}
		
}
