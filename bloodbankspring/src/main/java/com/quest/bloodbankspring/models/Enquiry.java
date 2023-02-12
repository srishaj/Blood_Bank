package com.quest.bloodbankspring.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "enquiry_tb")
public class Enquiry {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer enquiryId;
	
	@Column(nullable = false)
	private String enquiryName;
	
	@Column(nullable = false)
	private String enquiryEmail;
	
	@Column(nullable = false)
	private String enquirySubject;
	
	@Column(nullable = false)
	private Long enquiryPhone;
	
	@Column(nullable = false)
	private String enquiryMessage;

	public Enquiry() {
		
	}

	public Integer getEnquiryId() {
		return enquiryId;
	}

	public void setEnquiryId(Integer enquiryId) {
		this.enquiryId = enquiryId;
	}

	public String getEnquiryName() {
		return enquiryName;
	}

	public void setEnquiryName(String enquiryName) {
		this.enquiryName = enquiryName;
	}

	public String getEnquiryEmail() {
		return enquiryEmail;
	}

	public void setEnquiryEmail(String enquiryEmail) {
		this.enquiryEmail = enquiryEmail;
	}

	public String getEnquirySubject() {
		return enquirySubject;
	}

	public void setEnquirySubject(String enquirySubject) {
		this.enquirySubject = enquirySubject;
	}

	public Long getEnquiryPhone() {
		return enquiryPhone;
	}

	public void setEnquiryPhone(Long enquiryPhone) {
		this.enquiryPhone = enquiryPhone;
	}

	public String getEnquiryMessage() {
		return enquiryMessage;
	}

	public void setEnquiryMessage(String enquiryMessage) {
		this.enquiryMessage = enquiryMessage;
	}


}
