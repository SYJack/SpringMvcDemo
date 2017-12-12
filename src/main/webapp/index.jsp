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
    <title>Bootstrap 101 Template</title>
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
    <style type="text/css">  
        body{background: url(img/4.jpg) no-repeat;background-size:cover;font-size: 16px;}  
        .form{background: rgba(255,255,255,0.2);width:400px;margin:100px auto;}  
        #login_form{display: block;}  
        #register_form{display: none;}  
        .fa{display: inline-block;top: 27px;left: 6px;position: relative;color: #ccc;}  
        input[type="text"],input[type="password"]{padding-left:26px;}  
        .checkbox{padding-left:21px;}  
    </style>  
  </head>
  <body>
  		<div class="container">
        	<form id="login_form" action="" method="post" class="form-horizontal col-sm-offset-3 col-md-offset-3 mycenter">
	            <div class="col-sm-9 col-md-9 mysign">
	                <div class="text-center text-info form-group">
	                    <h2>请登录</h2>
	                </div>
	                <div class="form-group">
	                    <input type="text" class="form-control" name="username" placeholder="请输入账户名" required autofocus/>
	                </div>
	                <div class="form-group">
	                    <input type="password" class="form-control" name="password" placeholder="请输入密码" required autofocus/>
	                </div>
	                <div class="mycheckbox form-group">
	                    <label class="checkbox">  
                            <input type="checkbox" name="remember" value="1"/> 记住密码  
                        </label>  
	                </div>
	                <div class="form-group">
	                    <button type="button" class="btn btn-success">登录</button>
	                </div>
	            </div>
           </form>
       </div>
    </body>
    <script type="text/javascript">
    
    </script>
</html>