package com.example.demo.dao;

import com.example.demo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Repository
public class EmployeeDAOImplJPA implements EmployeeDAO{
    private EntityManager entityManager;

    @Autowired
    public EmployeeDAOImplJPA(EntityManager entityManager){
        this.entityManager = entityManager;
    }

    @Override
    public List<Employee> findAll() {
        Query query = entityManager.createQuery("from Employee");
        List<Employee> employees = query.getResultList();
        return employees;
    }

    @Override
    public Employee findById(int theId) {
        return entityManager.find(Employee.class, theId);
    }

    @Override
    public void save(Employee theEmployee) {
        Employee employee = entityManager.merge(theEmployee);
        theEmployee.setId(employee.getId());

    }

    @Override
    public void deleteById(int theId) {
        Query query = entityManager.createQuery("delete from Employee where id=:employs ");
        query.setParameter("employeeId", theId);
        query.executeUpdate();
    }
}
