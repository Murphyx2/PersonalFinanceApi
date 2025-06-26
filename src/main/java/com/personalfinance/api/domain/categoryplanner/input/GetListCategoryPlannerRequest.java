package com.personalfinance.api.domain.categoryplanner.input;

import com.personalfinance.api.domain.transaction.TransactionType;
import com.personalfinance.api.filter.SortBy;
import com.personalfinance.api.filter.SortDirection;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class GetListCategoryPlannerRequest {

	private String userId;
	private String budgetId;

	private SortBy sortBy;
	private SortDirection sortDirection;
	private String categoryName;
	private TransactionType transactionType;

	public GetListCategoryPlannerRequest withBudgetId(String budgetId) {
		this.setBudgetId(budgetId);
		return this;
	}

	public GetListCategoryPlannerRequest withCategoryName(String categoryName) {
		this.setCategoryName(categoryName);
		return this;
	}

	public GetListCategoryPlannerRequest withSortBy(SortBy sortBy) {
		this.setSortBy(sortBy);
		return this;
	}

	public GetListCategoryPlannerRequest withSortDirection(SortDirection sortDirection) {
		this.setSortDirection(sortDirection);
		return this;
	}

	public GetListCategoryPlannerRequest withTransactionType(TransactionType transactionType) {
		this.setTransactionType(transactionType);
		return this;
	}

	public GetListCategoryPlannerRequest withUserId(String userId) {
		this.setUserId(userId);
		return this;
	}
}
