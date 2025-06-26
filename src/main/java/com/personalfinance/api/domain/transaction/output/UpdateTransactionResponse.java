package com.personalfinance.api.domain.transaction.output;

import com.personalfinance.api.domain.transaction.dto.TransactionDTO;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UpdateTransactionResponse {

	private TransactionDTO transaction;

	public UpdateTransactionResponse withTransaction(TransactionDTO transaction) {
		this.setTransaction(transaction);
		return this;
	}
}
