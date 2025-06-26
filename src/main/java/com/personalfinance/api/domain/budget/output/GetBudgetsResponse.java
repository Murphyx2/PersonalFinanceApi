package com.personalfinance.api.domain.budget.output;

import java.util.List;

import com.personalfinance.api.domain.budget.dto.BudgetDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GetBudgetsResponse {

	private List<BudgetDTO> budgets;

	public GetBudgetsResponse withBudgets(List<BudgetDTO> budgets) {
		this.setBudgets(budgets);
		return this;
	}
}
