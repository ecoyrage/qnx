<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<%@ include file="/WEB-INF/views/include/form_common.jsp"%>
<body>

<section class="content">
<div class="col-md-6">
	<div class="box box-info">
		<div class="box-header with-border">
		    <h3 class="box-title">${empty form.uid ? '添加' : '编辑'}用户</h3>
		</div>
		<!-- /.box-header -->
		<!-- form start -->
		<form class="form-horizontal" id="form">
		    <div class="box-body">
		    	<input type="hidden" id="uid" name="uid" value="${form.uid }"/>
		        <div class="form-group">
		            <label for="title" class="col-xs-2 col-sm-2 control-label">昵称<font color="red">*</font></label>
		            <div class="col-xs-10 col-sm-10">
		                 <input name="name" id="name"  value="${form.name }" type="text" class="form-control" placeholder="昵称"
			                 isvalid="yes" checkexpession="NotNull" errormsg="昵称">
		            </div>
		        </div>
		        <div class="form-group">
		            <label for="title" class="col-xs-2 col-sm-2 control-label">姓名</label>
		            <div class="col-xs-10 col-sm-10">
		                 <input name="realname" id="realname" value="${form.realname }" type="text" class="form-control" placeholder="姓名">
		            </div>
		        </div>
		        <div class="form-group">
		            <label for="title" class="col-xs-2 col-sm-2 control-label">手机</label>
		            <div class="col-xs-10 col-sm-10">
		                 <input name="mobile" id="mobile" value="${form.mobile }" type="text" class="form-control" placeholder="手机"
		                   isvalid="yes" checkexpession="MobileOrNull" errormsg="手机">
		            </div>
		        </div>
		        <div class="form-group">
		            <label for="title" class="col-xs-2 col-sm-2 control-label">邮箱</label>
		            <div class="col-xs-10 col-sm-10">
		                 <input name="email" id="email" value="${form.email }" type="text" class="form-control" placeholder="邮箱"
		                   isvalid="yes" checkexpession="EmailOrNull" errormsg="邮箱">
		            </div>
		        </div>
		        <div class="form-group">
		            <label for="title" class="col-xs-2 col-sm-2 control-label">推荐码</label>
		            <div class="col-xs-10 col-sm-10">
		                 <input name="referralCode" id="referralCode" value="${form.referralCode }" type="text" class="form-control" placeholder="推荐码" >
		            </div>
		        </div>
		        <div class="form-group">
		            <label for="title" class="col-xs-2 col-sm-2 control-label">性别<font color="red">*</font></label>
		            <div class="col-xs-10 col-sm-10">
	                    <label style="width:80px">
	                        <input type="radio" name="sex" value="1" class="minimal" <c:if test="${form.sex==1 }">checked</c:if>>男
	                    </label>
	                    <label style="width:80px">
	                        <input type="radio" name="sex" value="0" class="minimal" <c:if test="${form.sex==0 }">checked</c:if>>女
	                    </label>
		            </div>
		        </div>
		        
		        <div class="form-group">
		            <label for="title" class="col-xs-2 col-sm-2 control-label">是否可用<font color="red">*</font></label>
		            <div class="col-xs-10 col-sm-10">
	                    <label style="width:80px">
	                        <input type="radio" name="useable" value="1" class="minimal" <c:if test="${form.useable==1 }">checked</c:if>>是
	                    </label>
	                    <label style="width:80px">
	                        <input type="radio" name="useable" value="0" class="minimal" <c:if test="${form.useable==0 }">checked</c:if>>否
	                    </label>
		            </div>
		        </div>
		        
		    </div>
		    <!-- /.box-body -->
		    <!-- <div class="box-footer">
		        <button type="submit" class="btn btn-default">Cancel</button>
		        <button type="submit" class="btn btn-info pull-right">Sign in</button>
		    </div> -->
		    <!-- /.box-footer -->
	    </form>
	</div>
</div>
</section>

<script type="text/javascript">
var id = "${form.uid}";

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

function submitForm(callback){
	if($("#form").Validform()){
		$.postJSON("${adminPath}/user/save", $("#form").serializeObject(), function(data){
			//alert(JSON.stringify(data));
			if(data.errno==0){
				//$.fn.modalAlert("操作成功!","success");
				$.fn.modalMsg("操作成功!","success");
				callback();
			}else{
				$.fn.modalMsg(data.errmsg,"info");
			}
		});
	}
}

$(function() {
});
</script>

</body>
</html>