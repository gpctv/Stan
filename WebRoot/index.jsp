<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
     <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=BIG5">
<s:include value="/public.jsp"></s:include>
<title>Insert title here</title>
</head>
<body>
 <s:form action="/LoginTest">
 <s:textfield name="username" cssClass="form-control" label="username"></s:textfield>
 Password:<s:password name="password"></s:password>
 <s:submit label="submit"></s:submit>
 </s:form>
</body>
</html>