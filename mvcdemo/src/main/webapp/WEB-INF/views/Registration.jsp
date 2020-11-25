<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
THis is Login Page

<table>
<form action="/Registration/Registration.jsp" method="post">
<tr>
<td>FirstName
</td>
<td><input type="text" name="firstName" /><div>${firstName }</div>
</tr>
<tr>
<td>LastName
</td>
<td><input type="text" name="lastName" /><div>${lastName }</div>
</tr>
<tr>
<td>UserName
</td>
<td><input type="text" name="firstName" /><div>${userName }</div>
</tr>
<tr>
<td>Password
</td>
<td><input type="text" name="password" />
</tr><tr>
<tr>
<td>Address
</td>
<td><input type="text" name="Address" /><div>${Address }</div>
</tr>
<tr>
<td>ContactNo
</td>
<td><input type="text" name="ContactNo" /><div>${ContactNo }</div>
</tr>
<td><input type="submit"/></td></tr>
</form>
</table>
</body>
</html>