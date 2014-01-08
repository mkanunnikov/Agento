<%@ page pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--<c:set var="language"--%>
       <%--value="${not empty param.language ? param.language : not empty language ? language : pageContext.request.locale}"--%>
       <%--scope="session"/>--%>
<%--<fmt:setLocale value="${language}"/>--%>
<%--<!DOCTYPE html>--%>
<html>
<head>
    <title><spring:message code="login.title"/></title>
</head>
<body>
<span style="float: right">
    <a href="?lang=en">en</a>
    |
    <a href="?lang=ru">ru</a>
</span>
<form:form method="post" action="/j_spring_security_check">
    <label for="username"><spring:message code="login.label.username"/>:</label>
    <input type="text" id="username" name="j_username">
    <br>
    <label for="password"><spring:message code="login.label.password"/>:</label>
    <input type="password" id="password" name="j_password">
    <br>
    <input type="checkbox" id="remember" name="_spring_security_remember_me">
    <label for="password"><spring:message code="login.label.remember"/></label>
    <br>
    <spring:message code="login.button.submit" var="buttonValue"/>
    <input type="submit" name="submit" value="${buttonValue}">
</form:form>
</body>
</html>