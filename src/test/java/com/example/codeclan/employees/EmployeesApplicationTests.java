package com.example.codeclan.employees;

import com.example.codeclan.employees.models.Employee;
import com.example.codeclan.employees.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeesApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	void contextLoads() {
	}

	@Test
	void getAllEmployees() {
		Employee employee = new Employee("Joe", 29, 98214, "test@test.com");
		employeeRepository.save(employee);
	}
}
