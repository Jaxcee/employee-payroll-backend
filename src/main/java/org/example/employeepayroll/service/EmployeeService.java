package org.example.employeepayroll.service;

import org.example.employeepayroll.entity.Employee;
import org.example.employeepayroll.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;


@Service
public class EmployeeService implements IEmployeeService {
    @Autowired
    private EmployeeRepository repo;

    @Override
    public List<Employee> getAllEmployee() {
        return (List<Employee>) repo.findAll();
    }

    @Override
    public Employee getEmployee(int id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public Employee createEmployee(Employee employee) {
        repo.save(employee);
        return employee;
    }



    @Override
    public Employee updateEmployee(int id, Employee updatedEmployee) {
        Optional<Employee> optionalEmployee = repo.findById(id);
        if (optionalEmployee.isPresent()) {
            Employee employee = optionalEmployee.get();

            // Update employee data with the provided values
            employee.setName(updatedEmployee.getName());
            employee.setSalary(updatedEmployee.getSalary());
            employee.setStartdate(updatedEmployee.getStartdate());
            employee.setGender(updatedEmployee.getGender());
            employee.setProfilepicture(updatedEmployee.getProfilepicture());
            employee.setNotes(updatedEmployee.getNotes());
            employee.setDepartment(updatedEmployee.getDepartment());

            // Save the updated employee
            return repo.save(employee);
        } else {
            throw new NoSuchElementException("Employee with ID " + id + " not found");
        }
    }


    @Override
    public Employee deleteEmployee(int id) {
        Optional<Employee> optionalEmployee = repo.findById(id);
        if (optionalEmployee.isPresent()) {
            Employee employee = optionalEmployee.get();
            repo.delete(employee);
            return employee;
        } else {
            throw new NoSuchElementException("Employee with ID " + id + " not found");
        }
    }
}