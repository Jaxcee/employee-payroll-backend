package org.example.employeepayroll.controller;
import org.example.employeepayroll.entity.Employee;
import org.example.employeepayroll.repository.EmployeeRepository;
import org.example.employeepayroll.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@CrossOrigin
public class EmployeeController {

    @Autowired
    IEmployeeService iEmployeeService;
    //get all the employees
    @GetMapping("/employees")
    public List<Employee> getAllEmployees(){
        return iEmployeeService.getAllEmployee();
    }
    //localhost:8080/employees/1
   @GetMapping("/employees/{id}")
  public Employee getEmployee(@PathVariable int id){
        return iEmployeeService.getEmployee(id);
    }
    //insert
    @PostMapping("/employees/add")
    @ResponseStatus(code = HttpStatus.CREATED)
    public Employee createEmployee(@RequestBody Employee employee) {
        return iEmployeeService.createEmployee(employee);
    }


  //update

  @PutMapping("/employees/update/{id}")
  public Employee updateEmployee(@PathVariable int id,@RequestBody Employee updatedEmployee){
        return iEmployeeService.updateEmployee(id,updatedEmployee);

   }
//delete
    @DeleteMapping("/employees/delete/{id}")
    public Employee removeEmployee(@PathVariable int id){
       return iEmployeeService.deleteEmployee(id);
    }
}
