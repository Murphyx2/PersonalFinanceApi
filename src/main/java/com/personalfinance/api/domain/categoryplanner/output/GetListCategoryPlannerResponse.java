package com.personalfinance.api.domain.categoryplanner.output;

import java.util.List;

import com.personalfinance.api.domain.categoryplanner.dto.CategoryPlannerDTO;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class GetListCategoryPlannerResponse {

	private List<CategoryPlannerDTO> categoryPlanners;

	public GetListCategoryPlannerResponse withCategoryPlanners(List<CategoryPlannerDTO> categoryPlanners) {
		this.setCategoryPlanners(categoryPlanners);
		return this;
	}
}
