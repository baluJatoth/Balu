
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome to Location Register Page!!</h1>
	<form action="saveLoc" method="post">
		<pre>
Location Id  : <input type="text" name="locId" />
Location Code: <input type="text" name="locCode" />
Location Name: <input type="text" name="locName" />
Location Type: <input type="radio" name="locType" value="Urban">Urban
               <input type="radio" name="locType" value="Rural">Rural
<input type="submit" value="Insert" /> <input type="reset"
				value="Clean" />               
</pre>
	</form>
	${msg}
	<br />
</body>
<a href="getAllLocs">View All</a>
</html>