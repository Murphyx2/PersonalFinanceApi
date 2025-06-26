package com.personalfinance.api.domain.categoryplanner.dto;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.personalfinance.api.domain.category.Category;
import com.personalfinance.api.domain.category.dto.CategoryDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoryPlannerDTO implements Serializable {

	@Serial
	private static final long serialVersionUID = 687204931506827413L;

	private String id;

	private String userId;

	private String budgetId;

	private CategoryDTO category;

	private Double plannedAmount;

	@JsonFormat(pattern = "yyyy-MM-dd' 'HH:mm:ss")
	private LocalDateTime createdAt;

	@JsonFormat(pattern = "yyyy-MM-dd' 'HH:mm:ss")
	private LocalDateTime updatedAt;

	public CategoryPlannerDTO withBudgetId(String budgetId) {
		this.setBudgetId(budgetId);
		return this;
	}

	public CategoryPlannerDTO withCategory(CategoryDTO category) {
		this.setCategory(category);
		return this;
	}

	public CategoryPlannerDTO withCreatedAt(LocalDateTime createdAt) {
		this.setCreatedAt(createdAt);
		return this;
	}

	public CategoryPlannerDTO withId(String id) {
		this.setId(id);
		return this;
	}

	public CategoryPlannerDTO withPlannedAmount(Double plannedAmount) {
		this.setPlannedAmount(plannedAmount);
		return this;
	}

	public CategoryPlannerDTO withUpdatedAt(LocalDateTime updatedAt) {
		this.setUpdatedAt(updatedAt);
		return this;
	}

	public CategoryPlannerDTO withUserId(String userId) {
		this.setUserId(userId);
		return this;
	}
}
