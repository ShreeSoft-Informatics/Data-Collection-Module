package com.shreesoft.binding;

import java.util.Map;

import lombok.Data;

@Data
public class CreateClassResponse {
	private Long caseNum;

	Map<Integer, String> planName;
}
