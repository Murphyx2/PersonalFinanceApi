package com.personalfinance.api.domain.portfolio.input;

import com.personalfinance.api.filter.SortBy;
import com.personalfinance.api.filter.SortDirection;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GetPortfoliosRequest {

	private String userId;
	private String portfolioId;

	private SortBy sortBy;
	private SortDirection sortDirection;

	public GetPortfoliosRequest withPortfolioId(String portfolioId) {
		this.setPortfolioId(portfolioId);
		return this;
	}

	public GetPortfoliosRequest withSortBy(SortBy sortBy) {
		this.setSortBy(sortBy);
		return this;
	}

	public GetPortfoliosRequest withSortDirection(SortDirection sortDirection) {
		this.setSortDirection(sortDirection);
		return this;
	}

	public GetPortfoliosRequest withUserId(String userId) {
		this.setUserId(userId);
		return this;
	}
}
