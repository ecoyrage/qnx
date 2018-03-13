$(document).ready(function() {
	 /**
	  * @param url
	  * @param data
	  * @param successfn 自定义成功返回
	  * @param errorfn  自定义异常返回
	  * @param isAsysc  开启同步，默认true(异步);
	  */
	jQuery.extendAjax=function(url, data, successfn, errorfn, isAsysc) {
		        data = (data==null || data=="" || typeof(data)=="undefined") ?
		        		{"date": new Date().getTime()} : data;
		        App.blockUI();
	        	$.ajax({
		            type: "post",
		            data: data,
		            url: url,
		            async : typeof isAsysc == 'undefined' ? true :isAsysc ,
		            dataType: "json",
		            cache:false,
		            success: function(data){
		                if($.isFunction(successfn)){
		                	successfn(data);
		                }else{
		                	if (data.success == true){
		        				
		        			}else if (data.message != null){

		        			}else{
		        				
		        			}
		                }
		            },
		            error: function(e){
		            	if($.isFunction(errorfn)){
		            		errorfn(e);
		            	}else{
		            		alert("未知异常！");
		            	}
		            },
		            complete:function(){
		            	App.unblockUI();
		            }
		        });
		        
	    };
	    /** alert **/
	    $.fn.modalAlert = function (content, type) {
	        var icon = "";
	        var iconType = 0;
	        if (type == 'success') {
	            icon = "fa-check-circle";
	            iconType = 1;
	        }
	        if (type == 'error') {
	            icon = "fa-times-circle";
	            iconType = 2;
	        }
	        if (type == 'warning') {
	            icon = "fa-exclamation-circle";
	            iconType = 3;
	        }
	        top.layer.alert(content, {
	            icon: iconType,
	            title: "系统提示",
	            btn: ['确认'],
	            btnclass: ['btn btn-primary'],
	        });
	    }
	    
	    /**
	     * message
	     */
	    $.fn.showMessage = function(content,icon){
	    	top.layer.msg(content,{icon:icon,time:2000})
	    }
	    
	    /**
	     * success消息框
	     */
	    $.fn.showSuccessMsg = function(content){
	    	$.fn.showMessage(content,1);
	    }
	    
	    /**
	     * error消息框
	     */
	    $.fn.showErrorMsg = function(content){
	    	$.fn.showMessage(content,2);
	    }
	    /**
	     * confirm
	     */
	    $.fn.showConfirm= function(content,func){
	    	var index = layer.confirm(content, {
	    		  btn: ['确定','取消'] //按钮
	    		}, function(){
	    			if($.isFunction(func)){
	    				func();
	    			}
	    			layer.close(index);
	    		});
	    }
});