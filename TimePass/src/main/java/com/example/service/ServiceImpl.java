package com.example.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.exception.EmployeeNotFoundException;
import com.example.model.Employee;
import com.example.repository.EmployeeRepo;

@org.springframework.stereotype.Service
public class ServiceImpl implements Service {

	@Autowired
	private EmployeeRepo repo;

	public ServiceImpl(EmployeeRepo repo) {

		this.repo = repo;
	}

	public ServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	

	public Employee add(Employee emp) {
		if (emp.getName() == null) {
			throw new EmployeeNotFoundException("employee name can't be empty");
		} else {
			return repo.save(emp);
		}

	}

	public Employee update(Employee emp) {
		Employee e = new Employee();
		if (e.getClass().getFields() != null) {
			return repo.save(emp);
		} else {
			throw new EmployeeNotFoundException("you must enter required fields first");
		}
		// return null;

	}

	public void delete(int id) {

		repo.deleteById(id);

	}

	public List<Employee> getAll() {

		List<Employee> list = new ArrayList<>();
		if (!list.isEmpty()) {

			return (List<Employee>) repo.findAll();
		}
		return null;
	}

	public Optional<Employee> getSingleEmployee(int id) {
		if (Employee.class.getFields() != null) {
			return repo.findById(id);
		}
		return null;

	}

}
