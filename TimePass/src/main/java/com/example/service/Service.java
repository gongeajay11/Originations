package com.example.service;

import java.util.List;

import com.example.model.Employee;

public interface Service {

	public Employee add(Employee emp);

	public Employee update(Employee emp);

	public void delete(int id);

	public List<Employee> getAll();

}
