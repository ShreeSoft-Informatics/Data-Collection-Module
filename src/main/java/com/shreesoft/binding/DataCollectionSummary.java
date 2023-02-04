package com.shreesoft.binding;

import lombok.Data;

@Data
public class DataCollectionSummary {
	
	private DataCollectionEducation education;
	private DataCollectionKids kids;
	private DataCollectionIncome income;
	private String planName;

}
