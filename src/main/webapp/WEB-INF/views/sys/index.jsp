<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>${setting.adminsiteName }</title>
    <link href="${ctxPath}/static/images/bitbug_favicon.ico" th:href="@{../../images/bitbug_favicon.ico}" rel="Shortcut Icon">
    <!-- Tell the browser to be responsive to screen width -->
    <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">

<!-- Bootstrap 3.3.6 -->
<link rel="stylesheet" href="${ctxPath}/static/content/ui/global/bootstrap/css/bootstrap.min.css">
<!-- Font Awesome -->
<link href="${ctxPath}/static/content/ui/global/font-awesome/css/font-awesome.css" rel="stylesheet" />
<!-- Theme style -->
<link rel="stylesheet" href="${ctxPath}/static/content/adminlte/dist/css/AdminLTE.css">
<link rel="stylesheet" href="${ctxPath}/static/content/adminlte/dist/css/skins/_all-skins.min.css">
<link href="${ctxPath}/static/content/min/css/supershopui.common.min.css" rel="stylesheet" />
<link href="${ctxPath}/static/content/supermgr/Base/css/common.css" rel="stylesheet" />


    <style type="text/css">
        html {
            overflow: hidden;
        }
        .main-header .navbar * {font-size: 14px;}
        .main-header .logo .logo-lg b {font-size: 20px;}
        .sidebar * {font-size: 14px;}
    </style>
    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>

<body class="hold-transition skin-blue sidebar-mini fixed">
    <div class="wrapper">
        <!-- Main Header -->
        <header class="main-header">
            <!-- Logo -->
            <a href="" class="logo">
                <!-- mini logo for sidebar mini 50x50 pixels -->
                <span class="logo-mini">后台</span>
                <!-- logo for regular state and mobile devices -->
                <span class="logo-lg"><b>${setting.adminsiteName }</b></span>
            </a>

            <!-- Header Navbar -->
            <nav class="navbar navbar-static-top" role="navigation">
                <!-- Sidebar toggle button-->
                <a href="#" class="sidebar-toggle" data-toggle="offcanvas" role="button">
                    <span class="sr-only">切换导航</span>
                </a>
                <!-- Navbar Right Menu -->
                <div class="navbar-custom-menu">
                    <ul class="nav navbar-nav">
                        <!-- User Account Menu -->
                        <li class="dropdown user user-menu">
                            <!-- Menu Toggle Button -->
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                                <!-- The user image in the navbar-->
                                <%--<img src="${ctxPath}/static/content/ui/img/photos/${sessionScope.admin.sex==1?'male-130.png':'female-130.png'}" class="user-image" alt="User Image">--%>
                                <!-- hidden-xs hides the username on small devices so only the image appears. -->
                                <span class="hidden-xs">${sessionScope.admin.name }</span>
                            </a>
                            <ul class="dropdown-menu">
                                <!-- The user image in the menu -->
                                <li class="user-header">
                                    <img src="${ctxPath}/static/content/ui/img/photos/${sessionScope.admin.sex==1?'male-130.png':'female-130.png'}" class="img-circle" alt="User Image">
                                    <p>
                                        ${sessionScope.admin.name }
                                        <small><fmt:formatDate value="${sessionScope.admin.createDate }" pattern="yyyy年MM月dd日"/>注册</small>
                                    </p>
                                </li>
                                <!-- Menu Footer-->
                                <li class="user-footer">
                                    <div class="pull-left">
                                        <a href="javascript:addTabs({id:'${sessionScope.admin.id }',title: '个人信息',close: true,url: '${adminPath}/admin/form?id=${sessionScope.admin.id }'});" class="btn btn-default btn-flat">个人信息</a>
                                    </div>
                                    <div class="pull-right">
                                        <a href="${adminPath }/logout" class="btn btn-default btn-flat">退出</a>
                                    </div>
                                </li>
                            </ul>
                        </li>
                        <!-- Control Sidebar Toggle Button -->
                        <li>
                            <a href="#" data-toggle="control-sidebar"><i class="fa fa-gears"></i></a>
                        </li>
                    </ul>
                </div>
            </nav>
        </header>
        <!-- Left side column. contains the logo and sidebar -->
        <aside class="main-sidebar">
            <!-- sidebar: style can be found in sidebar.less -->
            <section class="sidebar" style="font-size: 10pt;">
                <!-- Sidebar user panel (optional) -->
                <div class="user-panel">
                    <div class="pull-left image">
                        <%--<img src="${ctxPath}/static/content/ui/img/photos/${sessionScope.admin.sex==1?'male-130.png':'female-130.png'}" class="img-circle" alt="用户头像">--%>
                            <br/>
                    </div>
                    <div class="pull-left info" >
                       <p>我的工作台</p>
                        <!-- Status -->
                        <%--<a href="#"><i class="fa fa-circle text-success"></i> 在线</a>--%>
                    </div>
                </div>
                <!-- Sidebar Menu -->
                <ul class="sidebar-menu">
                	<li class="header"></li>
                </ul>
                <!-- /.sidebar-menu -->
            </section>
            <!-- /.sidebar -->
        </aside>
        <!-- Content Wrapper. Contains page content -->
        <div class="content-wrapper" id="content-wrapper">
            <div class="content-tabs">
                <button class="roll-nav roll-left tabLeft" onclick="scrollTabLeft()">
                    <i class="fa fa-backward"></i>
                </button>
                <nav class="page-tabs menuTabs tab-ui-menu" id="tab-menu">
                    <div class="page-tabs-content" style="margin-left: 0px;">

                    </div>
                </nav>
                <button class="roll-nav roll-right tabRight" onclick="scrollTabRight()">
                    <i class="fa fa-forward" style="margin-left: 3px;"></i>
                </button>
                <div class="btn-group roll-nav roll-right">
                    <button class="dropdown tabClose" data-toggle="dropdown">
                        页签操作<i class="fa fa-caret-down" style="padding-left: 3px;"></i>
                    </button>
                    <ul class="dropdown-menu dropdown-menu-right" style="min-width: 128px;">
                        <li><a class="tabReload" href="javascript:refreshTab();">刷新当前</a></li>
                        <li><a class="tabCloseCurrent" href="javascript:closeCurrentTab();">关闭当前</a></li>
                        <li><a class="tabCloseAll" href="javascript:closeOtherTabs(true);">全部关闭</a></li>
                        <li><a class="tabCloseOther" href="javascript:closeOtherTabs();">除此之外全部关闭</a></li>
                    </ul>
                </div>
                <button class="roll-nav roll-right fullscreen" ><i class="fa fa-arrows-alt"></i></button>
            </div>
            <div class="content-iframe " style="background-color: #ffffff; ">
                <div class="tab-content " id="tab-content">
                </div>
            </div>
            <!-- /.content -->
        </div>
        <!-- /.content-wrapper -->
        <!-- Main Footer -->
        <footer class="main-footer">
            <!-- To the right -->
            <%--<div class="pull-right hidden-xs">
                车盟网络项目组
            </div>--%>
            <!-- Default to the left -->
            ${setting.copyrightInfo }
            <span class="margin-left margin-right">|</span>
            <a href="#">${setting.filingInfo }</a>
        </footer>
        <!-- Control Sidebar -->
        <aside class="control-sidebar control-sidebar-dark">
            <!-- Tab panes -->
            <div class="tab-content">
                <!-- Home tab content -->
                <div class="tab-pane" id="control-sidebar-home-tab">
                </div>
            </div>
        </aside>
        <div class="control-sidebar-bg"></div>
    </div>
    <!-- ./wrapper -->
    <!-- REQUIRED JS SCRIPTS -->

<!-- jQuery 2.2.3 -->
<script src="${ctxPath}/static/content/ui/global/jQuery/jquery.min.js"></script>
<!-- Bootstrap 3.3.6 -->
<script src="${ctxPath}/static/content/ui/global/bootstrap/js/bootstrap.min.js"></script>
<script src="${ctxPath}/static/content/min/js/supershopui.common.js"></script>
<script src="${ctxPath}/static/content/supermgr/Base/js/common.js"></script>
<script src="${ctxPath}/static/common/js/jquery.ex.js"></script>
<script src="${ctxPath}/static/common/js/object.prototype.ex.js"></script>
<script src="${ctxPath}/static/common/js/funcUtils.js"></script>
<%-- <script src="${ctxPath}/static/common/js/core.js"></script> --%>

    <script type="text/javascript">
    var menuList = ${menuListJson};
    $(function() {
        <%--addTabs(({ id: '10008', title: '欢迎页', close: false, url: '${adminPath}/dashboard/dashboard' }));--%>
        //菜单格式
        /* var menus = [
            {
                id: "10001",
                text: "系统管理",
                isOpen: true,
                targetType: "iframe-tab",
                icon: "icon-settings",
                children: [
                    { id: "10019", text: "轮播图管理", targetType: "iframe-tab", url: "${adminPath}/banner/bannerIndex", icon: "fa fa-navicon" },
                    { id: "10020", text: "课程管理", targetType: "iframe-tab", url: "${adminPath}/course/courseIndex", icon: "fa fa-navicon" },
                    { id: "10021", text: "商品类目管理", targetType: "iframe-tab", url: "${adminPath}/category/categoryIndex", icon: "fa fa-navicon" },
                    { id: "10022", text: "资讯管理", targetType: "iframe-tab", url: "${adminPath}/news/index", icon: "fa fa-navicon" },
                    { id: "10023", text: "券管理", targetType: "iframe-tab", url: "${adminPath}/coupon/index", icon: "fa fa-navicon" },
                    { id: "10024", text: "兑换券管理", targetType: "iframe-tab", url: "${adminPath}/couponExchange/index", icon: "fa fa-navicon" },
                    { id: "10025", text: "菜单管理", targetType: "iframe-tab", url: "${adminPath}/menu/list", icon: "fa fa-navicon" },
                ]
            }
        ]; */
        //menuList[0].childList[0].isOpen  = true;
        $('.sidebar-menu').sidebarMenu({ data: menuList[0].children, adminPath:'${adminPath}' });
        App.fixIframeCotent();
    });
    </script>
</body>
</html>
