package com.example.jpa.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import com.example.jpa.DAO.EmployeeDAO;
import com.example.jpa.entities.Employee;

@Service
public class EmployeeService {

	@Autowired
	EmployeeDAO empdao;

	public List<Employee> addEmployee(Employee emp) {
		empdao.saveAndFlush(emp);
		return empdao.findAll();
	}
	
	public List<Employee> findEmployeeByName(String name){
		return empdao.findByName(name);	
	}

	public List<Employee> findAllEmployee(){
		return empdao.findAllEmloyee();	
	}
	
}
