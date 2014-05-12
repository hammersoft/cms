<%--
  Created by IntelliJ IDEA.
  User: hammer
  Date: 12.05.14
  Time: 13:05
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
  <title>${pictureSet.name}</title>
</head>
<body>
    <h1>${pictureSet.name}</h1>

    <ul>
    <g:each var="picture" in="${pictureSet.pictures}">
        <li>${picture.id}</li>
    </g:each>
    </ul>
</body>
</html>