package com.app.service;

import com.app.domain.categoryplanner.input.CreateCategoryPlannerRequest;
import com.app.domain.categoryplanner.input.DeleteCategoryPlannerRequest;
import com.app.domain.categoryplanner.input.GetCategoryPlannerRequest;
import com.app.domain.categoryplanner.input.GetListCategoryPlannerRequest;
import com.app.domain.categoryplanner.input.UpdateCategoryPlannerRequest;
import com.app.domain.categoryplanner.output.CreateCategoryPlannerResponse;
import com.app.domain.categoryplanner.output.GetCategoryPlannerResponse;
import com.app.domain.categoryplanner.output.GetListCategoryPlannerResponse;
import com.app.domain.categoryplanner.output.UpdateCategoryPlannerResponse;

public interface CategoryPlannerServiceBase {

	public CreateCategoryPlannerResponse createCategoryPlanner(CreateCategoryPlannerRequest request);

	public void deleteCategoryPlanner(DeleteCategoryPlannerRequest request);

	public GetCategoryPlannerResponse getCategoryPlanner(GetCategoryPlannerRequest request);

	public GetListCategoryPlannerResponse getListCategoryPlanner(GetListCategoryPlannerRequest request);

	public UpdateCategoryPlannerResponse updateCategoryPlanner(UpdateCategoryPlannerRequest request);
}
