package com.app.service;

import com.app.domain.budget.input.CreateBudgetRequest;
import com.app.domain.budget.input.DeleteBudgetRequest;
import com.app.domain.budget.input.GetBudgetRequest;
import com.app.domain.budget.input.GetBudgetsRequest;
import com.app.domain.budget.input.UpdateBudgetRequest;
import com.app.domain.budget.output.CreateBudgetResponse;
import com.app.domain.budget.output.DeleteBudgetResponse;
import com.app.domain.budget.output.GetBudgetResponse;
import com.app.domain.budget.output.GetBudgetsResponse;
import com.app.domain.budget.output.UpdateBudgetResponse;

public interface BudgetServiceBase {

	CreateBudgetResponse createBudget(CreateBudgetRequest request);

	DeleteBudgetResponse deleteBudget(DeleteBudgetRequest request);

	GetBudgetResponse getBudget(GetBudgetRequest request);

	GetBudgetsResponse getBudgets(GetBudgetsRequest request);

	UpdateBudgetResponse updateBudget(UpdateBudgetRequest request);
}
