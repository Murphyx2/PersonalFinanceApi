package com.personalfinance.api.domain.category;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import com.personalfinance.api.domain.categoryplanner.CategoryPlanner;
import com.personalfinance.api.domain.transaction.Transaction;
import com.personalfinance.api.domain.transaction.TransactionType;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Category implements Serializable {

	@Serial
	private static final long serialVersionUID = 391827506483921705L;

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID id;

	private UUID userId;

	@Column(nullable = false, unique = true)
	private String name;

	private TransactionType transactionType;

	@OneToMany(mappedBy = "category", orphanRemoval = true)
	@JsonBackReference
	private List<CategoryPlanner> categoryPlanners;

	@OneToMany(mappedBy = "category", fetch = FetchType.LAZY)
	@JsonBackReference
	private List<Transaction> transactions;

	@JsonFormat(pattern = "yyyy-MM-dd' 'HH:mm:ss")
	private LocalDateTime createdAt;

	public Category withCreatedAt(LocalDateTime createdAt) {
		this.setCreatedAt(createdAt);
		return this;
	}

	public Category withId(UUID id) {
		this.setId(id);
		return this;
	}

	public Category withName(String name) {
		this.setName(name);
		return this;
	}

	public Category withTransactionType(TransactionType transactionType) {
		this.setTransactionType(transactionType);
		return this;
	}

	public Category withUserId(UUID userId) {
		this.setUserId(userId);
		return this;
	}
}
