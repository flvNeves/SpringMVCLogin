<%--
  Created by IntelliJ IDEA.
  User: codecadet
  Date: 20/07/16
  Time: 17:47
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>LoginForm</title>
    <link href="${pageContext.request.contextPath}/css/style.css" rel="stylesheet" type="text/css" media="screen"/>
</head>
<body>
<div class="login-page">
        <div class="login-form" style="display: block">
            <form:form  cssClass="form" method="post" modelAttribute="loggedUser">
            <form:input path="name" placeholder="Username" onfocus="this.placeholder=''" onblur="this.placeholder='Username'" />
            <form:errors path="name"  cssStyle="color:indianred"/>
            <form:password path="pass" placeholder="Password" onfocus="this.placeholder=''" onblur="this.placeholder='Password'" />
            <form:errors path="pass" cssStyle="color:indianred"/>
                <button>login</button>
                <p style="color: indianred;">${error}</p>
            </form:form>
        </div>
        </div>
</body>
</html>
