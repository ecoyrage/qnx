<!-- Bootstrap 3.3.6 -->
<link rel="stylesheet" href="${ctxPath}/static/content/ui/global/bootstrap/css/bootstrap.min.css">
<!-- Font Awesome -->
<link href="${ctxPath}/static/content/ui/global/font-awesome/css/font-awesome.css" rel="stylesheet" />
<!-- Theme style -->
<link rel="stylesheet" href="${ctxPath}/static/content/adminlte/dist/css/AdminLTE.css">
<link rel="stylesheet" href="${ctxPath}/static/content/adminlte/dist/css/skins/_all-skins.min.css">
<link href="${ctxPath}/static/content/min/css/supershopui.common.min.css" rel="stylesheet" />
<link href="${ctxPath}/static/content/supermgr/Base/css/common.css" rel="stylesheet" />

<link href="${ctxPath}/static/content/plugins/bootstrap-table/bootstrap-table.css" rel="stylesheet">
<link rel="stylesheet" href="${ctxPath}/static/content/min/js/skin/default/layer.css?v=3.0.11110" id="layuicss-skinlayercss">
<link rel="stylesheet" href="${ctxPath}/static/content/ui/global/layer/skin/moon/style.css" id="layuicss-skinuigloballayerskinmoonstylecss">
<style>@font-face{font-family:uc-nexus-iconfont;src:url(chrome-extension://pogijhnlcfmcppgimcaccdkmbedjkmhi/res/font_9qmmi8b8jsxxbt9.woff) format('woff'),url(chrome-extension://pogijhnlcfmcppgimcaccdkmbedjkmhi/res/font_9qmmi8b8jsxxbt9.ttf) format('truetype')}</style>

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

<script src="${ctxPath}/static/content/plugins/bootstrap-table/bootstrap-table.js"></script>
<script src="${ctxPath}/static/content/plugins/bootstrap-table/locale/bootstrap-table-zh-CN.js"></script>

<!--前端页面css-->
<link rel="stylesheet" type="text/css" href="${ctxPath}/static/content/h5/css/wstyle.css">

<script type="text/javascript">
function formatImgNode(value, row, index){
	if(value!=undefined && value!=''){
		value = '<img src="${adminPath}/download?q=1&h=30&w=30&id='+value+'" width="30" width="30" style="margin:-8px auto;"/>';
	}
	return value;
}
</script>
