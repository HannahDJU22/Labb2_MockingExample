package com.example;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class EmployeeManagerTestMockito {

    public BankService bankServiceMock;
    public EmployeeRepository employeeRepositoryMock;
    public EmployeeManager employeeManager;
    public List<Employee> employees;

    @BeforeAll
    public void setUp(){
        bankServiceMock = mock(BankService.class);
        employeeRepositoryMock = mock(EmployeeRepository.class);
        employeeManager = new EmployeeManager(employeeRepositoryMock, bankServiceMock);
        employees = new ArrayList<>();
    }
    @Test
    public void testPayEmployeesShouldRunSuccessfully(){
        employees.add(new Employee("1", 200));
        employees.add(new Employee("2", 200));
        employees.add(new Employee("77", 40000));
        employees.add(new Employee("46", 55000));

        when(employeeRepositoryMock.findAll()).thenReturn(employees);

        assertEquals(4, employeeManager.payEmployees());

    }



}
