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
					<input type="hidden" id="schoolId" name="schoolId" value="${school.schoolId }"/>
					<div class="form-group">
						<label for="name" class="col-xs-2 col-sm-2 control-label">学校名称</label>
						<div class="col-xs-10 col-sm-10">
							<input name="name" value="${school.name }" type="text" class="form-control" id="name" placeholder="学校名称"
								   isvalid="yes" checkexpession="NotNull" errormsg="学校名称">
						</div>
					</div>
					<div class="form-group">
						<label for="tel" class="col-xs-2 col-sm-2 control-label">学校电话</label>
						<div class="col-xs-10 col-sm-10">
							<input name="tel" id="tel" value="${school.tel }" type="text" class="form-control" placeholder="学校电话" isvalid="no" checkexpession="MobileOrPhoneOrNull"  errormsg="学校电话">
						</div>
					</div>
					<div class="form-group">
						<label for="address" class="col-xs-2 col-sm-2 control-label">学校地址</label>
						<div class="col-xs-10 col-sm-10">
							<input name="address" value="${school.address }" type="text" class="form-control" id="address" placeholder="学校地址"
								   isvalid="no" checkexpession="NotNull" errormsg="学校名称">
						</div>
					</div>
					<div class="form-group">
						<label for="hot" class="col-xs-2 col-sm-2 control-label">人气</label>
						<div class="col-xs-10 col-sm-10">
							<input name="hot" value="${school.hot }" type="text" class="form-control" id="hot" placeholder="人气"
								   isvalid="no" checkexpession="Num" errormsg="人气">
						</div>
					</div>
					<div class="form-group">
						<label for="cgyId" class="col-xs-2 col-sm-2 control-label">商圈</label>
						<div class="col-xs-10 col-sm-10">
							<div class="col-xs-5 col-sm-5" style="padding:0px;width: 22%">
								<select name="businessCircle1" class="form-control" id="cgyIdT" onchange="changeCgyIdT(this.value)"
										isvalid="yes" checkexpession="NotNull" errormsg="类目">
									<option value="">--无--</option>
									<c:forEach items="${businessCircleList1}" var="item">
										<option class="cgyopt cgyopt-${item.parentId}" value="${item.id }" id="cgyT${item.id }" cgykey="${item.parentId}"
												<c:if test="${item.name==businessCircle1}">selected = "selected"</c:if> >${item.name }</option>
									</c:forEach>
								</select>
							</div>
							<div class="col-xs-2 col-sm-2" style="text-align: right;height: 28px;line-height: 28px;">
								<label for="subcgyId">子类目</label>
							</div>
							<div class="col-xs-5 col-sm-5" style="padding:0px;width: 22%">
								<select name="businessCircle2" class="form-control" id="subcgyIdT" onchange="changeCgyIdTwoT(this.value)"
										isvalid="yes" checkexpession="NotNull" errormsg="子类目">
									<option value="">--无--</option>
									<c:forEach items="${businessCircleList2}" var="item">
										<option class="${item.name eq businessCircle2 ? '' : 'hidden'} subcgyoptT subcgyoptT-${item.parentId }"  id="cgyTwoT${item.id }" cgykey="${item.parentId}" value="${item.id }"
												<c:if test="${item.name==businessCircle2}">selected = "selected"</c:if> >${item.name }</option>
									</c:forEach>
								</select>
							</div>
							<div class="col-xs-2 col-sm-2" style="text-align: right;height: 28px;line-height: 28px;">
								<label for="subcgyId">子类目</label>
							</div>
							<div class="col-xs-5 col-sm-5" style="padding:0px;width: 22%">
								<select name="businessCircle3" class="form-control" id="subcgyIdTwoT" isvalid="no" checkexpession="NotNull" errormsg="子类目">
									<option value="">--无--</option>
									<c:forEach items="${businessCircleList3}" var="item">
										<option class="${item.name eq businessCircle3 ? '' : 'hidden'} subcgyoptTwoT subcgyoptTwoT-${item.parentId }" value="${item.id }"
												<c:if test="${item.name==businessCircle3}">selected = "selected"</c:if> >${item.name }</option>
									</c:forEach>
								</select>
							</div>
						</div>
					</div>
					<div class="form-group">
						<label for="cgyId" class="col-xs-2 col-sm-2 control-label">课程</label>
						<div class="col-xs-10 col-sm-10">
							<div class="col-xs-5 col-sm-5" style="padding:0px;width: 22%">
								<select name="trainingType1" class="form-control" id="cgyId" onchange="changeCgyId(this.value)"
										isvalid="yes" checkexpession="NotNull" errormsg="类目">
									<option value="">--无--</option>
									<c:forEach items="${trainingTypeList1}" var="item">
										<option class="cgyopt cgyopt-${item.parentId}" value="${item.id }" id="cgy${item.id }" cgykey="${item.parentId}"
												<c:if test="${item.name==trainingType1}">selected = "selected"</c:if> >${item.name }</option>
									</c:forEach>
								</select>
							</div>
							<div class="col-xs-2 col-sm-2" style="text-align: right;height: 28px;line-height: 28px;">
								<label for="subcgyId">子类目</label>
							</div>
							<div class="col-xs-5 col-sm-5" style="padding:0px;width: 22%">
								<select name="trainingType2" class="form-control" id="subcgyId" onchange="changeCgyIdTwo(this.value)"
										isvalid="yes" checkexpession="NotNull" errormsg="子类目">
									<option value="">--无--</option>
									<c:forEach items="${trainingTypeList2}" var="item">
										<option class="${item.name eq trainingType2 ? '' : 'hidden'} subcgyopt subcgyopt-${item.parentId }"  id="cgyTwo${item.id }" cgykey="${item.parentId}" value="${item.id }"
												<c:if test="${item.name==trainingType2}">selected = "selected"</c:if> >${item.name }</option>
									</c:forEach>
								</select>
							</div>
							<div class="col-xs-2 col-sm-2" style="text-align: right;height: 28px;line-height: 28px;">
								<label for="subcgyId">子类目</label>
							</div>
							<div class="col-xs-5 col-sm-5" style="padding:0px;width: 22%">
								<select name="trainingType3" class="form-control" id="subcgyIdTwo" isvalid="no" checkexpession="NotNull" errormsg="子类目">
									<option value="">--无--</option>
									<c:forEach items="${trainingTypeList3}" var="item">
										<option class="${item.name eq trainingType3 ? '' : 'hidden'} subcgyoptTwo subcgyoptTwo-${item.parentId }" value="${item.id }"
												<c:if test="${item.name==trainingType3}">selected = "selected"</c:if> >${item.name }</option>
									</c:forEach>
								</select>
							</div>
						</div>
					</div>
					<div class="form-group" style="width:180px;height: 180px">
						<label for="img" class="col-sm-2 control-label">图片</label>
						<div class="col-sm-10">
							<input class="img-btn" type="file" name="img" id="img" >
							<input  type="hidden" name="bannerImg" value="${school.logo }" >
							<div class="img-container"><c:if test="${school.logo != null && school.logo != ''}"><img src="${ctxPath}${school.logo }" style="width:150px;height: 150px"></c:if></div>
						</div>
					</div>
					<div class="form-group">
						<label for="textArea1" class="col-sm-2 control-label">学校介绍</label>
						<div class="col-sm-10">
							<textarea class="ckeditor" name="introduction" id="textArea1" cols="20" rows="5">${school.introduction }</textarea>
						</div>
					</div>

				</div>
			</form>
		</div>
	</div>
</section>

</body>
<script type="text/javascript">
    var id = "${category.id}";
    $(function(){
        $("input:radio[name='isTop']").on('ifChecked', function(event){
            var isSell = $("input:radio[name='isTop']:checked").val();
            if(isSell==1){
                $(".isSell").removeClass('hidden');
            }else{
                $(".isSell").addClass('hidden');
            }
        });
    });
    var editor = CKEDITOR.replace('textArea1');
    function submitForm(dialog, oTable){
        editor.updateElement();
        if($("#form").Validform()){
            var form = new FormData(document.getElementById("form"));
            $.ajax({
                url:"${adminPath}/school/formCheck",
                type:"post",
                dataType : "json",
                data:form,
                processData:false,
                contentType:false,
                success:function(data){
                    if (0 == data.code) {
                        alert(data.msg);
                    } else if (1 == data.code) {
                        $.fn.modalMsg(data.msg,"success");
                        oTable.refresh();
                        dialog.close();
                        <%--window.location.href = "${ctxPath}/common/user/login";--%>
                    }
                },
                error:function(e){
                    alert("错误！！");
                    window.clearInterval(timer);
                }
            });
        }
    }

    function changeCgyId(cgyId) {
        $("#subcgyId").val("");
        $(".subcgyopt").addClass("hidden");
        $("#subcgyIdTwo").val("");
        $(".subcgyoptTwo").addClass("hidden");
        if(cgyId) {
            var cgykey = $("#cgy"+cgyId).attr("cgykey");
            $(".subcgyopt.subcgyopt-"+cgyId).removeClass("hidden");
        }
    }
    function changeCgyIdTwo(cgyId) {
        $("#subcgyIdTwo").val("");
        $(".subcgyoptTwo").addClass("hidden");
        if(cgyId) {
            var cgykey = $("#cgyTwo"+cgyId).attr("cgykey");
            $(".subcgyoptTwo.subcgyoptTwo-"+cgyId).removeClass("hidden");
        }
    }
    function changeCgyIdT(cgyId) {
        $("#subcgyIdT").val("");
        $(".subcgyoptT").addClass("hidden");
        $("#subcgyIdTwoT").val("");
        $(".subcgyoptTwoT").addClass("hidden");
        if(cgyId) {
            var cgykey = $("#cgyT"+cgyId).attr("cgykey");
            $(".subcgyoptT.subcgyoptT-"+cgyId).removeClass("hidden");
        }
    }
    function changeCgyIdTwoT(cgyId) {
        $("#subcgyIdTwoT").val("");
        $(".subcgyoptTwoT").addClass("hidden");
        if(cgyId) {
            var cgykey = $("#cgyTwoT"+cgyId).attr("cgykey");
            $(".subcgyoptTwoT.subcgyoptTwoT-"+cgyId).removeClass("hidden");
        }
    }

</script>
<script type="text/javascript">
    $(function(){
        var obj = document.getElementById('span1') ;
        obj.outerHTML=obj.outerHTML;
        var obj2 = document.getElementById('span2') ;
        obj2.outerHTML=obj2.outerHTML;
        var fileInputs=document.getElementsByClassName("img-btn");//文件选择按钮
        var imgDivs=document.getElementsByClassName("img-container");//图片容器
        selectImg(fileInputs,imgDivs);
    });
</script>
<script>
    function previewImg(fileInput,imgDiv){
        if(window.FileReader){//支持FileReader的时候
            var reader=new FileReader();
            reader.readAsDataURL(fileInput.files[0]);
            reader.onload=function(evt){
                imgDiv.innerHTML="\<img style='width:150px;height:150px' src="+evt.target.result+"\>";
            }
        }else{//兼容ie9-
            imgDiv.innerHTML='<div class="img"  style="filter:progid:DXImageTransform.Microsoft.AlphaImageLoader(sizingMethod=scale,src=\'' + fileInput.value + '\)\';"></div>';
        }
    }
    function selectImg(fileInputs,imgDivs){
        var checkImg=new RegExp("(.jpg$)|(.png$)|(.bmp$)|(.jpeg$)","i");
        var i=0;
        for(;i<fileInputs.length&&i<imgDivs.length;i++){
            (function(i){//立即执行函数；保存i
                fileInputs[i].onchange=function(){
                    if(checkImg.test(fileInputs[i].value)){
                        previewImg(this,imgDivs[i]);
                    }else{
                        alert("只支持上传.jpg .png .bmp .jpeg;你的选择有误");
                    }
                };
            })(i);
        }
    }
	/* 为IE6 IE7 IE8增加document.getElementsByClassName函数 */
    /MSIE\s*(\d+)/i.test(navigator.userAgent);
    var isIE=parseInt(RegExp.$1?RegExp.$1:0);
    if(isIE>0&&isIE<9){
        document.getElementsByClassName=function(cls){
            var els=this.getElementsByTagName('*');
            var ell=els.length;
            var elements=[];
            for(var n=0;n<ell;n++){
                var oCls=els[n].className||'';
                if(oCls.indexOf(cls)<0)        continue;
                oCls=oCls.split(/\s+/);
                var oCll=oCls.length;
                for(var j=0;j<oCll;j++){
                    if(cls==oCls[j]){
                        elements.push(els[n]);
                        break;
                    }
                }
            }
            return elements;
        }
    }
    var fileInputs=document.getElementsByClassName("img-btn");//文件选择按钮
    var imgDivs=document.getElementsByClassName("img-container");//图片容器
    selectImg(fileInputs,imgDivs);
</script>
</html>