package com.ecommerce.model;

import java.sql.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductOrder {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private Date order_date;
	
	private int quantity;
	
	private double price;
	
	private String status;
	
	private String payment;
	
	@ManyToOne
	private Product product;
	
	@ManyToOne
	private User user;
	
	@OneToOne(cascade = CascadeType.ALL)
	private OrderAddress orderAddress;
}
