package com.example;

//dela upp testerna i ett test för Mockito och ett separat för Stub utan Mockito
//skapa stub-klasser av båda interfacen till testet utan MOckito
//skapa samma test på hela PayEmpployees för båda testerna
//sen testa att skriva ett test för min bankservice pay 1 av 2

//tips till framtida kurser att tex Sano är med första riktiga lektion, behövs inte med Ulf så klart

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
