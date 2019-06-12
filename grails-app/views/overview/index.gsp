<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title></title>
</head>

<body>
    <g:each var="person" in="${personList}">
        <p>${person.name}: ${person.projectCount}</p>
    </g:each>
</body>
</html>