<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2><a href="/EmpMgMt/employees/add"></a>Add Record</h2>
<form>
<table colspan="6">
<tr>
<th>Employee Name</th><th>Employee Address</th><th>Employee Phone</th><th>Employee salary</th><th>Action1</th>
<th>Action2</th></tr>

<c:forEach items="${employees }" var="employee">
<tr>
<td>${employee.employeeName }</td>
<td>${employee.employeeAddress }</td>
<td>${employee.employeePhone }</td>
<td>${employee.employeeSalary }</td>
<td><a href="/employees/update?empId=${employee.id }">update</a></td>
<td><a href="/employees/delete?empId=${employee.id }">delete</a></td>
</tr>
</c:forEach>
</table>
</form>


</body>
</html>