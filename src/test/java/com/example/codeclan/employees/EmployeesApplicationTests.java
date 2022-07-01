package com.example.codeclan.employees;

import com.example.codeclan.employees.models.Department;
import com.example.codeclan.employees.models.Employee;
import com.example.codeclan.employees.models.Project;
import com.example.codeclan.employees.repositories.DepartmentRepository;
import com.example.codeclan.employees.repositories.EmployeeRepository;
import com.example.codeclan.employees.repositories.ProjectsRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeesApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	DepartmentRepository departmentRepository;

	@Autowired
	ProjectsRepository projectsRepository;

	@Test
	void contextLoads() {
	}

	@Test
	void getAllEmployees() {
		Department department = new Department("First department");
		departmentRepository.save(department);

		Employee employee = new Employee("Joe", 29, 98214, "test@test.com", department);
		employeeRepository.save(employee);
	}

	@Test
	void canSaveProjects() {
		Department department = new Department("Second department");
		departmentRepository.save(department);

		Project project = new Project("Important project", 49);
		projectsRepository.save(project);

		Employee employee = new Employee("Dan", 83, 839422, "dan@dan.com", department);
		employee.addProject(project);
		employeeRepository.save(employee);

	}
}
