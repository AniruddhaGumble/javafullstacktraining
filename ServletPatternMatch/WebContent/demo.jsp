<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="post" name="patternMatcher" action="ServletPatternMatch">
	text:<input type="text" name="text"/> <br/>
	pattern:<input type="text" name="pattern"/> <br/>
	<input type="submit" value="Match" />
</form>
</body>
</html>