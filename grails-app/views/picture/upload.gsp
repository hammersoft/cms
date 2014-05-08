<%--
  Created by IntelliJ IDEA.
  User: hammer
  Date: 08.05.14
  Time: 16:45
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta name="layout" content="main"/>
    <g:set var="entityName" value="${message(code: 'Picture.label', default: 'Picture')}"/>
    <title><g:message code="default.create.label" args="[entityName]"/></title>
</head>

<body>
    <div class="nav">
        <span class="menuButton"><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></span>
        <span class="menuButton"><g:link class="list" action="list"><g:message code="default.list.label" args="[entityName]" /></g:link></span>
    </div>
    <div class="body">
        <h1><g:message code="Picture.upload.label" args="[entityName]" /></h1>
        <g:if test="${flash.message}">
            <div class="message">${flash.message}</div>
        </g:if>
        <g:uploadForm action="imgupload" >
            <div class="dialog">
                <input type="file" name="image"/>
            </div>
            <div class="buttons">
                <span class="button"><g:submitButton name="create" class="save" value="${message(code: 'default.button.create.label', default: 'Create')}" /></span>
            </div>
        </g:uploadForm>
</div>
</body>
</html>