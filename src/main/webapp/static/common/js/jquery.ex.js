/* Extends jQuery */
(function($){
	$.sp = $.sp || {};
	
	/* extend ajax request methods */
	$._ajax = function(s){
		if(typeof s.success=='function'){
        	var _success = s.success;
        	s.success = function(data, status, xhr){
        		var dataObject = data;
        		if(typeof dataObject != 'object') {try {dataObject = JSON.parse(dataObject);} catch (e) { /*ignore*/ }}
        		_success(dataObject, status, xhr);
        	};
        }
		$.ajax.call(this,s);//or $.ajax(s);
	}
    
    $.sp.getAjaxConf = function(url, data, success) {
    	if(success == undefined){
    		if(typeof url != 'string'){
    			alert('$.postJSON入参url不能为空');
    			return null;
    		}else{
				if(typeof data == 'function'){
					success = data;
					data = null;
				}
    		}
    	}
    	return {
            url: url,
            type: "POST",
            data: data ? JSON.stringify(data) : null,
            dataType: "json",
            contentType: "application/json; charset=utf-8",
            success: success
        };
	};
	$.postJSON = function (url, data, success) {
        $._ajax($.sp.getAjaxConf(url, data, success));
    };
    //jq自带getJSON
    //$.getJSON( url [, data ] [, success(data, textStatus, jqXHR) ] )
	
	/**
	 * 序列化表单
	 * var data = $("#form").serializeObject();
	 */
	$.fn.serializeObject = function() {
		var o = {};
		var a = this.serializeArray();
		$.each(a, function() {
			if (o[this.name] !== undefined) {
				if (!o[this.name].push) {
					o[this.name] = [o[this.name]];
				}
				o[this.name].push(this.value || '');
			} else {
				o[this.name] = this.value || '';
			}
		});
		return o;
	};
})(jQuery);
