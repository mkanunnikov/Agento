<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<body>
<div>

    <form:form action="searchObjects">
        <form:input path="price"/>
        <form:button name="Search" />
    </form:form>
    <c:forEach var="object" items="${dealObjects}">
        <div>
            <span class="lable">Price</span> <span class="value">${object.price}</span>
            <span class="lable">Address</span> <span>${object.address}</span>
        </div>
    </c:forEach>
</div>

</body>
</html>