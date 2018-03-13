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
<style type="text/css">
.tree-bstable .default_node, .tree-bstable .default_active_node {
    width: 16px;
    height: 16px;
    border: medium none;
    margin: 0;
    padding: 0;
    display: inline-block;
}
.tree-bstable .default_shut, .tree-bstable .default_last_shut {
    background: url(/qdb/static/content/plugins/treeTable/themes/vsStyle/allbgs.gif) no-repeat -16px 1px;
    width: 16px;
}
.tree-bstable .default_active_node {
    cursor: pointer;
}
.tree-bstable .default_open, .tree-bstable .default_last_open {
    background: url(/qdb/static/content/plugins/treeTable/themes/vsStyle/allbgs.gif) no-repeat 0 1px;
    width: 16px;
}

.tree-bstable .default_hover_shut, .tree-bstable .default_hover_last_shut {
background:url(/qdb/static/content/plugins/treeTable/themes/vsStyle/allbgs.gif) no-repeat -48px 1px;
width:16px;
}
.tree-bstable .default_hover_open, .tree-bstable .default_hover_last_open {
background:url(/qdb/static/content/plugins/treeTable/themes/vsStyle/allbgs.gif) no-repeat -32px 1px;
width:16px;
}
</style>
</head>
<body>

<!-- Main content -->
<section class="content">
    <%--<div class="panel-body" style="padding-bottom:0px;">--%>
        <!-- <div class="panel panel-default">
            <div class="panel-heading">查询条件</div>
            <div class="panel-body">
                <form id="formSearch" class="form-horizontal">
                    <div class="form-group" style="margin-top:15px">
                        <label class="control-label col-sm-1" for="txt_search_departmentname">部门名称</label>
                        <div class="col-sm-3">
                            <input type="text" class="form-control" id="txt_search_departmentname">
                        </div>
                        <label class="control-label col-sm-1" for="txt_search_statu">状态</label>
                        <div class="col-sm-3">
                            <input type="text" class="form-control" id="txt_search_statu">
                        </div>
                        <div class="col-sm-4" style="text-align:left;">
                            <button type="button" style="margin-left:50px" id="btn_query" class="btn btn-primary">查询</button>
                        </div>
                    </div>
                </form>
            </div>
        </div> -->

        <div id="toolbar" class="btn-group">
            <button id="btn_add" type="button" class="btn btn-default">
                <span class="glyphicon glyphicon-plus" aria-hidden="true"></span>新增
            </button>
            <%--<button id="btn_edit" type="button" class="btn btn-default">
                <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>修改
            </button>--%>
            <button id="btn_delete" type="button" class="btn btn-default">
                <span class="glyphicon glyphicon-remove" aria-hidden="true"></span>删除
            </button>
        </div>
        <table id="tb_departments" class="tree-bstable"></table>
    <%--</div>--%>

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
            url: '${adminPath}/type/trainingTypeForm',
            width: "550px",
            height: "450px",
            callBack: function (iframeId) {
                top.frames[iframeId].submitForm(dialog, oTable);
                	//window.location.reload();
                	//refreshTable();
                    oTable.refresh();
            }
        });
    });
    $("#btn_edit").click(function(){
        var oTable = new TableInit();
        oTable.Init();
	    var selects = $("#tb_departments").bootstrapTable('getSelections');
	    if(selects.length==1){
	        var id = selects[0].id;
			var dialog = $.fn.modalOpen({
			    id: "Form",
			    title: '编辑',
			    url: '${adminPath}/category/form?id='+id,
			    width: "750px",
			    height: "550px",
			    callBack: function (iframeId) {
                    top.frames[iframeId].submitForm(dialog, oTable);
	                	//window.location.reload();
	                	//refreshTable();
                        oTable.refresh();
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
	        var dialog = $.fn.modalConfirm('您确定要删除类目：'+selects[0].name+'？', function(pass){
	        	if(pass){
	        		$.postJSON('${adminPath}/type/delete?trainingTypeId='+id, function(data){
                        if (0 == data.code) {
                            $.fn.modalMsg(data.msg,"fail");
                        }else if (1 == data.code) {
                            $.fn.modalMsg(data.msg,"success");
                            oTable.refresh();
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

function addChild(id){
    var oTable = new TableInit();
    oTable.Init();
	if(id!=undefined){
		var dialog = $.fn.modalOpen({
		    id: "Form",
		    title: '编辑',
		    url: '${adminPath}/type/trainingTypeForm?parentId='+id,
            width: "550px",
            height: "450px",
		    callBack: function (iframeId) {
                top.frames[iframeId].submitForm(dialog, oTable);
                	//window.location.reload();
                	//refreshTable();
                    oTable.refresh();
		    }
		});
	}
}

function formatTreeNode(value,row,index){
	var nodeId = row.id;
	var nodePid = row.parentId;
	var blankNode = '';
	if(row.level && row.level > 1) {
		for (var n = 1; n < row.level; n++) {
			blankNode += '<span class="default_node default_blank"></span>';
		}
	}
	var prevSpan = '<span class="prev_sp">'+blankNode+'</span>';
	var iconNode = '';
	if(row.isLeaf!=undefined && row.isLeaf==1){
		//default_shut,default_open
		iconNode = '<span arrow="true" class="default_node default_leaf" id="node_'+nodeId+'" pid="'+nodePid+'"></span>';
	}else{
		iconNode = '<span arrow="true" class="default_node default_active_node default_open" onclick="toggleTreeNode('+nodeId+')" id="node_'+nodeId+'" pid="'+nodePid+'"></span>';
	}
	var preNode = '<span class="prev_sp">'+prevSpan+'</span>'+iconNode;
	return preNode + value;
}
function toggleTreeNode(id){
	var $this = $('#node_'+id);
	//$this.removeClass('default_open').addClass('default_shut');
	$this.toggleClass('default_open').toggleClass('default_shut');
	var $tbody = $this.parent('td').parent('tr').parent('tbody');
	//$(e.target).closest("tr").toggleClass("hilight");
	$this.closest("tr").nextAll().each(function(){
		var $thisTr = $(this);
		$thisTr.find('.default_node').filter('span[pid='+id+']').each(function(){
			$thisTr.toggleClass('hidden');
		});
	});
}


var tempQueryParams;//分页参数缓存
var TableInit = function () {
    var oTableInit = new Object();
    //初始化Table
    oTableInit.Init = function () {
        $('#tb_departments').bootstrapTable({
            url: '${adminPath}/type/trainingTypeDataList',         //请求后台的URL（*）
            method: 'post',                      //请求方式（*）
            toolbar: '#toolbar',                //工具按钮用哪个容器
            striped: true,                      //是否显示行间隔色
            cache: false,                       //是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
            pagination: true,                   //是否显示分页（*）
            sortable: false,                     //是否启用排序
            sortOrder: "asc",                   //排序方式
            queryParams: oTableInit.queryParams,//传递参数（*）
            sidePagination: "server",           //分页方式：client客户端分页，server服务端分页（*）
            pageNumber:1,                       //初始化加载第一页，默认第一页
            pageSize: 100,                       //每页的记录行数（*）
            pageList: [10, 25, 50, 100],        //可供选择的每页的行数（*）
            search: false,                       //是否显示表格搜索，此搜索是客户端搜索，不会进服务端，所以，个人感觉意义不大
            strictSearch: true,
            showColumns: true,                  //是否显示所有的列
            showRefresh: true,                  //是否显示刷新按钮
            minimumCountColumns: 2,             //最少允许的列数
            clickToSelect: true,                //是否启用点击选中行
            height: 580,                        //行高，如果没有设置height属性，表格自动根据记录条数觉得表格高度
            uniqueId: "id",                     //每一行的唯一标识，一般为主键列
            showToggle:false,                    //是否显示详细视图和列表视图的切换按钮
            cardView: false,                    //是否显示详细视图
            detailView: false,                   //是否显示父子表
            onLoadSuccess: function(data){
            },
            columns: [{
                //checkbox: true
            	radio:true
            }, {
                field: 'name',
                title: '类目名称',
                formatter:formatTreeNode
            },{
                title: '操作',
                formatter:function(value,row,index){
                	var node = '';
                	if(row.level<3){
	                	node += '<input type="button" class="btn btn-primary btn-xs" value="添加子类目" onclick="addChild(\''+row.id+'\')">';
                	}
                	return node;
                }
            }]
        });
    };
    //得到查询的参数
    oTableInit.queryParams = function (params) {
    	tempQueryParams = {   //这里的键的名字和控制器的变量名必须一直，这边改动，控制器也需要改成一样的
            pageNum: params.offset + 1,  //页码
            pageSize: params.limit,   //页面大小
            //departmentname: $("#txt_search_departmentname").val(),
            type: $("#txt_search_statu").val()
        };
        return tempQueryParams;
    };
	//add by cailin
    oTableInit.refresh = function(isToFirst){
		var params = { silent: true, query: tempQueryParams }
		if(isToFirst){
			params.url = "${adminPath}/category/dataList";
		}
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

/* function test(){
	$.ajax({
		type:'POST',
		url:'${adminPath}/category/dataList',
		contentType:"application/json;charset=utf-8",
		data:JSON.stringify({pageNum:1,pageSize:10}),
		dataType:'json',
		success:function(data){
			//alert(JSON.stringify(data));
		}
	});
} */
    
    
</script>
    
    
</body>
</html>
