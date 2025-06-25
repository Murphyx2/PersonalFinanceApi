package com.app.domain.categoryplanner.output;

import com.app.domain.categoryplanner.dto.CategoryPlannerDTO;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CreateCategoryPlannerResponse {

	private CategoryPlannerDTO categoryPlanner;

	public CreateCategoryPlannerResponse withCategoryPlanner(CategoryPlannerDTO categoryPlanner) {
		this.setCategoryPlanner(categoryPlanner);
		return this;
	}
}
