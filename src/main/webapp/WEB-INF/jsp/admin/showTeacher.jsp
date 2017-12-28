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
<div class="container" id="content">
		<div class="row">
			<jsp:include page="menu.jsp"></jsp:include>
			<div class="col-md-10">
				<div class="panel panel-default">
				    <div class="panel-heading">
						<div class="row">
					    	<h1 class="col-md-5">教师名单管理</h1>
							<form class="bs-example bs-example-form col-md-5" role="form" style="margin: 20px 0 10px 0;" action="" id="form1" method="post">
								<div class="input-group">
									<input type="text" class="form-control" placeholder="请输入教师" name="findByTeacher">
									<span class="input-group-addon btn" id="sub">搜索</span>
								</div>
							</form>
							<button class="btn btn-default col-md-2" style="margin-top: 20px" onClick="location.href='/admin/addStudent'">
								添加教师信息
								<sapn class="glyphicon glyphicon-plus"/>
							</button>

						</div>
				    </div>
				    <table class="table table-bordered">
				        <thead>
				            <tr>
				                <th class="text-center">序号</th>
			  					<th class="text-center">教师名称</th>
			  					<th class="text-center">性别</th>
			  					<th class="text-center">所属学院</th>
				            </tr>
				        </thead>
				        <tbody>
				        
				        </tbody>
				    </table>
				    <div class="panel-footer">
				    </div>
				</div>
			</div>
		</div>
	</div>
</body>
    <script type="text/javascript">
    
    </script>
</html>
