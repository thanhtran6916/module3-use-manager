<%--
  Created by IntelliJ IDEA.
  User: t
  Date: 10/1/2021
  Time: 3:41 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <div>
        <form>
            <input type="text" name="name">
            <button>Search</button>
        </form>
        <table>
            <tr>
                <th>Id</th>
                <th>Name</th>
                <th>Password</th>
                <th>RoleID</th>
            </tr>
            <c:forEach items="${users}" var="user">
                <tr>
                    <th>${user.id}</th>
                    <th>${user.name}</th>
                    <th>${user.password}</th>
                    <th>${user.roleId}</th>
                </tr>
            </c:forEach>
        </table>
    </div>

</body>
</html>
