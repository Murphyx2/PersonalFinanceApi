package com.personalfinance.api.facade;

import java.util.List;

import com.personalfinance.api.domain.transaction.Transaction;

public interface TransactionRepositoryFacade {

	void deleteTransaction(Transaction transaction);

	Transaction getTransactionByIdAndUserId(String transactionId, String userId);

	List<Transaction> getTransactionsByBudgetIdAndUserId(String budgetId, String userId);

	Transaction saveTransaction(Transaction transaction);
}
