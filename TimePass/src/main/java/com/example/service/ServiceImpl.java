package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.model.Employee;
import com.example.repository.EmployeeRepo;

@org.springframework.stereotype.Service
public class ServiceImpl implements Service {
	
	@Autowired
	EmployeeRepo repo;

	@Override
	public Employee add(Employee emp) {
		// TODO Auto-generated method stub
		return repo.save(emp);
	}

	@Override
	public Employee update(Employee emp) {
		// TODO Auto-generated method stub
		return repo.save(emp);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
		
	}

	@Override
	public List<Employee> getAll() {
		// TODO Auto-generated method stub
		return (List<Employee>) repo.findAll();
	}

}
