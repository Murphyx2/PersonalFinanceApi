package com.app.domain.category.output;

import java.util.List;

import com.app.domain.category.dto.CategoryDTO;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class GetCategoriesResponse {

	private List<CategoryDTO> categories;

	public GetCategoriesResponse withCategories(List<CategoryDTO> category) {
		this.setCategories(category);
		return this;
	}
}
