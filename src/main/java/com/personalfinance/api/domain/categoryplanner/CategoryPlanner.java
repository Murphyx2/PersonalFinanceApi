package com.personalfinance.api.domain.categoryplanner;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

import com.personalfinance.api.domain.budget.Budget;
import com.personalfinance.api.domain.category.Category;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class CategoryPlanner implements Serializable {

	@Serial
	private static final long serialVersionUID = 836492571308194206L;

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID id;

	private UUID userId;

	@Column(name = "budget_id", nullable = false)
	private UUID budgetId;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "budget_id", nullable = false, insertable = false, updatable = false)
	@JsonBackReference
	private Budget budget;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "category_id", nullable = false)
	@JsonManagedReference
	private Category category;

	private Double plannedAmount;

	@JsonFormat(pattern = "yyyy-MM-dd' 'HH:mm:ss")
	private LocalDateTime createdAt;

	@JsonFormat(pattern = "yyyy-MM-dd' 'HH:mm:ss")
	private LocalDateTime updatedAt;

	public CategoryPlanner withBudgetId(UUID budgetId) {
		this.setBudgetId(budgetId);
		return this;
	}

	public CategoryPlanner withCategory(Category category) {
		this.setCategory(category);
		return this;
	}

	public CategoryPlanner withCreatedAt(LocalDateTime createdAt) {
		this.setCreatedAt(createdAt);
		return this;
	}

	public CategoryPlanner withId(UUID id) {
		this.setId(id);
		return this;
	}

	public CategoryPlanner withPlannedAmount(Double plannedAmount) {
		this.setPlannedAmount(plannedAmount);
		return this;
	}

	public CategoryPlanner withUpdatedAt(LocalDateTime updatedAt) {
		this.setUpdatedAt(updatedAt);
		return this;
	}

	public CategoryPlanner withUserId(UUID userId) {
		this.setUserId(userId);
		return this;
	}
}
