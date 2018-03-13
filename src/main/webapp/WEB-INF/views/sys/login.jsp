<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>

<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=Edge,chrome=1" />
    <title>${setting.adminsiteName }</title>
    <meta name="keywords" content="${setting.adminsiteName }" />
    <meta name="description" content="${setting.adminsiteName }" />
    <link href="${ctxPath}/static/content/ui/css/layout.css" rel="stylesheet" />
    <link href="${ctxPath}/static/content/ui/css/login.css" rel="stylesheet"/>
    <link href="${ctxPath}/static/images/bitbug_favicon.ico" th:href="@{../../images/bitbug_favicon.ico}" rel="Shortcut Icon">
    <!-- Font Awesome -->
	<link href="${ctxPath}/static/content/ui/global/font-awesome/css/font-awesome.css" rel="stylesheet" />
<script type="text/javascript">
if(top!=self){
	if(top.location != self.location)
		top.location=self.location;
}
</script>
</head>
<body>
    <div class="container ">
        <!--登录-->
        <div class="login content " id="login">
           	<p class="big-title text-center logo-color">${setting.adminsiteName }</p>
            <%--<div class="logo-content">
				<div class="logo text-center">
				    <a href="javascript:void(0)">
				        <img src="${ctxPath}${setting.adminsiteLogo}" width="120px" height="120px" />
				    </a>
				</div>
            </div>--%>
            <div class="login-content2">
                <form class="login-form" action="${adminPath}/login" method="POST" autocomplete="off">
                    <div class="login-box text-small" id="box">
                        <div class="name">
                            <i class="fa fa-user"></i><input type="text" placeholder="账号" id="username" name="loginname" datatype="*" nullmsg="请填写帐号信息" />
                        </div>
                        <div class="pwd">
                            <i class="fa fa-lock"></i><input type="password" placeholder="密码" datatype="*" id="password" name="password" nullmsg="请填写帐号密码" />
                        </div>
                    </div>
                    <input type="submit" class="btn text-center login-btn" value="立即登录" />
                </form>
            </div>
            <!-- <div class="forget">
                <a href="#" class="forget-pwd text-small fl"> 忘记登录密码？</a><a href="#" class="forget-new text-small fr" id="forget-new">注册账号</a>
            </div> -->
        </div>
        <div class="footer text-center text-small ie">
            ${setting.copyrightInfo }
            <span class="margin-left margin-right">|</span>
            <a href="#">${setting.filingInfo }</a>
        </div>
        <div class="popupDom">
            <div class="popup text-default">
            </div>
        </div>
    </div>
</body>

<script src="${ctxPath}/static/content/ui/global/jQuery/jquery.min.js"></script>
<script type="text/javascript">
    function popup_msg(msg) {
        $(".popup").html("" + msg + "");
        $(".popupDom").animate({
            "top": "0px"
        }, 400);
        setTimeout(function () {
            $(".popupDom").animate({
                "top": "-40px"
            }, 400);
        }, 2000);
    }
    <c:if test="${not empty message}"> popup_msg("${message}");</c:if>
    
    /*动画（注册）*/
    $(document).ready(function (e) {
        // $("input[name=username]").focus();
        // $('.login-form').Validform({
        // 	ajaxPost: true,
        // 	tiptype: function(msg) {
        // 		if (msg) popup_msg('' + msg + '');
        // 	},
        // 	callback: function(ret) {
        // 		popup_msg('' + ret.info + '');
        // 		if (ret.status == 1) {
        // 			if (ret.uc_user_synlogin) {
        // 				$("body").append(ret.uc_user_synlogin);
        // 			}
        // 			setTimeout("window.location='" + ret.url + "'", 2000);
        // 		}
        // 	}
        // })

    });
</script>
</html>