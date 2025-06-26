package com.personalfinance.api.service;

import com.personalfinance.api.domain.transaction.input.CreateTransactionRequest;
import com.personalfinance.api.domain.transaction.input.DeleteTransactionRequest;
import com.personalfinance.api.domain.transaction.input.GetListTransactionRequest;
import com.personalfinance.api.domain.transaction.input.GetTransactionRequest;
import com.personalfinance.api.domain.transaction.input.UpdateTransactionRequest;
import com.personalfinance.api.domain.transaction.output.CreateTransactionResponse;
import com.personalfinance.api.domain.transaction.output.DeleteTransactionResponse;
import com.personalfinance.api.domain.transaction.output.GetListTransactionResponse;
import com.personalfinance.api.domain.transaction.output.GetTransactionResponse;
import com.personalfinance.api.domain.transaction.output.GetTransactionTypeResponse;
import com.personalfinance.api.domain.transaction.output.UpdateTransactionResponse;

public interface TransactionServiceBase {

	CreateTransactionResponse createTransaction(CreateTransactionRequest request);

	DeleteTransactionResponse deleteTransaction(DeleteTransactionRequest request);

	GetListTransactionResponse getListTransaction(GetListTransactionRequest request);

	GetTransactionResponse getTransaction(GetTransactionRequest request);

	GetTransactionTypeResponse getTransactionType();

	UpdateTransactionResponse updateTransaction(UpdateTransactionRequest request);
}
