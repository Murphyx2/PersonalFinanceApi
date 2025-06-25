package com.app.service;

import com.app.domain.transaction.input.CreateTransactionRequest;
import com.app.domain.transaction.input.DeleteTransactionRequest;
import com.app.domain.transaction.input.GetListTransactionRequest;
import com.app.domain.transaction.input.GetTransactionRequest;
import com.app.domain.transaction.input.UpdateTransactionRequest;
import com.app.domain.transaction.output.CreateTransactionResponse;
import com.app.domain.transaction.output.DeleteTransactionResponse;
import com.app.domain.transaction.output.GetListTransactionResponse;
import com.app.domain.transaction.output.GetTransactionResponse;
import com.app.domain.transaction.output.GetTransactionTypeResponse;
import com.app.domain.transaction.output.UpdateTransactionResponse;

public interface TransactionServiceBase {

	CreateTransactionResponse createTransaction(CreateTransactionRequest request);

	DeleteTransactionResponse deleteTransaction(DeleteTransactionRequest request);

	GetListTransactionResponse getListTransaction(GetListTransactionRequest request);

	GetTransactionResponse getTransaction(GetTransactionRequest request);

	GetTransactionTypeResponse getTransactionType();

	UpdateTransactionResponse updateTransaction(UpdateTransactionRequest request);
}
