<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %><%--  Основные теги создания циклов, определения условий, вывода информации на страницу--%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %><%-- Теги для форматирования и интернационализации информации--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<jsp:useBean id="now" class="java.util.Date"/>
<fmt:setLocale value="en-EN"/>
Date in English format<br>
today: <fmt:formatDate value="${now}"/>
<h1>-------------</h1>
<fmt:setLocale value="ru-RU"/>
Russian format<br>
today: <fmt:formatDate value="${now}"/>
<h1>-------------</h1>
time styles<br>
(short): <fmt:formatDate value="${now}"
                         type="time" timeStyle="short"/><br/>
(medium):<fmt:formatDate value="${now}"
                         type="time" timeStyle="medium"/><br/>
(long): <fmt:formatDate value="${now}"
                        type="time" timeStyle="long"/><br/>
<h1>--------------------</h1>
<c:set var="currentNumber" value="118000"/>
<c:out value="outing format of numbers : ${currentNumber}"/> <br/>
default format :
<fmt:formatNumber value="${currentNumber}" /><br/>
percents :
<fmt:formatNumber value="${currentNumber}"
                  type="percent"/><br/>
<fmt:setLocale value="be-BY"/>

<h3>-----------------------</h3>
<c:set var = "now" value = "10-10-2018" />
<fmt:parseDate value = "${now}" var = "parsedEmpDate" pattern = "dd-MM-yyyy" />
Parsed Date: <c:out value = "${parsedEmpDate}" /><br/><br/>
</body>
</html>
