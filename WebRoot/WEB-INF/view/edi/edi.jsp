<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<s:include value="/public.jsp"></s:include>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="resource/js/edi/edi.js"></script>
<title>EDI</title>
</head>
<body>
<div class="container">
<div class="row">
<div class="col-sm-3"></div>
<div class="col-sm-6"><p>Storer:</p><select class="selectpicker" data-live-search="true">
                                     <s:iterator value="storer" var="item1" status="num">
<option value="<s:property value="#item1"/>">${item1}</option>
</s:iterator>
                                     </select><br/>
<button id="submit1" class="btn btn-primary" type="button">查詢</button>
<button id="update" class="btn btn-primary" type="button">UPDATE</button>

 </div>
<div class="col-sm-3">
</div>
<div class="col-sm-4"></div>
<div class="col-sm-6">
<table data-toggle="table" id="table1" data-side-pagination="server" 
 data-query-params="storerNum" data-method="post"  
     data-pagination="true" data-content-type="application/json" 
  >
 <thead>
        <tr>
             
            <th data-field="datastream">Item Name</th>
            <th data-field="description">Item Price</th>
            <th data-field="active" data-formatter="field1">Active</th>
            <th data-field="storer" >storer</th>
        </tr>
    </thead>
</table>
</div>
<div class="col-sm-2"></div>
</div>
</div>
</body>
</html>