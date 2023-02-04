package com.shreesoft.binding;

import java.util.List;

import lombok.Data;

@Data
public class KidsRequest {
	private Long caseNum;
	private List<DataCollectionKids> kids;
}
