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
					<input type="hidden" id="id" name="id" value="${banner.id }"/>
					<input type="hidden" id="type" name="type" value="1"/>
					<div class="form-group">
						<label for="title" class="col-sm-2 control-label">标题</label>
						<div class="col-sm-10">
							<input name="title" value="${banner.title }" type="text" class="form-control" id="title" placeholder="标题"
								   isvalid="yes" checkexpession="NotNull" errormsg="标题">
						</div>
					</div>
					<%--<div class="form-group">
						<label for="linkUrl" class="col-sm-2 control-label">图片链接</label>
						<div class="col-sm-10">
							<input  type="text" placeholder="图片链接" value="${banner.linkUrl }" id="linkUrl"  name="linkUrl" class="form-control" &lt;%&ndash;placeholder="指导价" isvalid="yes" checkexpession="Amount" errormsg="指导价"&ndash;%&gt;>
						</div>
					</div>--%>

					<%--<div class="form-group">
						<label for="unitPrice" class="col-sm-2 control-label">首付价</label>
						<div class="col-sm-10">
							<input  type="text" placeholder="首付价" value="${product.downPayment }" id="downPayment"  name="downPayment" class="form-control" placeholder="首付价" isvalid="yes" checkexpession="Amount" errormsg="首付价">
						</div>
					</div>--%>

					<%--<div class="form-group">
						<label for="stock" class="col-sm-2 control-label">库存</label>
						<div class="col-sm-10">
							<input onkeyup="value=value.replace(/\D|^0/g,'')" value="${product.stock }"  type="text" placeholder="库存"  class="form-control" id="stock" name="stock" placeholder="库存"
								   isvalid="yes" checkexpession="NotNull" errormsg="库存">
						</div>
					</div>--%>
					<div class="form-group" style="width:180px;height: 180px">
						<label for="bannerImg" class="col-sm-2 control-label">图片</label>
						<div class="col-sm-10">
							<input class="img-btn" type="file" name="bannerImg" id="bannerImg" >
							<input  type="hidden" name="bannerImg" value="${banner.imgUrl }" >
							<div class="img-container"><c:if test="${banner.imgUrl != null && banner.imgUrl != ''}"><img src="${ctxPath}${banner.imgUrl }" style="width:150px;height: 150px"></c:if></div>
						</div>
					</div>
					<%--<div class="form-group">--%>
						<%--<label for="textArea1" class="col-xs-2 col-sm-2 control-label">汽车详情</label>--%>
						<%--<div class="col-xs-10 col-sm-10">--%>
							<%--<textarea class="ckeditor" name="content" id="textArea1" cols="20" rows="5">${product.content }</textarea>--%>
						<%--</div>--%>
					<%--</div>--%>


				</div>
			</form>
		</div>
	</div>
</section>

</body>
<%--<script type="text/javascript">
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
        //CKEDITOR.instances.content.getData();
        //editor.setData('这里是需要传递给CKEditor编辑器实例的值');
        //editor.getData();
        editor.updateElement();
        if($("#form").Validform()){
            var form = $("#form").serializeObject();
            $.postJSON("${adminPath}/product/formCheck", form, function(data){
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

</script>--%>
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
//    var editor = CKEDITOR.replace('textArea1');
    function submitForm(dialog, oTable){
//        editor.updateElement();
        if($("#form").Validform()){
            var form = new FormData(document.getElementById("form"));
            $.ajax({
                url:"${adminPath}/banner/formCheck",
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