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
	<h1>Vendor Registration</h1>
	<form action="saveVen" method="post">
		<pre>
VendorId:<input type="text" name="venId" />
VendorCode:<input type="text" name="venCode" />
VendorName:<input type="text" name="venName" />     
VendorType:<select name="venType">
<option>-select-</option>
<option value="contract">Contract</option>
<option value="regular">Regular</option>
</select>
vendorEmail:<input type="text" name="venEmail" />
VendorMobile:<input type="text" name="venMobile">
VendorAddr:<input type="text" name="venAddr" />
<input type="submit" value="Register">
		</pre>
	</form>
	${msg}
</body>
<a href="getAllvens">View All</a>
</html>