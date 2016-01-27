<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %><html>


<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Hello World!</h2>
 
I am feeling: ${ mood.feeling }. See <a href="explanation/${mood.feeling}">here</a> to find out why.
</body>
</html>