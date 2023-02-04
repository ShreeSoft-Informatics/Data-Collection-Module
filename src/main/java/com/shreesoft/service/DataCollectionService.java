package com.shreesoft.service;

import java.util.Map;

import com.shreesoft.binding.DataCollectionEducation;
import com.shreesoft.binding.DataCollectionIncome;
import com.shreesoft.binding.DataCollectionSummary;
import com.shreesoft.binding.KidsRequest;
import com.shreesoft.binding.PlanSelection;

public interface DataCollectionService {
	public Long loadCaseNum(Integer appId);

	public Map<Integer, String> getPlanName();

	public Long savePlanSelection(PlanSelection planSelection);

	public Long saveIncome(DataCollectionIncome dcIncome);

	public Long saveKids(KidsRequest kidsRequest);

	public Long saveEducation(DataCollectionEducation dcEducation);

	public DataCollectionSummary getSummary(Long caseNum);
}
