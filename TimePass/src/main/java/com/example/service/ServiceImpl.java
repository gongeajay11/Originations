package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.model.Employee;
import com.example.repository.EmployeeRepo;

@org.springframework.stereotype.Service
public class ServiceImpl implements Service {

	@Autowired
	private EmployeeRepo repo;

	public ServiceImpl(EmployeeRepo repo) {

		this.repo = repo;
	}

	public Employee add(Employee emp) {

		return repo.save(emp);
	}

	public Employee update(Employee emp) {

		return repo.save(emp);
	}

	
	public void delete(int id) {

		repo.deleteById(id);

	}

	public List<Employee> getAll() {

		return (List<Employee>) repo.findAll();
	}

	public Optional<Employee> getSingleEmployee(int id) {

		return repo.findById(id);
	}

}
