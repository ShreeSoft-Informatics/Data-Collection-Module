package com.shreesoft.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shreesoft.model.DataCollectionKidsModel;

public interface DataCollectionKidsRepo extends JpaRepository<DataCollectionKidsModel, Serializable> {
	public List<DataCollectionKidsModel> findByCaseNum(Long caseNum);
}
