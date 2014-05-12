<%--
  Created by IntelliJ IDEA.
  User: hammer
  Date: 12.05.14
  Time: 14:02
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
  <title></title>
</head>
<body>
    <ul>
    <g:each var="pictureSet" in="${pictureSetList}">
        <li>${pictureSet.name}, ${pictureSet.creationDate}</li>
    </g:each>
    </ul>
</body>
</html>