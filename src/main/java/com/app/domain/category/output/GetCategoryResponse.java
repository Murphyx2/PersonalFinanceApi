package com.app.domain.category.output;

import com.app.personalfinancesservice.domain.category.Category;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class GetCategoryResponse {

	private Category category;

	public GetCategoryResponse withCategory(Category category) {
		this.setCategory(category);
		return this;
	}
}
