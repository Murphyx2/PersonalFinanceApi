package com.app.domain.categoryplanner.output;

import java.util.List;

import com.app.domain.categoryplanner.dto.CategoryPlannerDTO;
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
