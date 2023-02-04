package com.shreesoft.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class DataCollectionKidsModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer kidsId;
	private String kidsName;
	private Integer kidsAge;
	private Integer kidsSsn;
	private Long caseNum;
}
