<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: zhujun
  Date: 2020/4/8
  Time: 11:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>


</head>
<body>


<h2>查询所有的账户</h2>

<c:forEach items="${list}" var="account">
${account.name}

</c:forEach>
</body>
</html>
