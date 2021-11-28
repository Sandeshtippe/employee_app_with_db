package com.demo.app.employee_app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.demo.app.employee_app.model.EmployeeDetails;
@Repository
public interface EmployeeRepository extends CrudRepository<EmployeeDetails, Integer> {

	@Query("from EmployeeDetails")
	List<EmployeeDetails> findAll();

//	List<EmployeeDetails> findEmployeeByEmployeeNameStartingWith(String employeeName); 

	List<EmployeeDetails> findByEmployeeName(String employeeName);

	List<EmployeeDetails> findByEmployeeRole(String employeeRole);

//	EmployeeDetails remove(Integer employeeId);

//	EmployeeDetails save(EmployeeDetails employeeDetails);

}
