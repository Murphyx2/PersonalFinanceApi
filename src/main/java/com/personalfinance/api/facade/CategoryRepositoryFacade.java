package com.personalfinance.api.facade;

import java.util.List;

import com.personalfinance.api.domain.category.Category;
import com.personalfinance.api.domain.category.dto.CategoryDTO;
import com.personalfinance.api.domain.transaction.TransactionType;

public interface CategoryRepositoryFacade {

	boolean categoryExists(String userId, String name, TransactionType transactionType);

	boolean categoryExists(String categoryId, String userId);

	void deleteCategory(String categoryId, String userId);

	List<CategoryDTO> getCategories(String userId);

	CategoryDTO getCategory(String id, String userId);

	CategoryDTO saveCategory(Category category);

	CategoryDTO updateCategory(CategoryDTO category);

}
