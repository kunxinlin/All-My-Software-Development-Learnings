package com.example.demo.service;

import com.example.demo.dao.EmployeeDAO;
import com.example.demo.dao.EmployeeRepository;
import com.example.demo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;


//Using Spring Data JPA
//No need for the other DAO and DAOImpl, just the EmployeeRepository
@Service
public class EmployeeServiceImpl implements EmployeeService{
    private EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee findById(int theId) {
        //different pattern than explicitly checking for null
        Optional<Employee> result = employeeRepository.findById(theId);
        Employee employee = null;

        if(result.isPresent()){
            employee = result.get();
        }
        else{
            throw new RuntimeException("Did not find Employee with the given id: " + theId);
        }

        return employee;
    }

    @Override
    public void save(Employee theEmployee) {
        employeeRepository.save(theEmployee);
    }

    @Override
    public void deleteById(int theId) {
        employeeRepository.deleteById(theId);
    }
}
