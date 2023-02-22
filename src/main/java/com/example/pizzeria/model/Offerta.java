package com.example.pizzeria.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;

@Entity
public class Offerta {
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public LocalDate getDateStart() {
		return dateStart;
	}

	public void setDateStart(LocalDate dateStart) {
		this.dateStart = dateStart;
	}

	public LocalDate getDateEnd() {
		return dateEnd;
	}

	public void setDateEnd(LocalDate dateEnd) {
		this.dateEnd = dateEnd;
	}

	private String title;
	
	private LocalDate dateStart;
	
	private LocalDate dateEnd;

}
