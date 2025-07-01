package com.personalfinance.api.facade;

import java.util.List;

import com.personalfinance.api.domain.category.Category;
import com.personalfinance.api.domain.transaction.TransactionType;

public interface CategoryRepositoryFacade {

	boolean categoryExists(String userId, String name, TransactionType transactionType);

	boolean categoryExists(String categoryId, String userId);

	void deleteCategory(Category category);

	List<Category> getCategories(String userId);

	Category getCategory(String id, String userId);

	Category saveCategory(Category category);

}
