<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<jsp:include page="/WEB-INF/jsp/common/domain.jsp"></jsp:include>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
<script src="${baseResPath}/js/jquery-3.2.1.min.js"></script>
<script src="${baseResPath}/js/bootstrap.min.js"></script>
<link href="${baseResPath}/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
	<nav class="navbar navbar-default">
	  <div class="container-fluid">
	    <!-- Brand and toggle get grouped for better mobile display -->
	    <div class="navbar-header">
	      <a class="navbar-brand" href="#">教务信息查询系统(管理员)</a>
	    </div>
	
	     <ul class="nav navbar-nav navbar-right">
	       <li class="dropdown">
	         <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false"> 
	         		<%--登录用户名--%>
	             <span class="glyphicon glyphicon-user">jack</span>
	             <span class="caret"></span>
	          </a>
	         <ul class="dropdown-menu">
	           <li><a href="#"> 修改个人信息</a></li>
	           <li role="separator" class="divider"></li>
	           <li><a href="#">注销</a></li>
	         </ul>
	       </li>
	     </ul>
	  </div>
	</nav>
</body>
<script type="text/javascript">
	$('.dropdown-toggle').dropdown();
</script>
</html>