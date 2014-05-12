<%--
  Created by IntelliJ IDEA.
  User: hammer
  Date: 12.05.14
  Time: 13:45
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
  <title></title>
</head>
<body>
    <h1>${pictureSet.name}</h1>
    <g:form action="cedit" method="post">
    <g:hiddenField name="id" value="${pictureSet.id}" > </g:hiddenField>
    <g:each var="picture" in="${pictures}" >
        <g:img uri="/picture/image/${picture.fileName}" width="100" height="100"></g:img>


        <g:checkBox name="pid" value="${picture.fileName}" checked="${pictureSet.pictures.contains(picture)}" ></g:checkBox>
        <br>
    </g:each>
    <g:submitButton name="submit" value="submit" ></g:submitButton>
    </g:form>
</body>
</html>