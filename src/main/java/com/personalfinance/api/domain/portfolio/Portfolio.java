package com.personalfinance.api.domain.portfolio;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import com.personalfinance.api.domain.budget.Budget;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
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
public class Portfolio implements Serializable {

	@Serial
	private static final long serialVersionUID = 529381704692813507L;

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID id;

	private UUID userId;

	private String name;

	private String description;

	@OneToMany(mappedBy = "portfolio", cascade = CascadeType.ALL)
	@JsonManagedReference
	private List<Budget> budgets;

	@JsonFormat(pattern = "yyyy-MM-dd' 'HH:mm:ss")
	private LocalDateTime created;

	@JsonFormat(pattern = "yyyy-MM-dd' 'HH:mm:ss")
	private LocalDateTime updated;

	public Portfolio withBudgets(List<Budget> budgets) {
		this.setBudgets(budgets);
		return this;
	}

	public Portfolio withCreated(LocalDateTime created) {
		this.setCreated(created);
		return this;
	}

	public Portfolio withDescription(String description) {
		this.setDescription(description);
		return this;
	}

	public Portfolio withId(UUID id) {
		this.setId(id);
		return this;
	}

	public Portfolio withName(String name) {
		this.setName(name);
		return this;
	}

	public Portfolio withUpdated(LocalDateTime updated) {
		this.setUpdated(updated);
		return this;
	}

	public Portfolio withUserId(UUID userId) {
		this.setUserId(userId);
		return this;
	}
}
