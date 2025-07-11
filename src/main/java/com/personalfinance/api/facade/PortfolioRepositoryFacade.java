package com.personalfinance.api.facade;

import java.util.List;

import com.personalfinance.api.domain.portfolio.dto.PortfolioDTO;

public interface PortfolioRepositoryFacade {

	boolean deletePortfolio(PortfolioDTO portfolio);

	boolean existsPortfolio(String id, String userId);

	List<PortfolioDTO> getAllPortfolioByUserId(String userId);

	PortfolioDTO getPortfolioByIdAndUserId(String id, String userId);

	PortfolioDTO savePortfolio(PortfolioDTO portfolio);

	PortfolioDTO updatePortfolio(PortfolioDTO portfolio);
}
