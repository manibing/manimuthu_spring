package com.gl.dao;

import java.util.List;

import com.gl.model.Employee;

public interface EmployeeDao {
	
	public Employee getEmployeeByIddao(int id);
	public List<Employee> getAllEmployeesDao();
	public void saveEmployeeDao(Employee employee);
	public void deleteEmployeeDao(int id);
}
