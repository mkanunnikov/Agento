<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="agento" tagdir="/WEB-INF/tags" %>

<html>
<body>
<div>

    <form:form action="searchObjects">
        <form:input title="Объая площадь" path=""/>
        <form:input path="price"/>
        <form:input path="price"/>
        <form:input path="price"/>
        <form:input path="price"/>
        <form:input path="price"/>
        <form:input path="price"/>
        <form:button name="Search" />
        <agento:addFlat flat="${newObjectGist}" />
    </form:form>
    <c:forEach var="object" items="${dealObjects}">
        <div>
            <span class="lable">Price</span> <span class="value">${object.price}</span>
            <span class="lable">Address</span> <span>${object.description.housing.address}</span>
            <span class="lable">Address</span> <span>${object.description.housing.address}</span>
            <span class="lable">Address</span> <span>${object.description.housing.address}</span>
        </div>
    </c:forEach>
</div>

</body>
</html>