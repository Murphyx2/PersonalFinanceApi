package com.app.service;

import com.app.domain.currency.input.GetCurrencyRequest;
import com.app.domain.currency.output.GetCurrencyResponse;

public interface CurrencyServiceBase {

	GetCurrencyResponse getCurrencies(GetCurrencyRequest request);
}
