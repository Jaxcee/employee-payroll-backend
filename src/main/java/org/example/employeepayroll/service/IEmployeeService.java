package org.example.employeepayroll.service;

import org.example.employeepayroll.entity.Employee;

import java.util.List;

public interface IEmployeeService {

   List<Employee> getAllEmployee();
    Employee getEmployee(int id);

    Employee createEmployee(Employee employee);


 Employee updateEmployee(int id, Employee updatedEmployee);

 Employee deleteEmployee(int id);
}
