package com.southwark.api.items;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;

@Data
@Document(collection = "items")
public class Items {

	@Id
	private String id;
	private String name;
	private String description;
	private Double amount;
	private Boolean availability;

	public Items(String name, String description, Double amount, Boolean availability) {
		this.name = name;
		this.description = description;
		this.amount = amount;
		this.availability = availability;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Boolean getAvailability() {
		return availability;
	}

	public void setAvailability(Boolean availability) {
		this.availability = availability;
	}

	@Override
	public String toString() {
		return "Items [id=" + id + ", name=" + name + ", description=" + description + ", amount=" + amount
				+ ", availability=" + availability + "]";
	}
}