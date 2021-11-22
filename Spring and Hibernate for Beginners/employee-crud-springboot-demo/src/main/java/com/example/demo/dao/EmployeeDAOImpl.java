package com.example.demo.dao;


import com.example.demo.entity.Employee;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {
    private EntityManager entityManager;

    @Autowired
    public EmployeeDAOImpl(EntityManager entityManager){
        this.entityManager = entityManager;
    }

    @Override
    @Transactional  //handles transaction management, so we don't have to manually start and commit transaction
    public List<Employee> findAll() {
        //get the current Hibernate session
        Session currentSession = entityManager.unwrap(Session.class);

        //create a query
        Query<Employee> query = currentSession.createQuery("from Employee", Employee.class);

        //return query.getResultList();
        List<Employee> employees = query.getResultList();
        return employees;
    }

    @Override
    public Employee findById(int theId) {
        Session currentSession = entityManager.unwrap(Session.class);

        Employee theEmployee = currentSession.get(Employee.class, theId);
        return theEmployee;
    }


    @Override
    public void save(Employee theEmployee) {
        Session currentSession = entityManager.unwrap(Session.class);

        // save employee
        currentSession.saveOrUpdate(theEmployee);
    }


    @Override
    public void deleteById(int theId) {
        Session currentSession = entityManager.unwrap(Session.class);

        // delete object with primary key
        Query query = currentSession.createQuery("delete from Employee where id=:employeeId");
        query.setParameter("employeeId", theId);
        query.executeUpdate();
    }
}
