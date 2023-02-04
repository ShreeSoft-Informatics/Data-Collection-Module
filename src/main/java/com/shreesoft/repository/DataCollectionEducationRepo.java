package com.shreesoft.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shreesoft.model.DataCollectionEducationModel;

public interface DataCollectionEducationRepo extends JpaRepository<DataCollectionEducationModel, Serializable>{
	public DataCollectionEducationModel findByCaseNum(Long caseNum);
}
