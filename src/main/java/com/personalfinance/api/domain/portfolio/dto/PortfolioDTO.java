package com.personalfinance.api.domain.portfolio.dto;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.personalfinance.api.domain.budget.Budget;
import com.personalfinance.api.domain.budget.dto.BudgetDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PortfolioDTO implements Serializable {

	@Serial
	private static final long serialVersionUID = 518392746083214907L;

	private UUID id;

	private UUID userId;

	private String name;

	private String description;

	private List<BudgetDTO> budgets;

	@JsonFormat(pattern = "yyyy-MM-dd' 'HH:mm:ss")
	private LocalDateTime created;

	@JsonFormat(pattern = "yyyy-MM-dd' 'HH:mm:ss")
	private LocalDateTime updated;

	public PortfolioDTO withBudgets(List<BudgetDTO> budgets) {
		this.setBudgets(budgets);
		return this;
	}

	public PortfolioDTO withCreated(LocalDateTime created) {
		this.setCreated(created);
		return this;
	}

	public PortfolioDTO withDescription(String description) {
		this.setDescription(description);
		return this;
	}

	public PortfolioDTO withId(UUID id) {
		this.setId(id);
		return this;
	}

	public PortfolioDTO withName(String name) {
		this.setName(name);
		return this;
	}

	public PortfolioDTO withUpdated(LocalDateTime updated) {
		this.setUpdated(updated);
		return this;
	}

	public PortfolioDTO withUserId(UUID userId) {
		this.setUserId(userId);
		return this;
	}
}
