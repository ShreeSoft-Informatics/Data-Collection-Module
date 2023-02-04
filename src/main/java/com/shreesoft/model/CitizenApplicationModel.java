package com.shreesoft.model;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class CitizenApplicationModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer appId;
	private String fullName;
	private String email;
	private long phoneNum;
	private Integer Ssn;
	private String gender;
	private LocalDate dob;
	private String stateName;
	@CreationTimestamp
	@Column(name = "created_Date", updatable = false)
	private LocalDate createDate;
	@CreationTimestamp
	@Column(name = "updated_Date", insertable = false)
	private LocalDate updateDate;
	private String createdBy;
	private String updatedBy;
}
