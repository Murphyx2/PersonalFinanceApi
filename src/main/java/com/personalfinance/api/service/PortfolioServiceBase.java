package com.personalfinance.api.service;

import com.personalfinance.api.domain.portfolio.input.CreatePortfolioRequest;
import com.personalfinance.api.domain.portfolio.input.DeletePortfolioRequest;
import com.personalfinance.api.domain.portfolio.input.GetPortfolioRequest;
import com.personalfinance.api.domain.portfolio.input.GetPortfoliosRequest;
import com.personalfinance.api.domain.portfolio.input.UpdatePortfolioRequest;
import com.personalfinance.api.domain.portfolio.output.CreatePortfolioResponse;
import com.personalfinance.api.domain.portfolio.output.DeletePortfolioResponse;
import com.personalfinance.api.domain.portfolio.output.GetPortfolioResponse;
import com.personalfinance.api.domain.portfolio.output.GetPortfoliosResponse;
import com.personalfinance.api.domain.portfolio.output.UpdatePortfolioResponse;

public interface PortfolioServiceBase {

	CreatePortfolioResponse createPortfolio(CreatePortfolioRequest request);

	DeletePortfolioResponse deletePortfolio(DeletePortfolioRequest request);

	GetPortfolioResponse getPortfolio(GetPortfolioRequest request);

	GetPortfoliosResponse getPortfolios(GetPortfoliosRequest request);

	UpdatePortfolioResponse updatePortfolio(UpdatePortfolioRequest request);
}
