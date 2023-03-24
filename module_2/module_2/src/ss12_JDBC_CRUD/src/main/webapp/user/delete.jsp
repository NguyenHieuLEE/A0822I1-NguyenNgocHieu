<%--
  Created by IntelliJ IDEA.
  User: a12345
  Date: 21/03/2023
  Time: 10:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
  <title>Title</title>
  <style>
    .messageDelete {
      background-color: black;
      color: aqua;
    }
    body{
      background-color: aquamarine;
    }
  </style>
</head>
<body>
<h1> DELETE USER</h1>
<p>
  <c:if test="${messageDelete != null}">
    <span class="messageDelete"> ${messageDelete}</span>
  </c:if>
</p>
<p>
  <a href="/User"> Back List Product </a>
</p>
<form method="post">
  <h3>Are you sure?</h3>
  <fieldset>
    <legend>User information</legend>
    <table>
      <tr>
        <td>ID:</td>
        <td>${user.getId}</td>
      </tr>
      <tr>
        <td>Name:</td>
        <td>${user.getName()}</td>
      </tr>
      <tr>
        <td>Email:</td>
        <td>${user.getEmail()}</td>
      </tr>
      <tr>
        <td>Country:</td>
        <td>${user.getCountry()}</td>
      </tr>
      <tr>
        <td><input type="submit" value="Delete User"></td>
        <td><a href="/User">Back to user list</a></td>
      </tr>
    </table>
  </fieldset>
</form>
</body>
</html>
