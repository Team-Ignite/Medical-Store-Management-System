package com.cts.training.msms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;

@Entity
@Table(name = "Customer")
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "customer_id", updatable = false)
	private Long id;
	
	@Column(name = "customer_name")
	@NotBlank(message = "Customer name cannot be empty")
	private String name;
	
	@Column(name = "cutsomer_village")
	@NotBlank(message = "Village name cannot be empty")
	private String village;
	
	@Column(name = "pincode")
	@NotBlank(message = "Pincode cannot be empty")
	@Length(min =6, max = 6)
	private String pincode;
	
	@Column(name = "phone_number", unique = true)
	//@Pattern(regexp="^[789][0-9]{9}", message="Mobile number should have 10 digits and starting with 7/8/9")
	@Pattern(regexp="^[789]{1}[0-9]{9}", message="Mobile number should have 10 digits and starting with 7/8/9")
	@NotNull
	private String phone;
	
	@Column(name = "username", unique = true)
	@NotBlank(message = "UserName cannot be empty")
	@Length(min = 5, max = 15)
	private String username;
	
	@Column(name = "password")
	@NotBlank(message = "Password cannot be empty")
	@Size(min = 4, max = 10)
	private String password;
	
	public Customer() {
		super();
	}

	public Customer(String name, String village, String pincode, String phone, String username, String password) {
		super();
		this.name = name;
		this.village = village;
		this.pincode = pincode;
		this.phone = phone;
		this.username = username;
		this.password = password;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVillage() {
		return village;
	}

	public void setVillage(String village) {
		this.village = village;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
