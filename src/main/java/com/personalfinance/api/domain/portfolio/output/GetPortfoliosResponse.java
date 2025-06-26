package com.personalfinance.api.domain.portfolio.output;

import java.util.List;

import com.personalfinance.api.domain.portfolio.dto.PortfolioDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetPortfoliosResponse {

	private List<PortfolioDTO> portfolios;

	public GetPortfoliosResponse withPortfolios(List<PortfolioDTO> portfolio) {
		this.setPortfolios(portfolio);
		return this;
	}
}
