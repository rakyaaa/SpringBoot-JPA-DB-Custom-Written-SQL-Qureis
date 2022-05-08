package com.example.jpa.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import com.example.jpa.entities.Employee;

@Repository("empDao")
public interface EmployeeDAO extends JpaRepository<Employee, Integer>{
	
	//In this DAO, We will write the custom Quries
	
	@Query("Select e from Employee e where e.empName =:name")
	public List<Employee> findByName(String name);
	
	@Query(value ="Select * from Employee" ,nativeQuery = true )
	public List<Employee> findAllEmloyee();
	

}
