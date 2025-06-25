package com.app.domain.portfolio.output;

import com.app.domain.portfolio.dto.PortfolioDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetPortfolioResponse {

	private PortfolioDTO portfolio;

	public GetPortfolioResponse withPortfolio(PortfolioDTO portfolio) {
		this.setPortfolio(portfolio);
		return this;
	}
}
