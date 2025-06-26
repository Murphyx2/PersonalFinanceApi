package com.personalfinance.api.domain.portfolio.output;

import java.util.List;

import com.personalfinance.api.domain.portfolio.dto.PortfolioDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetAllPortfolioResponse {

	private List<PortfolioDTO> portfolios;

	public GetAllPortfolioResponse withPortfolios(List<PortfolioDTO> portfolios) {
		this.setPortfolios(portfolios);
		return this;
	}
}
