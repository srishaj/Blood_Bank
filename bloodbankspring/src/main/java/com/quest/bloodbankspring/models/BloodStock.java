package com.quest.bloodbankspring.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "bloodstock_tb")
public class BloodStock {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer bloodGroupId;
	
	@Column(nullable = false)
	private Integer bloodStock;

	public BloodStock() {
		
	}

	public Integer getBloodGroupId() {
		return bloodGroupId;
	}

	public void setBloodGroupId(Integer bloodGroupId) {
		this.bloodGroupId = bloodGroupId;
	}

	public Integer getBloodStock() {
		return bloodStock;
	}

	public void setBloodStock(Integer bloodStock) {
		this.bloodStock = bloodStock;
	}


}
