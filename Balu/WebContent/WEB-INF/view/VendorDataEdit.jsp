<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="editVen" method="post">

		<pre>
VendorId:<input type="text" name="venId" value="${venlist.venId }"
				readonly="readonly" />
VendorName:<input type="text" name="venName" value="${venlist.venName}" />
VendorCode:<input type="text" name="venCode" value="${venlist.venCode}" />
VendorType:<select name="venType">
<option value="${venlist.venType}">Regular</option>
<option value="${venlist.venType}">Contract</option>
</select>

VendorEmail:<input type="text" name="venEmail"
				value="${venlist.venEmail}" />
VendorContact:<input type="text" name="venContact"
				value="${venlist.venContact}">
VendorAddr:<textarea name="venAddr" value="${venlist.venAddr}"></textarea>
<input type="submit" value="update" />

</pre>
	</form>

</body>
</html>