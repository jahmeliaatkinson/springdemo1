package com.tcs.springbootdemo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.springbootdemo.model.Department;
import com.tcs.springbootdemo.repository.DepartmentRepository;
@Service



public class DepartmentServiceImpl implements DepartmentService {
	
	@Autowired
	DepartmentRepository departmentRepository;
	
	
	@Override
	public String addDepartment(Department department) {
		Department department2 = null;
		try {
			department2 = departmentRepository.save(department);
			return "success";
		}catch (Exception e) {
			e.printStackTrace();
			return "fail";
		}
		
		
	}
	

	@Override
	public String updateDepartment(Department department) {
		
		return null;
	}

	@Override
	public String deleteDepartment(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Department> findById(int id) {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public Optional<List<Department>> getDepartments() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<List<Department>> findByOrganizationId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
