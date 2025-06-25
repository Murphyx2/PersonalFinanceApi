package com.app.service;

import com.app.domain.category.input.CreateCategoryRequest;
import com.app.domain.category.input.DeleteCategoryRequest;
import com.app.domain.category.input.GetCategoriesRequest;
import com.app.domain.category.input.GetCategoryRequest;
import com.app.domain.category.input.UpdateCategoryRequest;
import com.app.domain.category.output.CreateCategoryResponse;
import com.app.domain.category.output.DeleteCategoryResponse;
import com.app.domain.category.output.GetCategoriesResponse;
import com.app.domain.category.output.GetCategoryResponse;
import com.app.domain.category.output.UpdateCategoryResponse;

public interface CategoryServiceBase {

	public CreateCategoryResponse createCategory(CreateCategoryRequest request);

	public GetCategoriesResponse getCategories(GetCategoriesRequest request);

	public GetCategoryResponse getCategory(GetCategoryRequest request);

	public UpdateCategoryResponse updateCategory(UpdateCategoryRequest request);

	public DeleteCategoryResponse deleteCategory(DeleteCategoryRequest request);
}
