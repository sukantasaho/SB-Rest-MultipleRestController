package com.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.main.entity.Employee;
import com.main.services.IEmpoyeeServiceManagement;

@RestController
@RequestMapping("/employee/api")
public class EmployeeController 
{
      
	@Autowired
	private IEmpoyeeServiceManagement service;
	
	 
	@PostMapping("/saveEmployee")
	public ResponseEntity<String> registerSingleEmployee(@RequestBody Employee emp) 
	{
		     String msg = service.registerSingleEmployee(emp);
		     
		return  new ResponseEntity<String>(msg, HttpStatus.CREATED);
	}

    @PostMapping("/registerAllEmployee")
	public ResponseEntity<String>  registerAllEmployee(@RequestBody List<Employee> empList) 
	{
	          String msg = service.registerAllEmployee(empList);
	          
		return new ResponseEntity<String>(msg, HttpStatus.CREATED);
	}

	 
    @GetMapping("/getEmployeeById/{empId}")
	public Employee getEmployeeById(@PathVariable Integer empId)
	{
		 
		return service.getEmployeeById(empId);
	}

	@GetMapping("/getAllEmployee")
	public List<Employee> getAllEmployee() 
	{
		 
		return  service.getAllEmployee();
	}

	@GetMapping("/getAllEmployeeById/{idList}")
	public List<Employee> getAllEmployeeById(@PathVariable List<Integer> idList)
	{
		 
		return service.getAllEmployeeById(idList);
	}

	@DeleteMapping("/delete/{id}")
	public String deleteEmployeeById(@PathVariable Integer id) 
	{
		 
		return service.deleteEmployeeById(id);
	}
}
