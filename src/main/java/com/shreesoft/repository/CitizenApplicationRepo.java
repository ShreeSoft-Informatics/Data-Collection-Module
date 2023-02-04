package com.shreesoft.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shreesoft.model.CitizenApplicationModel;

public interface CitizenApplicationRepo extends JpaRepository<CitizenApplicationModel, Serializable>{

}
