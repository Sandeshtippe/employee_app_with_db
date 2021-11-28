package com.demo.app.employee_app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.app.employee_app.dao.EmployeeRepository;
import com.demo.app.employee_app.model.EmployeeDetails;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

//	public List<EmployeeDetails> findAll() {
//		System.out.println("EmployeeServiceImpl...");
//		return employeeRepository.findAll();
//
//	}

//	public List<EmployeeDetails> findEmployeeByEmployeeNameStartingWith(String name) {
//		return employeeRepository.findByEmployeeName(name);
//	}

	@Override
	public List<EmployeeDetails> findEmployeeByEmployeeRole(String role) {
		return employeeRepository.findByEmployeeRole(role);
	}

	@Override
	public void delete(Integer employeeId) {
		Optional<EmployeeDetails> employee = employeeRepository.findById(employeeId);
		EmployeeDetails emp = employee.get();
		employeeRepository.delete(emp);
	}

	@Override
	public EmployeeDetails save(EmployeeDetails employee) {
		return employeeRepository.save(employee);
	}

	@Override
	public List<EmployeeDetails> findall() {
		System.out.println("EmployeeServiceImpl...");
		return employeeRepository.findAll();
	}

	@Override
	public List<EmployeeDetails> findEmployeeByEmployeeNameStartingwith(String name) {
		return employeeRepository.findByEmployeeName(name);

	}

//	@Override
//	public EmployeeDetails updateEmployee(EmployeeDetails employee) {
//
//		EmployeeDetails employeeDetails=employee.get();	
//	}
}
