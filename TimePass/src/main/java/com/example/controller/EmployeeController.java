package com.example.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Employee;
import com.example.service.ServiceImpl;

@RestController
@Validated
public class EmployeeController {

	@Autowired
	ServiceImpl ser;

	public EmployeeController(ServiceImpl ser) {

		this.ser = ser;
	}

	@PostMapping(value = "/api/applications")
	public Employee addEmployee(@Valid @RequestBody Employee emp) {
		return ser.add(emp);
	}

	@PutMapping(value = "/api/applications/update")
	public Employee updateEmployee(@Valid @RequestBody Employee emp) {
		return ser.add(emp);
	}

	@DeleteMapping(value = "/api/applications/{id}")
	public void deleteEmployee(@PathVariable int id) {
		ser.delete(id);
	}

	@GetMapping(value = "/api/applications/get")
	public List<Employee> getEmployee() {
		return ser.getAll();
	}

}
