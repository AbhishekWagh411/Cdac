<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head> 	
<meta charset="UTF-8">
<title>Shop</title>
</head>
<body>

 <form action="SecondServ" method="post">
        <c:forEach var="item" items="${requestScope.lname}">
            <input type="checkbox" name="selectedItems" value="${item}" /> ${item} <br/>
        </c:forEach>
        <input type="submit" value="ADD to Cart">
    </form>
    
</body>
</html>