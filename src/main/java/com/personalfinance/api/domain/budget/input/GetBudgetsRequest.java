package com.personalfinance.api.domain.budget.input;

import com.personalfinance.api.filter.SortBy;
import com.personalfinance.api.filter.SortDirection;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GetBudgetsRequest {

	private String userId;
	private String portfolioId;

	private SortBy sortBy;
	private SortDirection sortDirection;

	public GetBudgetsRequest withPortfolioId(String portfolioId) {
		this.setPortfolioId(portfolioId);
		return this;
	}

	public GetBudgetsRequest withSortBy(SortBy sortBy) {
		this.setSortBy(sortBy);
		return this;
	}

	public GetBudgetsRequest withSortDirection(SortDirection sortDirection) {
		this.setSortDirection(sortDirection);
		return this;
	}

	public GetBudgetsRequest withUserId(String userId) {
		this.setUserId(userId);
		return this;
	}
}
