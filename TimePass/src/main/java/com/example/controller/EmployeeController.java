package com.example.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
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
	@ResponseStatus(value = HttpStatus.CREATED)
	public Employee addEmployee(@Valid @RequestBody HttpHeaders httpHeaders, Employee emp) {
		return ser.add(emp);
	}

	@PutMapping(value = "/api/applications/update/{id}")
	@ResponseStatus(value = HttpStatus.OK)
	public Employee updateEmployee(@Valid @RequestBody HttpHeaders httpHeaders,
			@PathVariable(value = "id", required = true) int id, Employee emp) {
		return ser.add(emp);
	}

	@DeleteMapping(value = "/api/applications/{id}")
	@ResponseStatus(value = HttpStatus.OK)
	public void deleteEmployee(@PathVariable(value = "id", required = true) int id) {
		ser.delete(id);
	}

	@GetMapping(value = "/api/applications/get")
	@ResponseStatus(value = HttpStatus.OK)
	public List<Employee> getEmployee() {
		return ser.getAll();
	}

	@GetMapping(value = "/api/applications/get/{id}")
	@ResponseStatus(value = HttpStatus.OK)
	public Optional<Employee> getSingleEmployee(@PathVariable(value = "id", required = true) int id) {
		return ser.getSingleEmployee(id);
	}

}
