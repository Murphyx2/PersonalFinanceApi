package com.app.domain.category.output;

import com.app.domain.category.dto.CategoryDTO;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class CreateCategoryResponse {

	private CategoryDTO category;

	public CreateCategoryResponse withCategory(CategoryDTO category) {
		this.setCategory(category);
		return this;
	}
}
