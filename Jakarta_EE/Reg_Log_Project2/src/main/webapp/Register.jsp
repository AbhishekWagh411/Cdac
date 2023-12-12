<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="RegisterServ" method="post">
<label>Name: </label>
<br>
<input type="text" name ="name" placeholder = "Name" required>
<br>
<label>Address: </label>
<br>
<input type="text" name ="address" placeholder = "Address" required>
<br>
<label>Email: </label>
<br>
<input type="email" name ="email" placeholder = "Email" required>
<br>
<label>Login: </label>
<br>
<input type="text" name ="login" placeholder = "Login" required>
<br>
<label>Password: </label>
<br>
<input type="Password" name ="password" placeholder = "Password" required>
<br>
<button type ="submit">Submit</button>
</form>
</body>
</html>