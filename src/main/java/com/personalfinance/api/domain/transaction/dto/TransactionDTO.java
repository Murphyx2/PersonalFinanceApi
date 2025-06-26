package com.personalfinance.api.domain.transaction.dto;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.personalfinance.api.domain.category.dto.CategoryDTO;
import com.personalfinance.api.domain.currency.DefaultCurrencies;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransactionDTO implements Serializable {

	@Serial
	private static final long serialVersionUID = 763509128437291506L;

	private String id;

	private String userId;

	private String budgetId;

	private CategoryDTO category;

	private DefaultCurrencies currencyCode;

	private String description;

	private Double amount;

	@JsonFormat(pattern = "yyyy-MM-dd' 'HH:mm:ss")
	private LocalDateTime transactionDate;

	@JsonFormat(pattern = "yyyy-MM-dd' 'HH:mm:ss")
	private LocalDateTime createdAt;

	@JsonFormat(pattern = "yyyy-MM-dd' 'HH:mm:ss")
	private LocalDateTime updatedAt;

	public TransactionDTO withAmount(Double amount) {
		this.setAmount(amount);
		return this;
	}

	public TransactionDTO withBudgetId(String budgetId) {
		this.setBudgetId(budgetId);
		return this;
	}

	public TransactionDTO withCategory(CategoryDTO category) {
		this.setCategory(category);
		return this;
	}

	public TransactionDTO withCreatedAt(LocalDateTime createdAt) {
		this.setCreatedAt(createdAt);
		return this;
	}

	public TransactionDTO withCurrencyCode(DefaultCurrencies currencyCode) {
		this.setCurrencyCode(currencyCode);
		return this;
	}

	public TransactionDTO withDescription(String description) {
		this.setDescription(description);
		return this;
	}

	public TransactionDTO withId(String id) {
		this.setId(id);
		return this;
	}

	public TransactionDTO withTransactionDate(LocalDateTime transactionDate) {
		this.setTransactionDate(transactionDate);
		return this;
	}

	public TransactionDTO withUpdatedAt(LocalDateTime updatedAt) {
		this.setUpdatedAt(updatedAt);
		return this;
	}

	public TransactionDTO withUserId(String userId) {
		this.setUserId(userId);
		return this;
	}
}
