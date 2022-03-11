<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>

<html>
<head>
    <title>Student Registration form</title>

    <style>
        .error {color:red}
    </style>
</head>
<body>
    <form:form action="processForm" modelAttribute="student">
        Free passes: <form:input path="freePasses">
        <form:errors path="freePasses" cssClass="error">
        <br>
        <input type="submit" value="Submit"/>
    </form:form>
</body>
</html>
