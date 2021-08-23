<%@ page pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>emplist</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" type="text/css" href="css/style.css" />
</head>
<body>
<div id="wrap">
    <div id="top_content">
        <div id="header">
            <div id="rightheader">
                <p>
                    登录者:${sessionScope.yyy}
                    2009/11/20
                    <br />
                </p>
            </div>
            <div id="topheader">
                <h1 id="title">
                    <a href="#">main</a>
                </h1>
            </div>
            <div id="navigation">
            </div>
        </div>
        <div id="content">
            <p id="whereami">
            </p>
            <h1>
                Welcome!
            </h1>
            <table class="table">
                <tr class="table_header">
                    <td>
                        ID
                    </td>
                    <td>
                        Name
                    </td>
                    <td>
                        Salary
                    </td>
                    <td>
                        Age
                    </td>
                    <td>
                        Operation
                    </td>
                </tr>
                <c:forEach items="${request.queryall}" var="person">
                    <tr class="row1">
                        <td>${person.id }</td>
                        <td>${person.name }</td>
                        <td>${person.salary }</td>
                        <td>${person.age }</td>
                        <td><a onclick='delRow(${city.id})' href='${pageContext.request.contextPath }/delete?person.id=${person.id }'>delete emp</a>
                            <a  href='${pageContext.request.contextPath }/queryone?person.id=${person.id }'>update emp</a></td>
                    </tr>
                </c:forEach>
            </table>
            <p>
                <input type="button" class="button" value="Add Employee" onclick="location='addEmp.jsp'"/>
            </p>
        </div>
    </div>
    <div id="footer">
        <div id="footer_bg">
            ABC@126.com
        </div>
    </div>
</div>
</body>
</html>
<script>
    function delRow(id){
        if(window.confirm('确定要删除这条记录吗?')) location.href='${pageContext.request.contextPath}/city/delete?id='+id;
    }
</script>