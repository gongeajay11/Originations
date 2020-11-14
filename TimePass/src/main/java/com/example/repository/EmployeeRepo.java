package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Employee;

@Repository
public interface EmployeeRepo extends CrudRepository<Employee, Integer>, JpaRepository<Employee, Integer>,
		PagingAndSortingRepository<Employee, Integer> {

}
