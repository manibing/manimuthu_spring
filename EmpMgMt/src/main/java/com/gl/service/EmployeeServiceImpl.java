package com.gl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.gl.dao.EmployeeDao;
import com.gl.model.Employee;

@Service
@EnableTransactionManagement
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	EmployeeDao dao;

	@Override
	public void addSEmployee(Employee s) {
		// TODO Auto-generated method stub
		dao.saveEmployeeDao(s);
		
	}

	@Override
	public List<Employee> getAllEmployeesSvc() {
		// TODO Auto-generated method stub
		return dao.getAllEmployeesDao();
	}

	@Override
	public void deleteEmPloyeeSvc(int id) {
		// TODO Auto-generated method stub
		dao.deleteEmployeeDao(id);
	}

	@Override
	public Employee getEmployeeByIdSvc(int id) {
		// TODO Auto-generated method stub
		return dao.getEmployeeByIddao(id);
	}

	


}
