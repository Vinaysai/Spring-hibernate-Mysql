package com.spring.hibernate.Service;

import java.util.List;

import javax.transaction.Transactional;

import com.spring.hibernate.Dao.EmployeeDao;
import com.spring.hibernate.bean.Employee;

public interface EmployeeService {

	void addEmployee(Employee employee);

	void deleteEmployee(Integer employeeId);

	List<Employee> getAllEmployees();

	Employee getEmployee(int empid);

	EmployeeDao getEmployeeDAO();

	void setEmployeeDAO(EmployeeDao employeeDAO);

	Employee updateEmployee(Employee employee);

}