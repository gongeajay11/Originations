package com.example.integration;

import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.example.service.Service;
import com.example.service.ServiceImpl;

@RunWith(MockitoJUnitRunner.class)
public class EmployeeTestController {
	@InjectMocks
	ServiceImpl impl;
	@Mock
	Service service;

}
