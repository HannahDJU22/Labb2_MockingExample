package com.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class EmployeeManagerTestNOMockito {

    public BankService bankServiceStub;
    public EmployeeRepository employeeRepositoryStub;
    public EmployeeManager employeeManager;
    public List<Employee> employees;


    @BeforeAll
    public void setUp(){
        bankServiceStub = new BankServiceStub();
        employeeRepositoryStub = new EmployeeRepositoryStub();
        //employeeManager = new EmployeeManager(employeeRepositoryStub, bankServiceStub);
        employees = new ArrayList<>();

        //employees.add(new Employee("13", 30000));
       // employees.add(new Employee("15", 40000));
    }

    @Test
    public void testPayEmployeesShouldSucceed(){

        //employees.get(0).setPaid(true);
        //employees.get(1).setPaid(true);

        EmployeeManager employeeManager = new EmployeeManager(employeeRepositoryStub, bankServiceStub);
        assertEquals(2, employeeManager.payEmployees());




    }
}
