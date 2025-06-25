package com.app.domain.budget.output;

import com.app.domain.budget.dto.BudgetDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GetBudgetResponse {

	private BudgetDTO budget;

	public GetBudgetResponse withBudget(BudgetDTO budget) {
		this.setBudget(budget);
		return this;
	}
}
