package com.personalfinance.api.service;

import com.personalfinance.api.domain.categoryplanner.input.CreateCategoryPlannerRequest;
import com.personalfinance.api.domain.categoryplanner.input.DeleteCategoryPlannerRequest;
import com.personalfinance.api.domain.categoryplanner.input.GetCategoryPlannerRequest;
import com.personalfinance.api.domain.categoryplanner.input.GetListCategoryPlannerRequest;
import com.personalfinance.api.domain.categoryplanner.input.UpdateCategoryPlannerRequest;
import com.personalfinance.api.domain.categoryplanner.output.CreateCategoryPlannerResponse;
import com.personalfinance.api.domain.categoryplanner.output.GetCategoryPlannerResponse;
import com.personalfinance.api.domain.categoryplanner.output.GetListCategoryPlannerResponse;
import com.personalfinance.api.domain.categoryplanner.output.UpdateCategoryPlannerResponse;

public interface CategoryPlannerServiceBase {

	public CreateCategoryPlannerResponse createCategoryPlanner(CreateCategoryPlannerRequest request);

	public void deleteCategoryPlanner(DeleteCategoryPlannerRequest request);

	public GetCategoryPlannerResponse getCategoryPlanner(GetCategoryPlannerRequest request);

	public GetListCategoryPlannerResponse getListCategoryPlanner(GetListCategoryPlannerRequest request);

	public UpdateCategoryPlannerResponse updateCategoryPlanner(UpdateCategoryPlannerRequest request);
}
