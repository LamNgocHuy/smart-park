<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 3/7/2021
  Time: 10:53 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Parking Manager</title>
    <jsp:include page="css.jsp"/>
</head>
<body>
<div class="menu">
    <p class="menu-title">Parking</p>
    <div class="menu-group">
        <div class="menu-item">
            <i class="fa fa-user" aria-hidden="true" style="color: #FFE81A"></i>
            <a href="/viewCustomer" class="menu-link">Customer</a>
        </div>
        <div class="menu-item">
            <i class="fa fa-car" aria-hidden="true" style="color: #333"></i>
            <a href="/viewVehicle" class="menu-link">Vehicle</a>
        </div>
        <div class="menu-item">
            <i class="fa fa-money" aria-hidden="true" style="color: #2BEE86"></i>
            <a href="/viewParkingFee" class="menu-link">Parking Fee</a>
        </div>
    </div>
</div>
<div class="content">
    <div class="content-title">
        <p>Customer</p>
    </div>
    <form:form action="saveCustomer" modelAttribute="customer">
        <form:hidden path="cusId"/>
        <table id="example" class="table table-hover table-bordered w-100">
        <tr>
            <td>Name</td>
            <td><form:input path="cusName" cssClass="form-control" type="text"/></td>
        </tr>
        <tr>
            <td>Address</td>
            <td><form:input path="cusAddress" cssClass="form-control" type="text"/></td>
        </tr>
        <tr>
            <td>Email</td>
            <td><form:input path="cusEmail" cssClass="form-control" type="text"/></td>
        </tr>
        <tr>
            <td>Mobile</td>
            <td><form:input path="cusMobile" cssClass="form-control" type="text"/></td>
        </tr>
        <c:if test="${customer.vehicle != null}">
            <form:hidden path="vehicle.vehicleId"/>
        </c:if>
        <tr>
            <td>Vehicle Num</td>
            <td><form:input path="vehicle.vehicleNum" cssClass="form-control" type="text"/></td>
        </tr>
        <tr>
            <td>Vehicle Type</td>
            <td><form:input path="vehicle.vehicleType" cssClass="form-control" type="text" placeholder="Bike,Car,..."/></td>
        </tr>
        <tr>
            <td>Parking Fee</td>
            <td>
                <select name="vehicle.parkingFee" id="vehicle.parkingFee" class="form-control">
                    <c:forEach items="${parkingFeeList}" var="par">
                        <option value="${par.parkingFeeId}">${par.parkingFeeAmount} $ (${par.parkingFeeType})</option>
                    </c:forEach>
                </select>
            </td>
        </tr>
    </table>
        <div style="display: block;width: 100%;margin-top: 20px" class=" d-flex justify-content-center">
            <input type="submit" value="Save" class="btn btn-outline-primary">
        </div>
    </form:form>
</div>
</body>
</html>
