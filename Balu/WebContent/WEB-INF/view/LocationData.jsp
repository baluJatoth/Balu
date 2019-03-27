
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
table tr th {
	color: white;
	background-color: black;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>WelCome to LocationData</h1>
	<table border="1">
		<tr>
			<th>LocationID</th>
			<th>LocationCode</th>
			<th>LocationName</th>
			<th>LocationType</th>
			<th colspan="2">Operation</th>
		</tr>
		<c:forEach items="${loc}" var="loclist">
			<tr>
				<td><c:out value="${loclist.locId}" /></td>
				<td><c:out value="${loclist.locCode}" /></td>
				<td><c:out value="${loclist.locName}" /></td>
				<td><c:out value="${loclist.locType}" /></td>

				<td><a href="deleteLoc?locId=${loclist.locId}"><img
						src="../images/delete.jpg" width="25" height="25"></a></td>
				<td><a href="editLoc?locId=${loclist.locId}"><img
						src="../images/edit.png" width="25" height="25"></a></td>
			</tr>

		</c:forEach>

	</table>

</body>
</html>