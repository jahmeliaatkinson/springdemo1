package com.tcs.springbootdemo.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tcs.springbootdemo.model.Department;
import com.tcs.springbootdemo.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	List<Employee> findByDepartment(Department department , Sort sort);

	
	
	
}
