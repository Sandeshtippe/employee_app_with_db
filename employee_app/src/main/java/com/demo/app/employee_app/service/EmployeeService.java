package com.demo.app.employee_app.service;

import java.util.List;

import com.demo.app.employee_app.model.EmployeeDetails;

public interface EmployeeService {

	List<EmployeeDetails> findall();

	List<EmployeeDetails> findEmployeeByEmployeeNameStartingwith(String name);

	List<EmployeeDetails> findEmployeeByEmployeeRole(String role);

	void delete(Integer employeeId);

	EmployeeDetails save(EmployeeDetails employee);
	
//	EmployeeDetails updateEmployee(EmployeeDetails employee);

}
