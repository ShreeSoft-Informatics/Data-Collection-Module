package com.shreesoft.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shreesoft.model.PlanModel;

public interface PlanRepo extends JpaRepository<PlanModel, Serializable> {

}
