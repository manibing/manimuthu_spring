<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Add/Update Supplier Details</h2>
<form action="/employees/save" method="POST">
<table border="2">
<tr><td></td><td><input type="hidden" name="empId" value="${employee.id }"/></td></tr>
<tr><td>Employee Name</td><td><input type="text" name="empName" value="${employee.employeeName }"/></td></tr>
<tr><td>Employee Address</td><td><input type="text" name="empAddrr" value="${employee.employeeAddress }"/></td></tr>
<tr><td>Employee Phone</td><td><input type="text" name="empPhone" value="${employee.employeePhone }"/></td></tr>
<tr><td>Employee salary</td><td><input type="text" name="empSalary" value="${employee.employeeSalary }"/></td></tr>
<tr>
<td><input type="submit" value="save.."/></td>
<td><input type="reset" value="Reset.."/></td>

</table>
</form>
</body>
</html>