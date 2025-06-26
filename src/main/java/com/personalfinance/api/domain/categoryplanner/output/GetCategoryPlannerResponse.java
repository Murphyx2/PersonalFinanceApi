package com.personalfinance.api.domain.categoryplanner.output;

import com.personalfinance.api.domain.categoryplanner.dto.CategoryPlannerDTO;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class GetCategoryPlannerResponse {

	private CategoryPlannerDTO categoryPlanner;

	public GetCategoryPlannerResponse withCategoryPlanner(CategoryPlannerDTO categoryPlanner) {
		this.setCategoryPlanner(categoryPlanner);
		return this;
	}
}
