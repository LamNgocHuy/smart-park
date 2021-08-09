<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 3/7/2021
  Time: 10:53 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
        <a class="menu-item" href="/viewCustomer">
            <i class="fa fa-user" aria-hidden="true" style="color: #FFE81A"></i>
            <span class="menu-link">Customer</span>
        </a>
        <a class="menu-item" href="/viewVehicle">
            <i class="fa fa-car" aria-hidden="true" style="color: #333"></i>
            <span  class="menu-link">Vehicle</span>
        </a>
        <a class="menu-item" href="/viewParkingFee">
            <i class="fa fa-money" aria-hidden="true" style="color: #2BEE86"></i>
            <span class="menu-link">Parking Fee</span>
        </a>
    </div>
</div>
<div class="content">
    <div class="content-title">
        <p>Vehihcle</p>
    </div>

    <table id="example" class="table table-hover table-bordered w-100">
        <thead>
        <tr style="color: #333333;font-weight: bold;text-align: center">
            <td class="text-left">Owner Name</td>
            <td class="text-left">Vehicle Number</td>
            <td>Status</td>
            <td>Amount</td>
            <td>Action</td>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="veh" items="${vehicleList}">
            <tr>
                <td>${veh.customer.cusName}</td>
                <td>${veh.vehicleNum}</td>
                <td>
                    <c:if test="${veh.status}">
                        <span class="text-success">Trong bãi</span>
                    </c:if>
                    <c:if test="${!veh.status}">
                        <span class="text-danger">Ngoài bãi</span>
                    </c:if>
                </td>
                <td>${veh.parkingFee.parkingFeeAmount}</td>
                <td>
                    <a href="/editCustomer?id=${veh.customer.cusId}" class="btn btn-sm btn-outline-warning">Edit</a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>
