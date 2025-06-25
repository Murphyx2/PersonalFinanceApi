package com.app.domain.transaction.output;

import com.app.domain.transaction.dto.TransactionDTO;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CreateTransactionResponse {

	private TransactionDTO transaction;

	public CreateTransactionResponse withTransaction(TransactionDTO transaction) {
		this.setTransaction(transaction);
		return this;
	}
}
