<%@page contentType="text/html;charset=UTF-8" isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
	<title>500 - 系统内部错误</title>
<style>
* {
	font-family: 'Microsoft YaHei','Verdana','Arial','Helvetica','Open Sans',sans-serif;
}
</style>
</head>
<body>
	<div class="container" style="padding: 0 15px;font-size:10px;">
		<div class="page-header"><h1>系统内部错误</h1></div>
		<div class="errorMessage">
			<p><b>错误信息：</b><br/>${errmsg }</p>
			<p>${exception }</p>
			<br/>&nbsp;
		</div>
	</div>
</body>
</html>
