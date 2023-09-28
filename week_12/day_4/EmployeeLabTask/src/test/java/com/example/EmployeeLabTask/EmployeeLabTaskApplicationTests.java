package com.example.EmployeeLabTask;

import com.example.EmployeeLabTask.models.Employee;
import com.example.EmployeeLabTask.repositories.EmployeeRepository;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class EmployeeLabTaskApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	Employee employee;

	@BeforeAll
	public void setup(){
		employee = new Employee("George",30,123456,"email@gmail.com");
	}

	@Test
	void contextLoads() {
	}

	@Test
	public void createEmployee(){
		employeeRepository.save(employee);
	}

}
