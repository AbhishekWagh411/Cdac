<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body >
<jsp:useBean id="ob1" class="c1.CareerExpert" scope="request" />
<jsp:setProperty name="ob1" property="qualification" value="${requestScope.qualification}" />
<c:out value="${ob1.getAdvice()}" />
</body>
</html>