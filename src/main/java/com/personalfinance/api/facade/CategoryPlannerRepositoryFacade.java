package com.personalfinance.api.facade;

import java.util.List;

import com.personalfinance.api.domain.categoryplanner.CategoryPlanner;
import com.personalfinance.api.domain.categoryplanner.dto.CategoryPlannerDTO;

public interface CategoryPlannerRepositoryFacade {

	boolean categoryPlannerExists(String categoryId, String budgetId, String userId);

	boolean categoryPlannerExists(String id, String userId);

	void deleteCategoryPlanner(CategoryPlannerDTO categoryPlanner);

	List<CategoryPlannerDTO> getCategoriesPlanner(String budgetId, String userId);

	CategoryPlannerDTO getCategoryPlanner(String id, String userId);

	CategoryPlannerDTO saveCategoryPlanner(CategoryPlanner categoryPlanner);

	CategoryPlannerDTO updateCategoryPlanner(CategoryPlannerDTO categoryPlanner);

}
