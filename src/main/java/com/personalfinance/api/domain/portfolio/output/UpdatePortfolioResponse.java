package com.personalfinance.api.domain.portfolio.output;

import com.personalfinance.api.domain.portfolio.dto.PortfolioDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UpdatePortfolioResponse {

	private PortfolioDTO portfolio;

	public UpdatePortfolioResponse withPortfolio(PortfolioDTO portfolio) {
		this.setPortfolio(portfolio);
		return this;
	}
}
