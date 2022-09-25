<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<style>
  <%@include file='/WEB-INF/views/css/table_dark.css' %>
  <%@include file='/WEB-INF/views/css/header_style.css' %>
</style>
<html>
<head>
  <title>Cab Service</title>
</head>
<body>
<%@include file="non_authenticated_header.jsp" %>
<form method="post" id="redirect"></form>
<h1 class="table_dark">Welcome to our cab service!</h1>
<table class="table_dark">
  <tr>
    <th>You are not authorized. Please log in to use the service.</th>
  </tr>
</table>
</body>
</html>
