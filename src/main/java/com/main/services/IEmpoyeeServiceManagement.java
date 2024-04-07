package com.main.services;

import java.util.List;

import com.main.entity.Employee;

public interface IEmpoyeeServiceManagement 
{
       public String registerSingleEmployee(Employee emp);
       public String registerAllEmployee(List<Employee> empList);
       public Employee getEmployeeById(Integer empId);
       public List<Employee> getAllEmployee();
       public List<Employee> getAllEmployeeById(List<Integer> idList);
       public String deleteEmployeeById(Integer id);
}
