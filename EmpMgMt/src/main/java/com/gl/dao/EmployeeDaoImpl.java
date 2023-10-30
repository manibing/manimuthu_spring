package com.gl.dao;

import java.util.List;
import java.util.function.Supplier;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.gl.model.Employee;



@Repository
@EnableTransactionManagement
public class EmployeeDaoImpl implements EmployeeDao {

	
	@Autowired
	SessionFactory sf;
	Session session;
	
	
	public EmployeeDaoImpl(SessionFactory sf) {
		super();
		this.sf = sf;
		this.session = sf.openSession();
	}


	@Override
	@Transactional
	public Employee getEmployeeByIddao(int id) {
		// TODO Auto-generated method stub
		Employee e= new Employee();
		Transaction tx= session.beginTransaction();
		e=session.get(Employee.class, id);
		tx.commit();
		return e;
	}


	@Override
	public List<Employee> getAllEmployeesDao() {
		// TODO Auto-generated method stub
		Transaction tx= session.beginTransaction();
		List<Employee> e= session.createQuery("from employee").list();
		tx.commit();
		return e;
	}


	@Override
	public void saveEmployeeDao(Employee employee) {
		// TODO Auto-generated method stub
		Transaction tx= session.beginTransaction();
		session.save(employee);
		tx.commit();
		
	}


	@Override
	public void deleteEmployeeDao(int id) {
		// TODO Auto-generated method stub
		Transaction tx= session.beginTransaction();
		Employee e=session.get(Employee.class, id);
		session.delete(e);
	}



}
