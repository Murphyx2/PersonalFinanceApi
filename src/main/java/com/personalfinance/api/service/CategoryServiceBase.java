package com.personalfinance.api.service;

import com.personalfinance.api.domain.category.input.CreateCategoryRequest;
import com.personalfinance.api.domain.category.input.DeleteCategoryRequest;
import com.personalfinance.api.domain.category.input.GetCategoriesRequest;
import com.personalfinance.api.domain.category.input.GetCategoryRequest;
import com.personalfinance.api.domain.category.input.UpdateCategoryRequest;
import com.personalfinance.api.domain.category.output.CreateCategoryResponse;
import com.personalfinance.api.domain.category.output.DeleteCategoryResponse;
import com.personalfinance.api.domain.category.output.GetCategoriesResponse;
import com.personalfinance.api.domain.category.output.GetCategoryResponse;
import com.personalfinance.api.domain.category.output.UpdateCategoryResponse;

public interface CategoryServiceBase {

	public CreateCategoryResponse createCategory(CreateCategoryRequest request);

	public GetCategoriesResponse getCategories(GetCategoriesRequest request);

	public GetCategoryResponse getCategory(GetCategoryRequest request);

	public UpdateCategoryResponse updateCategory(UpdateCategoryRequest request);

	public DeleteCategoryResponse deleteCategory(DeleteCategoryRequest request);
}
