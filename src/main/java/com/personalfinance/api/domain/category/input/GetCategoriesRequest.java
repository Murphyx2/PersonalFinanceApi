package com.personalfinance.api.domain.category.input;

import com.personalfinance.api.domain.transaction.TransactionType;
import com.personalfinance.api.filter.SortBy;
import com.personalfinance.api.filter.SortDirection;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class GetCategoriesRequest {

	private String id;
	private String userId;
	private SortBy sortBy;
	private SortDirection sortDirection;
	private TransactionType transactionType;

	public GetCategoriesRequest withId(String id) {
		this.setId(id);
		return this;
	}

	public GetCategoriesRequest withSortBy(SortBy sortBy) {
		this.setSortBy(sortBy);
		return this;
	}

	public GetCategoriesRequest withSortDirection(SortDirection sortDirection) {
		this.setSortDirection(sortDirection);
		return this;
	}

	public GetCategoriesRequest withTransactionType(TransactionType transactionType) {
		this.setTransactionType(transactionType);
		return this;
	}

	public GetCategoriesRequest withUserId(String userId) {
		this.setUserId(userId);
		return this;
	}
}
