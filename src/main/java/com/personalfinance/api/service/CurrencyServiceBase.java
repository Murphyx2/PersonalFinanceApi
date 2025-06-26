package com.personalfinance.api.service;

import com.personalfinance.api.domain.currency.input.GetCurrencyRequest;
import com.personalfinance.api.domain.currency.output.GetCurrencyResponse;

public interface CurrencyServiceBase {

	GetCurrencyResponse getCurrencies(GetCurrencyRequest request);
}
