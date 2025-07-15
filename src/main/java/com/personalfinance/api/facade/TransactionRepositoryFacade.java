package com.personalfinance.api.facade;

import java.util.List;

import com.personalfinance.api.domain.transaction.Transaction;
import com.personalfinance.api.domain.transaction.dto.TransactionDTO;

public interface TransactionRepositoryFacade {

	void deleteTransaction(TransactionDTO transaction);

	TransactionDTO getTransactionByIdAndUserId(String transactionId, String userId);

	List<TransactionDTO> getTransactionsByBudgetIdAndUserId(String budgetId, String userId);

	TransactionDTO saveTransaction(Transaction transaction);

	TransactionDTO updateTransaction(TransactionDTO transaction);
}
