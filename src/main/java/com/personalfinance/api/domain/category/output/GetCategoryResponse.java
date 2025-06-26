package com.personalfinance.api.domain.category.output;

import com.personalfinance.api.domain.category.dto.CategoryDTO;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class GetCategoryResponse {

	private CategoryDTO category;

	public GetCategoryResponse withCategory(CategoryDTO category) {
		this.setCategory(category);
		return this;
	}
}
