package com.personalfinance.api.domain.budget.dto;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.personalfinance.api.domain.categoryplanner.dto.CategoryPlannerDTO;
import com.personalfinance.api.domain.portfolio.dto.PortfolioDTO;
import com.personalfinance.api.domain.transaction.dto.TransactionDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BudgetDTO implements Serializable {

	@Serial
	private static final long serialVersionUID = 821506937428193506L;

	private String id;

	private String userId;

	private String portfolioId;

	private List<TransactionDTO> transactions;

	private List<CategoryPlannerDTO> categoryPlanners;

	private String name;

	private String description;

	@JsonFormat(pattern = "yyyy-MM-dd' 'HH:mm:ss")
	private LocalDateTime startAt;

	@JsonFormat(pattern = "yyyy-MM-dd' 'HH:mm:ss")
	private LocalDateTime endAt;

	@JsonFormat(pattern = "yyyy-MM-dd' 'HH:mm:ss")
	private LocalDateTime createdAt;

	@JsonFormat(pattern = "yyyy-MM-dd' 'HH:mm:ss")
	private LocalDateTime updatedAt;

	public BudgetDTO withCategoryPlanners(List<CategoryPlannerDTO> categoryPlanners) {
		this.setCategoryPlanners(categoryPlanners);
		return this;
	}

	public BudgetDTO withCreatedAt(LocalDateTime createdAt) {
		this.setCreatedAt(createdAt);
		return this;
	}

	public BudgetDTO withDescription(String description) {
		this.setDescription(description);
		return this;
	}

	public BudgetDTO withEndAt(LocalDateTime endAt) {
		this.setEndAt(endAt);
		return this;
	}

	public BudgetDTO withId(String id) {
		this.setId(id);
		return this;
	}

	public BudgetDTO withName(String name) {
		this.setName(name);
		return this;
	}

	public BudgetDTO withPortfolioId(String portfolioId) {
		this.setPortfolioId(portfolioId);
		return this;
	}

	public BudgetDTO withStartAt(LocalDateTime startAt) {
		this.setStartAt(startAt);
		return this;
	}

	public BudgetDTO withTransactions(List<TransactionDTO> transactions) {
		this.setTransactions(transactions);
		return this;
	}

	public BudgetDTO withUpdatedAt(LocalDateTime updatedAt) {
		this.setUpdatedAt(updatedAt);
		return this;
	}

	public BudgetDTO withUserId(String userId) {
		this.setUserId(userId);
		return this;
	}
}
