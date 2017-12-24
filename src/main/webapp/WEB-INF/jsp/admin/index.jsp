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
    <title>主页</title>
    <script src="${baseResPath}/js/jquery-3.2.1.min.js"></script>
    <script src="${baseResPath}/js/bootstrap.min.js"></script>
    <link href="${baseResPath}/css/bootstrap.min.css" rel="stylesheet">
    <%-- <link href="${baseResPath}/css/style.css" rel="stylesheet"> --%>
    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="https://cdn.bootcss.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>
  <body>
  		<jsp:include page="/WEB-INF/jsp/common/top.jsp"></jsp:include>
  		<div class="container">
  			<div class="row">
  				<jsp:include page="/WEB-INF/jsp/admin/menu.jsp"></jsp:include>
           <div>
       </div>
    </body>
    <script type="text/javascript">
    
    </script>
</html>