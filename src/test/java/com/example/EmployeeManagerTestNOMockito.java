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
        employees = new ArrayList<>();

    }

    @Test
    public void testPayEmployeesShouldSucceed(){

        //employees.get(0).setPaid(true);
        //employees.get(1).setPaid(true);

        employeeManager = new EmployeeManager(employeeRepositoryStub, bankServiceStub);
        assertEquals(2, employeeManager.payEmployees());




    }
}
