package com.cts.training.msms.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
public class MedicineOrder {
	
	@Id
	@Column(name = "order_id")
	private Long id;
	
	@ManyToMany
	@JoinTable(
	  name = "order_medicine",
	  joinColumns = @JoinColumn(name = "order_id"), 
	  inverseJoinColumns = @JoinColumn(name = "medicine_id"))
	private Set<Medicine> medicine;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "customer_id")
	private Customer customer;
	
	@Column(name = "order_quantity")
	private Long quantity;
	
	@Column(name = "order_amount")
	private Double amount;

	public MedicineOrder() {
		super();
	}

	public MedicineOrder(Set<Medicine> medicine, Customer customer, Long quantity, Double amount) {
		super();
		this.medicine = medicine;
		this.customer = customer;
		this.quantity = quantity;
		this.amount = amount;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Set<Medicine> getMedicine() {
		return medicine;
	}

	public void setMedicine(Set<Medicine> medicine) {
		this.medicine = medicine;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Long getQuantity() {
		return quantity;
	}

	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}
}
