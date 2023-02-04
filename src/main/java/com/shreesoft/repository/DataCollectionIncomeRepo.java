package com.shreesoft.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shreesoft.model.DataCollectionIncomeModel;

public interface DataCollectionIncomeRepo extends JpaRepository<DataCollectionIncomeModel, Serializable>{
	public DataCollectionIncomeModel findByCaseNum(Long caseNum);
}
