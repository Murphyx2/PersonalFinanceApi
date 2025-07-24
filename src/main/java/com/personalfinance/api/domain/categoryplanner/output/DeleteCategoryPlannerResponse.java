package com.personalfinance.api.domain.categoryplanner.output;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class DeleteCategoryPlannerResponse {

	boolean success;

	public DeleteCategoryPlannerResponse withSuccess(boolean success) {
		this.setSuccess(success);
		return this;
	}
}
