package com.app.domain.transaction.output;

import java.util.Set;

import com.app.domain.transaction.TransactionType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class GetTransactionTypeResponse {

	private Set<TransactionType> transactionType;

	public GetTransactionTypeResponse withTransactionType(Set<TransactionType> transactionTypeSet) {
		this.setTransactionType(transactionTypeSet);
		return this;
	}
}
