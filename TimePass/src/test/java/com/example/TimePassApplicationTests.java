package com.example;

import org.aspectj.lang.annotation.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.example.controller.EmployeeController;
import com.example.service.Service;
import com.fasterxml.jackson.databind.ObjectMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
class TimePassApplicationTests {

	@Mock
	Service ser;
	@InjectMocks
	EmployeeController controller;
	@Autowired
	private ObjectMapper mapper;

	@Before
	public void setup() {

	}

//	@Test
	@After(value = "a")
	public void teardown() {
		// TODO Auto-generated method stub

	}
}
