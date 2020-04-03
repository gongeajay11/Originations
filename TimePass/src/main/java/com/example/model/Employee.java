package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import io.micrometer.core.lang.NonNull;

@Entity
@Table(name = "emp_table")
public class Employee {

	@Id
	@Column(name = "emp_id")
	@NotEmpty
	@NotBlank
	private int id;

	public Employee() {

	}

	@Column(name = "emp_name")
	@NonNull
	@NotBlank
	@Size(min = 3, max = 15, message = "your name size doesn't match")
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Employee(int id, String name) {

		this.id = id;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
