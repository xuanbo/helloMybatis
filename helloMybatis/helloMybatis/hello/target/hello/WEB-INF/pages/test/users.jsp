<%--
  Created by IntelliJ IDEA.
  User: xuan
  Date: 2016/2/27
  Time: 19:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>测试用户分页</title>
</head>
<body>
  <p style="text-align: center">测试用户分页</p>
  <c:if test="${not empty users}">
    <c:forEach items="${users}" var="user" varStatus="status">
      <h5>${status.index + 1}---${user.id}---${user.name}---${user.password} </h5>
    </c:forEach>
  </c:if>
</body>
</html>
