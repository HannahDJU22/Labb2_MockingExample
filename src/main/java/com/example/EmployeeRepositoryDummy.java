package com.example;

import java.util.List;

public class EmployeeRepositoryDummy implements EmployeeRepository{
    @Override
    public List<Employee> findAll() {
        return null;
    }

    @Override
    public Employee save(Employee e) {
        return null;
    }
}
