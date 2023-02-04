package com.shreesoft.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shreesoft.model.DataCollectionCasesModel;

public interface DataCollectionCasesRepo extends JpaRepository<DataCollectionCasesModel, Serializable>{

}
