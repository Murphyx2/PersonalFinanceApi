package com.personalfinance.api.service;

import com.personalfinance.api.domain.budget.input.CreateBudgetRequest;
import com.personalfinance.api.domain.budget.input.DeleteBudgetRequest;
import com.personalfinance.api.domain.budget.input.GetBudgetRequest;
import com.personalfinance.api.domain.budget.input.GetBudgetsRequest;
import com.personalfinance.api.domain.budget.input.UpdateBudgetRequest;
import com.personalfinance.api.domain.budget.output.CreateBudgetResponse;
import com.personalfinance.api.domain.budget.output.DeleteBudgetResponse;
import com.personalfinance.api.domain.budget.output.GetBudgetResponse;
import com.personalfinance.api.domain.budget.output.GetBudgetsResponse;
import com.personalfinance.api.domain.budget.output.UpdateBudgetResponse;

public interface BudgetServiceBase {

	CreateBudgetResponse createBudget(CreateBudgetRequest request);

	DeleteBudgetResponse deleteBudget(DeleteBudgetRequest request);

	GetBudgetResponse getBudget(GetBudgetRequest request);

	GetBudgetsResponse getBudgets(GetBudgetsRequest request);

	UpdateBudgetResponse updateBudget(UpdateBudgetRequest request);
}
