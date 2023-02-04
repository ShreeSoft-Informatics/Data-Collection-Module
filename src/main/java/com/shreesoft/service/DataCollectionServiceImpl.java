package com.shreesoft.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.shreesoft.binding.DataCollectionEducation;
import com.shreesoft.binding.DataCollectionIncome;
import com.shreesoft.binding.DataCollectionSummary;
import com.shreesoft.binding.KidsRequest;
import com.shreesoft.binding.PlanSelection;
import com.shreesoft.repository.CitizenApplicationRepo;
import com.shreesoft.repository.DataCollectionCasesRepo;
import com.shreesoft.repository.DataCollectionEducationRepo;
import com.shreesoft.repository.DataCollectionIncomeRepo;
import com.shreesoft.repository.DataCollectionKidsRepo;
import com.shreesoft.repository.PlanRepo;

public class DataCollectionServiceImpl implements DataCollectionService {
	
	@Autowired
	private CitizenApplicationRepo citizenRepo;

	@Autowired
	private DataCollectionCasesRepo dcCasesRepo;

	@Autowired
	private DataCollectionKidsRepo dcKidsRepo;

	@Autowired
	private DataCollectionEducationRepo dcEducationRepo;

	@Autowired
	private DataCollectionIncomeRepo dcIncomeRepo;

	@Autowired
	private PlanRepo planRepo;
	
	@Override
	public Long loadCaseNum(Integer appId) {
		return null;
	}

	@Override
	public Map<Integer, String> getPlanName() {
		return null;
	}

	@Override
	public Long savePlanSelection(PlanSelection planSelection) {
		return null;
	}

	@Override
	public Long saveIncome(DataCollectionIncome dcIncome) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long saveKids(KidsRequest kidsRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long saveEducation(DataCollectionEducation dcEducation) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataCollectionSummary getSummary(Long caseNum) {
		// TODO Auto-generated method stub
		return null;
	}

}
