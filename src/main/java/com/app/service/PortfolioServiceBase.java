package com.app.service;

import com.app.domain.portfolio.input.CreatePortfolioRequest;
import com.app.domain.portfolio.input.DeletePortfolioRequest;
import com.app.domain.portfolio.input.GetPortfolioRequest;
import com.app.domain.portfolio.input.GetPortfoliosRequest;
import com.app.domain.portfolio.input.UpdatePortfolioRequest;
import com.app.domain.portfolio.output.CreatePortfolioResponse;
import com.app.domain.portfolio.output.DeletePortfolioResponse;
import com.app.domain.portfolio.output.GetPortfolioResponse;
import com.app.domain.portfolio.output.GetPortfoliosResponse;
import com.app.domain.portfolio.output.UpdatePortfolioResponse;

public interface PortfolioServiceBase {

	CreatePortfolioResponse createPortfolio(CreatePortfolioRequest request);

	DeletePortfolioResponse deletePortfolio(DeletePortfolioRequest request);

	GetPortfolioResponse getPortfolio(GetPortfolioRequest request);

	GetPortfoliosResponse getPortfolios(GetPortfoliosRequest request);

	UpdatePortfolioResponse updatePortfolio(UpdatePortfolioRequest request);
}
