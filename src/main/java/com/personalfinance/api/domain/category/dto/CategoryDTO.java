package com.personalfinance.api.domain.category.dto;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

import com.personalfinance.api.domain.categoryplanner.CategoryPlanner;
import com.personalfinance.api.domain.transaction.Transaction;
import com.personalfinance.api.domain.transaction.TransactionType;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoryDTO implements Serializable {

	@Serial
	private static final long serialVersionUID = 374891506273482109L;

	private String id;

	private String userId;

	private String name;

	private TransactionType transactionType;

	@JsonFormat(pattern = "yyyy-MM-dd' 'HH:mm:ss")
	private LocalDateTime createdAt;

	public CategoryDTO withCreatedAt(LocalDateTime createdAt) {
		this.setCreatedAt(createdAt);
		return this;
	}

	public CategoryDTO withId(String id) {
		this.setId(id);
		return this;
	}

	public CategoryDTO withName(String name) {
		this.setName(name);
		return this;
	}

	public CategoryDTO withTransactionType(TransactionType transactionType) {
		this.setTransactionType(transactionType);
		return this;
	}

	public CategoryDTO withUserId(String userId) {
		this.setUserId(userId);
		return this;
	}
}
