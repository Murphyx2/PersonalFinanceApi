package com.personalfinance.api.domain.portfolio.output;

import com.personalfinance.api.domain.portfolio.dto.PortfolioDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreatePortfolioResponse {

	private PortfolioDTO portfolio;

	public CreatePortfolioResponse withPortfolio(PortfolioDTO portfolio) {
		this.setPortfolio(portfolio);
		return this;
	}
}
