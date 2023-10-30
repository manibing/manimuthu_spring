package com.gl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.gl.model.Employee;
import com.gl.service.EmployeeServiceImpl;

@Controller
//@RequestMapping("/")
public class EmployeeController {

	@Autowired
	EmployeeServiceImpl service;
	
@PostMapping("/list")
public String getEmployees(Model m) {
	List<Employee> e=service.getAllEmployeesSvc();
	m.addAttribute("employees",e);
	return"employeelist";
}

@RequestMapping("/add")
public String showAddEmployeeForm(Model m) {
	Employee e= new Employee();
	m.addAttribute("employee",e);
	return "employeeform";
}

@RequestMapping("/update")
public String showFormUpdate(@RequestParam("empId") int id,Model m) {
	Employee e=service.getEmployeeByIdSvc(id);
	m.addAttribute("employee",e);
	return"supplierform";
}
@RequestMapping("/save")
public String saveEmployee(@RequestParam("empId") int id,
		@RequestParam("empName") String eName,
		@RequestParam("empAddr") String eAddrr,
		@RequestParam("empPhone") String ephone,
		@RequestParam("empSalary") String eSalary,Model m) {
	
	Employee e= new Employee();
	if(id!=0) {
		e=service.getEmployeeByIdSvc(id);
		e.setEmployeeName(eName);
		e.setEmployeeAddress(eAddrr);
		e.setEmployeePhone(ephone);
		e.setEmployeeSalary(eSalary);
	}else {
		e=new Employee(eName,eAddrr,ephone,eSalary);
	}
	service.addSEmployee(e);
	
	
	return "redirect:/employees/list";
}

@RequestMapping("/delete")
public String deleteEmployee(@RequestParam("empId") int id) {
	service.deleteEmPloyeeSvc(id);
	return "redirect:/employees/list";
}
}
