<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<%@ include file="/WEB-INF/views/include/form_common.jsp"%>
</head>
<body>

<section class="content">
<div class="col-md-6">
	<div class="box box-info">
		<!-- /.box-header -->
		<!-- form start -->
		<form class="form-horizontal" id="form">
		    <div class="box-body">
		    	<input type="hidden" id="id" name="id" value="${trainingType.id }"/>
		        <%--<div class="form-group">
                    <label for="type" class="col-xs-2 col-sm-2 control-label">商品分类</label>
		            <div class="col-xs-10 col-sm-10">
	                    <select name="typeId" class="form-control" id="typeId" <c:if test="${not empty category.id }">disabled</c:if> 
	                     isvalid="yes" checkexpession="NotNull" errormsg="商品分类">
	                    	<option value="">--无--</option>
	                    	<c:forEach items="${goodsTypeList }" var="item">
	                    		<c:if test="${item.isShow==1 }">
			                        <option value="${item.id }" <c:if test="${category.typeId==item.id}">selected = "selected"</c:if> >
			                        	<c:forEach begin="1" end="${item.level }">&nbsp;&nbsp;</c:forEach>${item.name }
			                        </option>
	                    		</c:if>
	                    	</c:forEach>
	                    </select>
		            </div>
                </div>--%>
                
		        <div class="form-group">
                    <label for="parentId" class="col-xs-2 col-sm-2 control-label">上级类目</label>
		            <div class="col-xs-10 col-sm-10">
		            	<input type="hidden" name="parentId" id="parentId" value="${trainingType.parentId }" >
		            	<input value="${parent.name}" type="text" class="form-control" placeholder="根类目" disabled />
		            </div>
                </div>
		        <div class="form-group">
		            <label for="name" class="col-xs-2 col-sm-2 control-label">类目名称</label>
		            <div class="col-xs-10 col-sm-10">
		                <input name="name" id="name" value="${trainingType.name }" type="text" class="form-control" placeholder="类目名称"
		                 isvalid="yes" checkexpession="NotNull" errormsg="类目名称">
		            </div>
		        </div>
                <%--<div class="form-group">
		            <label for="title" class="col-xs-2 col-sm-2 control-label">类目标识</label>
		            <div class="col-xs-10 col-sm-10">
		                <input name="enkey" id="enkey" value="${category.enkey }" type="text" class="form-control" placeholder="类目标识" 
		                	<c:if test="${not empty category.enkey}">disabled</c:if> 
		                 isvalid="yes" checkexpession="CodeOrNull" errormsg="类目标识" >
		            </div>
		        </div>--%>
		        <%--<div class="form-group">
                    <label for="type" class="col-xs-2 col-sm-2 control-label">是否售卖</label>
		            <div class="col-xs-10 col-sm-10">
	                    <label style="width:80px">
	                        <input type="radio" name="isSell" value="0" class="minimal" <c:if test="${category.isSell!=1 }">checked</c:if>>不售卖
	                    </label>
	                    <label style="width:80px">
	                        <input type="radio" name="isSell" value="1" class="minimal" <c:if test="${category.isSell==1 }">checked</c:if>>售卖
	                    </label>
		            </div>
                </div>--%>
		        <%--<div class="form-group isSell <c:if test="${category.isSell!=1 }">hidden</c:if>">
		            <label for="title" class="col-xs-2 col-sm-2 control-label">封面图</label>
		            <div class="col-xs-10 col-sm-10">
		            	<input type="hidden" name="img" value="${category.img}" 
								 class="webuploader-input" fileType="image" fileLimit="1" fileName="封面图" 
								 uploadUrl="${adminPath}/upload/image" prefixUrl="${ctxPath}/resource/" />
		            </div>
		        </div>
		        <div class="form-group isSell <c:if test="${category.isSell!=1 }">hidden</c:if>">
		            <label for="title" class="col-xs-2 col-sm-2 control-label">描述</label>
		            <div class="col-xs-10 col-sm-10">
		                 <textarea name="brief" id="brief" rows="3" class="form-control" placeholder="描述"
							>${category.brief }</textarea>
		            </div>
		        </div>
		        <div class="form-group isSell <c:if test="${category.isSell!=1 }">hidden</c:if>">
		            <label for="title" class="col-xs-2 col-sm-2 control-label">售卖价格</label>
		            <div class="col-xs-10 col-sm-10">
		            	<div class="col-xs-6 col-sm-6" style="padding-left: 0px;">
			                 <input name="price" id="price" value="${category.price }" type="text" class="form-control" placeholder="价格(元)"
			                 isvalid="yes" checkexpession="AmountOrNull" errormsg="价格">
		            	</div>
		            	<div class="col-xs-6 col-sm-6">
			                <input name="priceTitle" id="priceTitle" value="${category.priceTitle }" type="text" class="form-control" placeholder="标题">
		            	</div>
		            </div>
		        </div>
	            <div class="form-group isSell <c:if test="${category.isSell!=1 }">hidden</c:if>">
		            <label for="title" class="col-xs-2 col-sm-2 control-label">平台分销商分红</label>
		            <div class="col-xs-10 col-sm-10">
		                <input name="distributorAmt" id="distributorAmt" value="${category.distributorAmt }" type="text" class="form-control" placeholder="平台分销商分销收益（元）"
		                 isvalid="yes" checkexpession="AmountOrNull" errormsg="平台分销商分红">
		            </div>
		        </div>
	            <div class="form-group isSell <c:if test="${category.isSell!=1 }">hidden</c:if>">
		            <label for="title" class="col-xs-2 col-sm-2 control-label">普通推荐人分红</label>
		            <div class="col-xs-10 col-sm-10">
		                <input name="referralAmt" id="referralAmt" value="${category.referralAmt }" type="text" class="form-control" placeholder="普通推荐人分销收益（元）"
		                 isvalid="yes" checkexpession="AmountOrNull" errormsg="普通推荐人分红">
		            </div>
		        </div>--%>
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
$(function(){
    $("input:radio[name='isSell']").on('ifChecked', function(event){
    	var isSell = $("input:radio[name='isSell']:checked").val();
    	if(isSell==1){
    		$(".isSell").removeClass('hidden');
    	}else{
    		$(".isSell").addClass('hidden');
    	}
   	});
});

function submitForm(dialog, oTable){
	if($("#form").Validform()){
		$.postJSON("${adminPath}/type/trainingTypeCheck", $("#form").serializeObject(), function(data){
			//alert(JSON.stringify(data));
            if (0 == data.code) {
                $.fn.modalMsg(data.msg,"fail");
            }else if (1 == data.code) {
                $.fn.modalMsg(data.msg,"success");
                oTable.refresh();
                dialog.close();
            }
		});
	}
}

</script>

</body>
</html>