package com.personalfinance.api.domain.categoryplanner.input;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class GetCategoryPlannerRequest {

	private String id;
	private String userId;

	public GetCategoryPlannerRequest withId(String id) {
		this.setId(id);
		return this;
	}

	public GetCategoryPlannerRequest withUserId(String userId) {
		this.setUserId(userId);
		return this;
	}
}
