package com.app.domain.transaction.output;

import java.io.Serial;
import java.io.Serializable;

import com.app.domain.transaction.Transaction;
import com.app.domain.transaction.dto.TransactionDTO;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class GetTransactionResponse implements Serializable {

	@Serial
	private static final long serialVersionUID = 429381706593821407L;

	private TransactionDTO transaction;

	public GetTransactionResponse withTransaction(TransactionDTO transaction) {
		this.setTransaction(transaction);
		return this;
	}
}
