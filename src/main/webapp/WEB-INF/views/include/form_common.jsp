<!-- Bootstrap 3.3.6 -->
<link rel="stylesheet" href="${ctxPath}/static/content/ui/global/bootstrap/css/bootstrap.min.css?v=${RES_VERSION}">
<!-- Font Awesome -->
<link href="${ctxPath}/static/content/ui/global/font-awesome/css/font-awesome.css?v=${RES_VERSION}" rel="stylesheet" />
<!-- Theme style -->
<link rel="stylesheet" href="${ctxPath}/static/content/adminlte/dist/css/AdminLTE.css?v=${RES_VERSION}">
<link rel="stylesheet" href="${ctxPath}/static/content/adminlte/dist/css/skins/_all-skins.min.css?v=${RES_VERSION}">
<link href="${ctxPath}/static/content/min/css/supershopui.common.min.css?v=${RES_VERSION}" rel="stylesheet" />
<link href="${ctxPath}/static/content/supermgr/Base/css/common.css?v=${RES_VERSION}" rel="stylesheet" />


<!-- iCheck for checkboxes and radio inputs -->
<link rel="stylesheet" href="${ctxPath}/static/content/plugins/iCheck/all.css?v=${RES_VERSION}">
<link rel="stylesheet" type="text/css" href="${ctxPath}/static/content/plugins/webuploader/webuploader.css?v=${RES_VERSION}">
<link type="text/css" rel="stylesheet" href="${ctxPath}/static/content/plugins/webuploader/uploader-box.css?v=${RES_VERSION}" />



<!-- jQuery 2.2.3 -->
<script src="${ctxPath}/static/content/ui/global/jQuery/jquery.min.js?v=${RES_VERSION}"></script>
<!-- Bootstrap 3.3.6 -->
<script src="${ctxPath}/static/content/ui/global/bootstrap/js/bootstrap.min.js?v=${RES_VERSION}"></script>
<script src="${ctxPath}/static/content/min/js/supershopui.common.js?v=${RES_VERSION}"></script>
<script src="${ctxPath}/static/content/supermgr/Base/js/common.js?v=${RES_VERSION}"></script>
<script src="${ctxPath}/static/common/js/jquery.ex.js?v=${RES_VERSION}"></script>
<script src="${ctxPath}/static/common/js/object.prototype.ex.js?v=${RES_VERSION}"></script>
<script src="${ctxPath}/static/common/js/funcUtils.js?v=${RES_VERSION}"></script>
<%-- <script src="${ctxPath}/static/common/js/core.js?v=${RES_VERSION}"></script> --%>

<script type="text/javascript" src="${ctxPath}/static/content/plugins/validator/validator.js?v=${RES_VERSION}"></script>
<script src="${ctxPath}/static/content/plugins/iCheck/icheck.min.js?v=${RES_VERSION}"></script>
<script src="${ctxPath}/static/content/plugins/ckeditor/ckeditor.js?v=${RES_VERSION}"></script>
<script type="text/javascript" src="${ctxPath}/static/content/plugins/webuploader/webuploader.js?v=${RES_VERSION}"></script>
<script src="${ctxPath}/static/common/js/webUploadInput.js?v=${RES_VERSION}"></script>

<script src="${ctxPath}/static/content/plugins/bootstrap-datetimepicker/js/bootstrap-datetimepicker.min.js?v=${RES_VERSION}"></script>
<script src="${ctxPath}/static/content/plugins/bootstrap-datetimepicker/js/locales/bootstrap-datetimepicker.zh-CN.js?v=${RES_VERSION}"></script>

<!--h5前端页面-->
<link rel="stylesheet" type="text/css" href="${ctxPath}/static/content/h5/css/wstyle.css">
<script  src="${ctxPath}/static/content/h5/js/jquery.min.js"></script>
<script type="text/javascript" src="${ctxPath}/static/content/h5/js/jquery.spinner.js"></script>

<script type="text/javascript">
    $(function(){
        //iCheck for checkbox and radio inputs
        $('input[type="checkbox"].minimal, input[type="radio"].minimal').iCheck({
            checkboxClass: 'icheckbox_minimal-blue',
            radioClass: 'iradio_minimal-blue'
        });
        //Red color scheme for iCheck
        $('input[type="checkbox"].minimal-red, input[type="radio"].minimal-red').iCheck({
            checkboxClass: 'icheckbox_minimal-red',
            radioClass: 'iradio_minimal-red'
        });
        //Flat red color scheme for iCheck
        $('input[type="checkbox"].flat-red, input[type="radio"].flat-red').iCheck({
            checkboxClass: 'icheckbox_flat-red',
            radioClass: 'iradio_flat-red'
        });
    });
</script>
