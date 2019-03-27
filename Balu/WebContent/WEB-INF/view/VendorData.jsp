<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>WelCome to VendorData</h1>
	<table border="1">
		<tr>
			<th>VendorId</th>
			<th>VendorCode</th>
			<th>VendorName</th>
			<th>VendorType</th>
			<th>VenEmail</th>
			<th>venContact</th>
			<th>venAddr</th>
			<th colspan="2">Operation</th>
		</tr>
		<c:forEach items="${ven}" var="venlist">
			<tr>
				<td><c:out value="${venlist.venId}" /></td>
				<td><c:out value="${venlist.venCode}" /></td>
				<td><c:out value="${venlist.venName}" /></td>
				<td><c:out value="${venlist.venType}" /></td>
				<td><c:out value="${venlist.venEmail}" /></td>
				<td><c:out value="${venlist.venContact}" /></td>
				<td><c:out value="${venlist.venAddr}" /></td>
				<td><a href="deleteVen?venId=${venlist.venId}"><img
						src="../images/delete.jpg" width="25" height="25"></a></td>
				<td><a href="editVen?venId=${venlist.venId}"><img
						src="../images/edit.png" width="25" height="25"></a></td>
			</tr>

		</c:forEach>
	</table>

</body>
</html>