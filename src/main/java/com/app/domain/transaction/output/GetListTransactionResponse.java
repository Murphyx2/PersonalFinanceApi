package com.app.domain.transaction.output;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

import com.app.domain.transaction.dto.TransactionDTO;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class GetListTransactionResponse implements Serializable {

	@Serial
	private static final long serialVersionUID = 682374915807321506L;

	private List<TransactionDTO> transactions;

	public GetListTransactionResponse withTransactions(List<TransactionDTO> transactions) {
		this.setTransactions(transactions);
		return this;
	}
}
