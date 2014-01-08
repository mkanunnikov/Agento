<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ attribute name="flat" required="true" type="com.agento.mvc.model.Flat" description="New Flat." %>

<div class="addFlat">
    <div>
        <form:label class="label" path="totalArea"><spring:message code="housing.totalArea"/></form:label>
        <form:input path="totalArea"/>
        <form:label class="label" path="totalArea"><spring:message code="housing.livingArea"/></form:label>
        <form:input path="totalArea"/>
        <form:label class="label" path="kitchenArea"><spring:message code="housing.kitchenArea"/></form:label>
        <form:input path="kitchenArea"/>
        <form:label class="label" path="height"><spring:message code="housing.height"/></form:label>
        <form:input path="height"/>
        <form:label class="label" path="rooms"><spring:message code="housing.rooms"/></form:label>
        <form:input path="rooms"/>
        <form:label class="label" path="floor"><spring:message code="flat.floor"/></form:label>
        <form:input path="floor"/>
        <form:label class="label" path="condition"><spring:message code="housing.condition"/></form:label>
        <form:input path="condition"/>
        <form:label class="label" path="garages"><spring:message code="housing.garages"/></form:label>
        <form:input path="garages"/>
        <form:label class="label" path="address"><spring:message code="housing.address"/></form:label>
        <form:input path="address"/>
    </div>
</div>