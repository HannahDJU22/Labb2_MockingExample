package com.example;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepositoryStub implements EmployeeRepository{
    @Override
    public List<Employee> findAll() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("13", 30000));
        employees.add(new Employee("15", 40000));

        return employees;
    }

    @Override
    public Employee save(Employee e) {
        return null;
    }
}
