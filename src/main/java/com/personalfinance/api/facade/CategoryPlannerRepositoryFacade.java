package com.personalfinance.api.facade;

import java.util.List;

import com.personalfinance.api.domain.categoryplanner.CategoryPlanner;

public interface CategoryPlannerRepositoryFacade {

	boolean categoryPlannerExists(String categoryId, String budgetId, String userId);

	boolean categoryPlannerExists(String id, String userId);

	void deleteCategoryPlanner(CategoryPlanner categoryPlanner);

	List<CategoryPlanner> getCategoriesPlanner(String budgetId, String userId);

	CategoryPlanner getCategoryPlanner(String id, String userId);

	CategoryPlanner saveCategoryPlanner(CategoryPlanner categoryPlanner);

}
