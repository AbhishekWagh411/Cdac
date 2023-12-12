<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registered</title>
</head>
<body>
<c:forEach var="register" items="${requestScope.mylist}" >
${register.id}&nbsp;
${register.name}&nbsp;
${register.address}&nbsp;
${register.email_id}&nbsp;
${register.login}&nbsp;
${register.password}
<br>
</c:forEach>
</body>
</html>