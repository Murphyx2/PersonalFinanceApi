package com.personalfinance.api.facade;

import java.util.List;

import com.personalfinance.api.domain.portfolio.Portfolio;

public interface PortfolioRepositoryFacade {

	boolean deletePortfolio(Portfolio portfolio);

	boolean existsPortfolio(String id, String userId);

	List<Portfolio> getAllPortfolioByUserId(String userId);

	Portfolio getPortfolioByIdAndUserId(String id, String userId);

	Portfolio savePortfolio(Portfolio portfolio);
}
