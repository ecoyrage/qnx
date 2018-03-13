<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title></title>
    <!-- Tell the browser to be responsive to screen width -->
    <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
	<meta charset="utf-8" />
<%@ include file="/WEB-INF/views/include/list_common.jsp"%>

</head>
<body>
<!-- Main content -->
<section class="content">

    <div class="panel panel-default" style="margin:0px;padding:0px">
        <form id="formSearch" class="form-horizontal" style="margin:0px;padding:0px">
            <div class="form-group" style="margin-top:15px">
                <label class="control-label col-sm-1" for="courseName">课程名称</label>
                <div class="col-sm-2">
                    <input type="text" name="courseName" id="courseName" class="form-control">
                </div>
                <label class="control-label col-sm-1" for="schoolName">学校名称</label>
                <div class="col-sm-2">
                    <input type="text" name="schoolName" id="schoolName" class="form-control">
                </div>
            </div>
        </form>
    </div>


    <div id="toolbar" class="btn-group">
            <%--<button id="btn_add" type="button" class="btn btn-default">
                <span class="glyphicon" aria-hidden="true"></span>新增
            </button>--%>
            <button id="btn_edit" type="button" class="btn btn-default">
                <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>编辑
            </button>
            <button id="btn_delete" type="button" class="btn btn-default">
                <span class="glyphicon glyphicon-remove" aria-hidden="true"></span>删除
            </button>
        </div>
        <table id="tb_departments"></table>
    </div>

</section>
<!-- ./wrapper -->

<script>


$(function () {

    //1.初始化Table
    var oTable = new TableInit();
    oTable.Init();

    //2.初始化Button的点击事件
    var oButtonInit = new ButtonInit();
    oButtonInit.Init();

   $("#btn_add").click(function(){
        var oTable = new TableInit();
        oTable.Init();
        var dialog = $.fn.modalOpen({
            id: "Form",
            title: '新增',
            url: '${adminPath}/banner/form',
            width: "750px",
            height: "750px",
            callBack: function (iframeId) {
                top.frames[iframeId].submitForm(dialog, oTable);
                //top.layer.close(iframeId);
                //dialog.close();
                oTable.refresh();
                //dialog.close();
            }
        });
    });
    $("#btn_edit").click(function(){
	    var selects = $("#tb_departments").bootstrapTable('getSelections');
	    if(selects.length==1){
	        var id = selects[0].courseId;
            var schoolId = selects[0].schoolId;
			var dialog = $.fn.modalOpen({
			    id: "Form",
			    title: '编辑',
			    url: '${adminPath}/course/form?courseId='+id+"&schoolId="+schoolId,
			    width: "750px",
			    height: "750px",
			    callBack: function (iframeId) {
                    top.frames[iframeId].submitForm(dialog, oTable);
	                	//window.location.reload();
	                	//refreshTable();
                    oTable.refresh();
			        //top.layer.close(iframeId);
			       	//dialog.close();
			    }
			});
	    }else{
	    	$.fn.modalMsg("请选中一行","wraining");
	    }
    });
    $("#btn_delete").click(function(){
    	var selects = $("#tb_departments").bootstrapTable('getSelections');
	    if(selects.length==1){
	        var id = selects[0].courseId;
	        var dialog = $.fn.modalConfirm('您确定要删除分此课程？', function(pass){
	        	if(pass){
	        		$.postJSON('${adminPath}/course/delete?courseId='+id, function(data){
	        			if(data.errno==0){
		        			//refreshTable();
		        			oTable.refresh();
	        			}else{
	        				$.fn.modalMsg(data.errmsg,"wraining");
	        			}
	        		});
	        	}
       			dialog.close();
	        });
	    }else{
	    	$.fn.modalMsg("请选中一行","wraining");
	    }
    });
});

function check(id){
    var oTable = new TableInit();
    oTable.Init();
    if(id!=undefined){
        var dialog = $.fn.modalOpen({
            id: "Form",
            title: '订单审核',
            url: '${adminPath}/order/form?orderId='+id,
            width: "750px",
            height: "750px",
            callBack: function (iframeId) {
                top.frames[iframeId].submitForm(dialog, oTable);
                //top.layer.close(iframeId);
                //dialog.close();
                oTable.refresh();
                /*dialog.close();*/
            }
        });
    }
}

function stateCheck(id){
    var oTable = new TableInit();
    oTable.Init();
    var id = id;
    var f = window.confirm('确认操作?');
    if (!f) {
        return;
    }
    $.ajax({
        url:"${adminPath}/banner/stateCheck",
        type:"post",
        dataType : "json",
        data:{bannerId:id},
        async : false,
        contentType : "application/x-www-form-urlencoded;charset=UTF-8",
        success:function(data){
            if (0 == data.code) {
                alert(data.msg);
            } else if (1 == data.code) {
//                alert(data.msg);
                $.fn.modalMsg(data.msg,"success");
                oTable.refresh();
                <%--window.location.href = "${ctxPath}/common/user/login";--%>
            }
        },
        error:function(e){
            alert("错误！！");
            window.clearInterval(timer);
        }
    });
}


function remark(remark){
    var oTable = new TableInit();
    oTable.Init();
    if(remark!=undefined){
        var dialog = $.fn.modalOpen({
            id: "Form",
            title: '备注',
            url: '${adminPath}/user/remark?remark='+remark,
            width: "500px",
            height: "200px",
            callBack: function (iframeId) {
                top.frames[iframeId].submitForm(dialog, oTable);
                //top.layer.close(iframeId);
                //dialog.close();
                oTable.refresh();
                /*dialog.close();*/
            }
        });
    }
}

//删除用户
function del(id){
    var oTable = new TableInit();
    oTable.Init();
    var f = window.confirm('确认删除此订单?');
    if (!f) {
        return;
    }
        $.ajax({
            type : "post",
            dataType : "json",
            data : {id:id},
            contentType : "application/x-www-form-urlencoded;charset=UTF-8",
            url : '${adminPath}/order/delOrder?orderId='+id,
            async : false,
            success : function(data) {
                if (0 == data.code) {
                    alert(data.msg);
                }else if (1 == data.code) {
                    alert("订单删除成功！");
                    oTable.refresh();
                }
            }
        });
}


var tempQueryParams;//分页参数缓存
var TableInit = function () {
    var oTableInit = new Object();
    //初始化Table
    oTableInit.Init = function () {
        $('#tb_departments').bootstrapTable({
            url: '${adminPath}/course/courseDataList',         //请求后台的URL（*）
            method: 'post',                      //请求方式（*）
            toolbar: '#toolbar',                //工具按钮用哪个容器
            striped: true,                      //是否显示行间隔色
            cache: true,                       //是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
            pagination: true,                   //是否显示分页（*）
            sortable: false,                     //是否启用排序
            sortOrder: "asc",                   //排序方式
            queryParams: oTableInit.queryParams,//传递参数（*）
            sidePagination: "server",           //分页方式：client客户端分页，server服务端分页（*）
            pageNumber:1,                       //初始化加载第一页，默认第一页
            pageSize: 10,                       //每页的记录行数（*）
            pageList: [10,25, 50, 100],        //可供选择的每页的行数（*）
            search: false,                       //是否显示表格搜索，此搜索是客户端搜索，不会进服务端，所以，个人感觉意义不大
            strictSearch: true,
            showColumns: true,                  //是否显示所有的列
            showRefresh: true,                  //是否显示刷新按钮
            minimumCountColumns: 2,             //最少允许的列数
            clickToSelect: true,                //是否启用点击选中行
            height: 500,                        //行高，如果没有设置height属性，表格自动根据记录条数觉得表格高度
            uniqueId: "courseId",                     //每一行的唯一标识，一般为主键列
            showToggle:false,                    //是否显示详细视图和列表视图的切换按钮
            cardView: false,                    //是否显示详细视图
            detailView: false,                   //是否显示父子表
            columns: [{
                //checkbox: true
                radio:true
            },/* {
                field: 'puoductNo',
                title: '商品编号'
            },*/ {
                field: 'courseName',
                title: '课程名称'
            },{
                field: 'schoolName',
                title: '学校名称'
            },{
                field: 'level',
                title: '课程级别'
            },{
                field: 'cycle',
                title: '培训周期'
            },{
                field: 'courseTime',
                title: '上课时间'
            },{
                field: 'hot',
                title: '人气'
            },{
                field: 'trainingType',
                title: '行业分类'
            }/*,{
                field: 'type',title: '类型',
                formatter:function(value,row,index){
                    if(value==1) value = '线索页轮播图';
                    /!*else if(value==1) value = '上架';*!/
                    return value;
                }
            }*/,{
                field: 'createTime',
                title: '创建日期'
            },/*{
                field: 'status',title: '状态',
                formatter:function(value,row,index){
                    if(value==0) value = '隐藏';
                    else if(value==1) value = '显示';
                    return value;
                }
            },{
                field: 'status',
                title: '操作',
                formatter:function(value,row,index){
                	var node = '';
                    if(value==0){
                        node += '<input type="button" class="btn btn-primary btn-xs" value="显示" onclick="stateCheck(\''+row.id+'\')">';
                    }else if(value==1){
                        node += '<input type="button" class="btn btn-success btn-xs" value="隐藏" onclick="stateCheck(\''+row.id+'\')">';
                    }
                	return node;
                }
            }/*, {
                field: 'remark',
                title: '备注',
                formatter: function (value, row, index) {
                    var node = '';
                    if(value != undefined) {
                        node += '<input type="button" class="btn btn-primary btn-xs" value="备注" onclick="remark(\'' + value + '\')">';
                    }
                    return node;
                }
            }*/]
        });
    };

    //得到查询的参数
    oTableInit.queryParams = function (params) {
    	tempQueryParams = {   //这里的键的名字和控制器的变量名必须一直，这边改动，控制器也需要改成一样的
            pageNum: params.offset/params.limit + 1,  //页码
            pageSize: params.limit,   //页面大小
            productNo: $("#productNo").val(),
            productName: $("#productName").val(),
            courseName: $("#courseName").val(),
            //departmentname: $("#txt_search_departmentname").val(),
            schoolName: $("#schoolName").val()
        };
        return tempQueryParams;
    };
	//add by cailin
    oTableInit.refresh = function(isToFirst){
		var params = { silent: true, query: tempQueryParams }
		/*if(isToFirst){
			params.url = "${adminPath}/user/dataList";
		}*/
		$('#tb_departments').bootstrapTable('refresh',params);
    }
    return oTableInit;
};


var ButtonInit = function () {
    var oInit = new Object();
    var postdata = {};

    oInit.Init = function () {
        //初始化页面上面的按钮事件
    };

    return oInit;
};

</script>
    
    
</body>
</html>
