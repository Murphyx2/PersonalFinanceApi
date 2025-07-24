package com.personalfinance.api.facade;

import java.util.List;

import com.personalfinance.api.domain.budget.Budget;
import com.personalfinance.api.domain.budget.dto.BudgetDTO;

public interface BudgetRepositoryFacade {

	boolean budgetExists(String id, String userId);

	void deleteBudget(String id, String userId);

	BudgetDTO getBudgetByIdAndUserId(String id, String userId);

	List<BudgetDTO> getBudgetsByPortfolioIdAndUserId(String portfolioId, String userId);

	BudgetDTO saveBudget(Budget budget);

	BudgetDTO updateBudget(BudgetDTO budget);
}
