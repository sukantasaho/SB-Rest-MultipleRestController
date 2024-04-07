package com.main.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.entity.Employee;
import com.main.exception.ResourceNotFoundException;
import com.main.repository.IEmployeeRepository;

@Service("/empService")
public class EmployeeServiceManagementImp implements IEmpoyeeServiceManagement
{

	@Autowired
	private IEmployeeRepository repo;
	
	@Override
	public String registerSingleEmployee(Employee emp) 
	{
		     Employee emp1 = repo.save(emp);
		     
		return "Employee record is inserted with id-"+emp1.getEno();
	}

	 
	public String registerAllEmployee(List<Employee> empList) 
	{
	             List<Employee> eList = repo.saveAll(empList);
	             List<Integer> idList = eList.stream().map(e->e.getEno()).collect(Collectors.toList());
		
	    
	   return "Bulk of employee records are saved with ids-"+idList;
	}

	 
	public Employee getEmployeeById(Integer empId)
	{
		     
		return repo.findById(empId).orElseThrow(()-> new ResourceNotFoundException());
	}

	public List<Employee> getAllEmployee() 
	{
		 
		return repo.findAll();
	}

 
	public List<Employee> getAllEmployeeById(List<Integer> idList)
	{
		 
		return repo.findAllById(idList);
	}

 
	public String deleteEmployeeById(Integer id) 
	{
		     Optional<Employee> opt = repo.findById(id);
		     String msg = null;
		     if(opt.isPresent())
		     {
		    	 repo.deleteById(id);
		    	 msg = "Employee record deleted successfully completed with id-"+id;
		     }
		     else 
		    	 msg = "Record is not found with id-"+id;
		     
		return msg;
	}

}
