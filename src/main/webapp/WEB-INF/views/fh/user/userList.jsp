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

    <%--<div class="panel panel-default" style="margin:0px;padding:0px">
        <form id="formSearch" class="form-horizontal" style="margin:0px;padding:0px">
            <div class="form-group" style="margin-top:15px">
                <label class="control-label col-sm-1" for="mobile" style="width:55px">帐号</label>
                <div class="col-sm-2">
                    <input type="text" name="mobile" id="mobile" class="form-control">
                </div>
                <label class="control-label col-sm-1" for="realName" style="width:55px">姓名</label>
                <div class="col-sm-2">
                    <input type="text" name="realName" id="realName" class="form-control">
                </div>
                <label class="control-label col-sm-1" for="companyName" style="width:80px">机构名称</label>
                <div class="col-sm-2">
                    <input type="text" name="companyName" id="companyName" class="form-control">
                </div>
                <label class="control-label col-sm-1" for="companyTel" style="width:80px">机构电话</label>
                <div class="col-sm-2">
                    <input type="text" name="companyTel" id="companyTel" class="form-control">
                </div>
                <label class="control-label col-sm-1" for="useable" style="width:55px">状态</label>
                <div class="col-sm-2"  style="width:100px">
                    <select class="form-control" name="useable" id="useable">
                        <option value="">--全部--</option>
                        <option value="0">待审核</option>
                        <option value="1">审核通过</option>
                        <option value="2">驳回</option>
                    </select>
                </div>
            </div>
        </form>
    </div>--%>


    <div id="toolbar" class="btn-group">
            <%--<button id="btn_add" type="button" class="btn btn-default">
                <span class="glyphicon glyphicon-plus" aria-hidden="true"></span>新增
            </button>--%>
            <%--<button id="btn_edit" type="button" class="btn btn-default">
                <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>修改
            </button>--%>
            <%--<button id="btn_delete" type="button" class="btn btn-default">
                <span class="glyphicon glyphicon-remove" aria-hidden="true"></span>删除
            </button>--%>
            <%--<button id="btn_check" type="button" class="btn btn-default">
                <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>代理商审核
            </button>--%>
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
        var dialog = $.fn.modalOpen({
            id: "Form",
            title: '新增',
            url: '${adminPath}/goodsType/form',
            width: "750px",
            height: "550px",
            callBack: function (iframeId) {
                top.frames[iframeId].submitForm(function(){
                	//window.location.reload();
                	//refreshTable();
                	oTable.refresh(false);
	               	dialog.close();
                });
                //top.layer.close(iframeId);
               	//dialog.close();
            }
        });
    });
    $("#btn_edit").click(function(){
	    var selects = $("#tb_departments").bootstrapTable('getSelections');
	    if(selects.length==1){
	        var id = selects[0].id;
			var dialog = $.fn.modalOpen({
			    id: "Form",
			    title: '编辑',
			    url: '${adminPath}/goodsType/form?id='+id,
			    width: "750px",
			    height: "550px",
			    callBack: function (iframeId) {
			        top.frames[iframeId].submitForm(function(){
	                	//window.location.reload();
	                	//refreshTable();
	                	oTable.refresh(false);
		               	dialog.close();
	                });
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
	        var id = selects[0].id;
	        var dialog = $.fn.modalConfirm('您确定要删除分类：'+selects[0].name+'？', function(pass){
	        	if(pass){
	        		$.postJSON('${adminPath}/goodsType/delete?id='+id, function(data){
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

//代理商审核
$("#btn_check").click(function(){
    var oTable = new TableInit();
    oTable.Init();
    var selects = $("#tb_departments").bootstrapTable('getSelections');
    if(selects.length==1){
        var id = selects[0].userId;
        var isBusiness = selects[0].isBusiness;
        var isAgent = selects[0].agentState;
        if(isBusiness != 1){
            $.fn.modalMsg("加盟商才可申请代理商","wraining");
        }else if(isAgent == 1){
            $.fn.modalMsg("已经是代理商","wraining");
        }else if(isBusiness == 1){
            var dialog = $.fn.modalOpen({
                id: "Form",
                title: '代理商审核',
                url: '${adminPath}/user/isAgent?userId='+id,
                width: "950px",
                height: "950px",
                callBack: function (iframeId) {
                    top.frames[iframeId].submitForm(dialog, oTable);
                        //window.location.reload();
                        //refreshTable();
                        oTable.refresh();
//                        dialog.close();
                    //top.layer.close(iframeId);
                    //dialog.close();
                }
            });
        }
    }else{
        $.fn.modalMsg("请选中一行","wraining");
    }
});

function addChild(id){
    var oTable = new TableInit();
    oTable.Init();
    if(id!=undefined){
        var dialog = $.fn.modalOpen({
            id: "Form",
            title: '审核',
            url: '${adminPath}/user/isVip?userId='+id,
            width: "950px",
            height: "950px",
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
function delUser(id){
    var oTable = new TableInit();
    oTable.Init();
    var f = window.confirm('确认删除?');
    if (!f) {
        return;
    }
    $.ajax({
        type : "post",
        dataType : "json",
        data : {id:id},
        contentType : "application/x-www-form-urlencoded;charset=UTF-8",
        url : '${adminPath}/user/delUser?userId='+id,
        async : false,
        success : function(data) {
            if (0 == data.code) {
                alert(data.msg);
            }else if (1 == data.code) {
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
            url: '${adminPath}/user/dataList',         //请求后台的URL（*）
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
            uniqueId: "id",                     //每一行的唯一标识，一般为主键列
            showToggle:false,                    //是否显示详细视图和列表视图的切换按钮
            cardView: false,                    //是否显示详细视图
            detailView: false,                   //是否显示父子表
            columns: [{
                //checkbox: true
                radio:true
            }, /*{
                field: 'id',
                title: '编号'
            },*/{
                field: 'mobile',
                title: '帐号'
            }/*,{
                field: 'realName',
                title: '姓名'
            },{
                field: 'useable',title: '状态',
                formatter:function(value,row,index){
                    if(value==0) value = '待审核';
                    else if(value==1) value = '审核通过';
                    else if(value==2) value = '申请驳回';
                    return value;
                }
            }*/,{
                field: 'createTime',
                title: '注册日期'
            }/*{
                field: 'useable',
                title: '审核',
                formatter:function(value,row,index){
                	var node = '';
                    if(value==0){
                        node += '<input type="button" class="btn btn-primary btn-xs" value="审核" onclick="addChild(\''+row.id+'\')">';
                    }else if(value==1){
                        node += '<input type="button" class="btn btn-success btn-xs" value="详情" onclick="addChild(\''+row.id+'\')">';
                    }else if(value==2){
                        node += '<input type="button" class="btn btn-primary btn-xs" value="审核" onclick="addChild(\''+row.id+'\')">';
                        node += '<input type="button" class="btn btn-danger btn-xs" value="删除该用户" onclick="delUser(\''+row.id+'\')">';
                    }
                	return node;
                }
            },{
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
            realName: $("#realName").val(),
            mobile: $("#mobile").val(),
            companyName: $("#companyName").val(),
            companyTel: $("#companyTel").val(),
            useable: $("#useable").val(),
            //departmentname: $("#txt_search_departmentname").val(),
            type: $("#txt_search_statu").val()
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
