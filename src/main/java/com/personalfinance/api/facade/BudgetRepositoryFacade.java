package com.personalfinance.api.facade;

import java.util.List;

import com.personalfinance.api.domain.budget.Budget;

public interface BudgetRepositoryFacade {

	boolean budgetExists(String id, String userId);

	boolean deleteBudget(String id, String userId);

	Budget getBudgetByIdAndUserId(String id, String userId);

	List<Budget> getBudgetsByPortfolioIdAndUserId(String portfolioId, String userId);

	Budget saveBudget(Budget budget);
}
