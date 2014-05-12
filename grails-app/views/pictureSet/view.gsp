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
    <g:link action="edit" id="${pictureSet.id}"><g:message code="pictureSet.append" default="Append images"></g:message></g:link>

    <ul>
    <g:each var="picture" in="${pictureSet.pictures}">

        <g:img uri="/picture/image/${picture.fileName}" width="100" height="100"></g:img>
        <li>${picture.fileName}</li>
        <br>

    </g:each>
    </ul>

</body>
</html>