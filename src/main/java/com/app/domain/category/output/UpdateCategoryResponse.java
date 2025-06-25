package com.app.domain.category.output;

import com.app.domain.category.dto.CategoryDTO;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UpdateCategoryResponse {

	private CategoryDTO category;

	public UpdateCategoryResponse withCategory(CategoryDTO category) {
		this.setCategory(category);
		return this;
	}
}
