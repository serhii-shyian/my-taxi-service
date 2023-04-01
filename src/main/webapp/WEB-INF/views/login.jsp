<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<style>
  <%@include file='/WEB-INF/views/css/table_dark.css' %>
  h4 {
    text-align: center;
  }
</style>
<head>
  <title>Login</title>
</head>
<body>
<h1 class="table_dark">Login Page</h1>
<h4 style="color:red">${errorMsg}</h4>
<form class="table_dark" method="post" action="${pageContext.request.contextPath}/login">
  <label for="login">Login</label><br>
  <input type="text" id="login" name="login" required><br>
  <label for="password">Password</label><br>
  <input type="password" id="password" name="password" required><br>
  <button type="submit">Login</button>
  <input type="button" value="Register" onClick='location.href="${pageContext.request.contextPath}/drivers/create"'>
</form>
</body>
</html>
