package com.shreesoft.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class DataCollectionEducationModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer educationId;
	private Long caseNum;
	private String highestDegree;
	private Integer graduationYear;
	private String universityName;
}
