package com.shreesoft.model;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class PlanModel {
	@Id
	@GeneratedValue
	private int planId;
	private String planName;
	private LocalDate planStartDate;
	private LocalDate planEndDate;
	private int planCategoryId;
	private String activeSW;
	@Column(name = "CREATED_DATE", updatable = false)
	@CreationTimestamp
	private LocalDate createDate;
	@Column(name = "UPDATED_DATE", insertable = false)
	@CreationTimestamp
	private LocalDate updateDate;
	private String createdBy;
	private String updatedBy;
}
