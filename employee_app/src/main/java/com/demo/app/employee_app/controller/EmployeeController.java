package com.demo.app.employee_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.demo.app.employee_app.model.EmployeeDetails;
import com.demo.app.employee_app.service.EmployeeService;

@RestController // for rest response
@RequestMapping("/employee")

public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;

	// list of all employee
	@RequestMapping(value = "/employeelist", method = RequestMethod.GET)
	public java.util.List<EmployeeDetails> listEmployee() {
		System.out.println("Controller....");
		return employeeService.findall();

	}

	// search employee start with name
	@RequestMapping(value = "/startWithName/{name}")
	public java.util.List<EmployeeDetails> findByName(@PathVariable("name") String name) {
		return employeeService.findEmployeeByEmployeeNameStartingwith(name);
	}

	// search employee by role
	@RequestMapping(value = "/findByRole/{role}")
	public java.util.List<EmployeeDetails> findByRole(@PathVariable("role") String role) {
		return employeeService.findEmployeeByEmployeeRole(role);
	}

	// delete specific employee using employee id
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable("id") Integer id) {
		employeeService.delete(id);
	}

	// add new employee
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public EmployeeDetails save(@RequestBody EmployeeDetails employee) {
		return employeeService.save(employee);
	}
	// update employee
//	@RequestMapping(value = "/update/{id}",method = RequestMethod.PUT)
//	public EmployeeDetails update(@RequestBody EmployeeDetails employee ) {
//		return employeeService.updateEmployee(employee);
//		
//	}

}
