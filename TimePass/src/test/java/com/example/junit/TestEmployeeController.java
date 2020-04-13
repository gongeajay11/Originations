package com.example.junit;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.any;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.controller.EmployeeController;
import com.example.model.Employee;
import com.example.service.Service;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RunWith(MockitoJUnitRunner.class)
public class TestEmployeeController {
	@Mock
	Service ser;
	@InjectMocks
	EmployeeController controller;
	@Autowired
	private ObjectMapper mapper;

	@Before
	public void setup() {

	}

	@Test
	public void testAddEmployee() throws JsonProcessingException {
		Employee e = new Employee(1, "ajay");
		String json = mapper.writeValueAsString(e);

		Mockito.when(controller.addEmployee(any())).thenReturn(ser.add(e));

		assertEquals(json, e);

	}
}
