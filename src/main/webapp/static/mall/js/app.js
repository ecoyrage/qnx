function getQueryString(name) {
	var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)", "i");
	var r = window.location.search.substr(1).match(reg);
	if (r != null) return decodeURIComponent(r[2]); return "";
}
function getQueryArg(name) {
	var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)", "i");
	var r = window.location.search.substr(1).match(reg);
	if (r != null) return r[2]; return "";
}

//写cookies
function setCookie(name,value, expireDays)
{
if(typeof expireDays != 'number'){
	expireDays=30;
}
var exp = new Date();
//exp.setDate(exp.getDate() + expireDays);
exp.setTime(exp.getTime() + expireDays*24*60*60*1000);
document.cookie = name + "="+ encodeURIComponent(value) + ";expires=" + exp.toGMTString()+";path=/";
}

function getCookie(name)
{
var arr,reg=new RegExp("(^| )"+name+"=([^;]*)(;|$)");
if(arr=document.cookie.match(reg))
return decodeURIComponent(arr[2]);
else
return null;
}

function delCookie(name)
{
var exp = new Date();
exp.setTime(exp.getTime() - 1);
var cval=getCookie(name);
if(cval!=null)
document.cookie= name + "="+cval+";expires="+exp.toGMTString();
}

function loadJs(src) {
    var ele = document.createElement('script');
    ele.setAttribute("type", "text/javascript");
    ele.setAttribute("src", src);
    document.getElementsByTagName("head")[0].appendChild(ele);
}
function loadCss(href) {
	var ele = document.createElement('link');
	ele.setAttribute("rel", "stylesheet");
	ele.setAttribute("type", "text/css");
	ele.setAttribute("href", href);
	document.getElementsByTagName("head")[0].appendChild(ele);
}


var app = {};
app.host = "/ins/api/cgi";
app.imgHost = "http://116.62.47.157/ins/resource/";
app.token = '';
app.isLoadUser = false;
app.getToken = function() {
	if(app.token == '') {
		app.token = getCookie('tk');
		if(app.token==null || app.token==''){
			app.token = '';
			delCookie('tk');
			//alert("请先返回app登录！");
		}
	}
	return app.token;
};
app.setToken = function(token) {
	app.token = token;
	setCookie('tk', token);
};
app.init = function(){
	//save url token
	var token = getQueryString("token");
	if(token!=null && token!=''){
		var oldToken = getCookie('tk');
		if(oldToken==null || oldToken=='' || oldToken!=token){
			localStorage.setItem("INS_USER", "");
			app.isLoadUser = true;
		}
		app.token = token;
		setCookie('tk', token);
		history.replaceState(null, "保道商城", delURLArg(location.href, "token"));
	}
};
app.setUser = function(userObj){
	if(userObj) {
		localStorage.setItem("INS_USER", JSON.stringify(userObj));
		app.token = userObj.accessToken;
		setCookie('tk', userObj.accessToken);
	}
};
app.getUser = function(){
	var user;
	var userStr = localStorage.getItem("INS_USER");
	if(userStr && userStr!=""){
		try {user = JSON.parse(userStr);} catch (e) {}
	}
	return (user && user!="") ? user : null;
};
app.loadUser = function(){
	$.postApi2("ins.user.userInfo",function(res){
		if(res.errno==0){
			localStorage.setItem("INS_USER", JSON.stringify(res.data));
		}
	});
};
app.init();//**

app.msg = function(content){
	layer.open({
	  content: content
	  ,skin: 'msg'
	  ,time: 2 //2秒后自动关闭
	});
};
app.alert = function(content, yesFun, btnText){
	//信息框
	if(typeof yesFun == 'string'){
		btnText = yesFun;
		yesFun = undefined;
	}
	layer.open({
		shadeClose: false,
		content: content,
		btn: btnText||"好的",
		yes: yesFun,
	});
};
app.confirm = function(content, yesFun, noFun, btnTextArr){
	//询问框
	layer.open({
		shadeClose: false,
		content: content
		,btn: btnTextArr || ['确定', '取消']
		,yes: yesFun
		,no: noFun
	});
};
app.showLoading = function() {
	//var html = '<div style="position:fixed; width:100%; margin:80px auto; text-align:center;"><img src="images/comming_soon.png" width="305" height="233" alt=""> <br>页面正在建设中...</div>';
	//$(document.body).append(html);
	app.loadingIndex = layer.open({type: 2,shadeClose: false});
};
app.hideLoading = function(){
	layer.close(app.loadingIndex);
};

//获取url的参数值
function getURLArg(url, arg){
	url = decodeURIComponent(url);
    //获取要取得的get参数位置
    var argIdx = url.indexOf("?"+arg +"=");
    if(argIdx == -1){
    	argIdx = url.indexOf("&"+arg +"=");
    	if(argIdx == -1){
    		return "";
    	}
    }
    //截取字符串
    var argValStr = url.slice(argIdx + arg.length + 2);
    //判断截取后的字符串是否还有其他参数
    var nextArgIdx = argValStr.indexOf("&");
    if(nextArgIdx != -1){
    	argValStr = argValStr.slice(0, nextArgIdx);
    }
    return decodeURIComponent(argValStr);
}
//设置url参数
function setURLArg(url,arg,argVal){
	if(!url || url==""){
		return url;
	}
    var pattern=arg+'=([^&]*)';
    var replaceText=arg+'='+argVal; 
    if(url.match(pattern)){
        var tmp='/('+ arg+'=)([^&]*)/gi';
        tmp=url.replace(eval(tmp),replaceText);
        return tmp;
    }else{
        if(url.match('[\?]')){ 
            return url+'&'+replaceText; 
        }else{ 
            return url+'?'+replaceText; 
        } 
    }
}
//删除url参数
function delURLArg(url,arg){
	var idx = url.indexOf("?");
	if(idx > -1){
		var beforeUrl = url.substr(0,idx+1);//**?
		var urlParam = url.substr(idx+1);
		var nextUrl = "";
		if(urlParam!=""){
			var arr = new Array();
			var urlArgArr = urlParam.split("&");
			for(var i=0;i<urlArgArr.length;i++){
				var paramArr = urlArgArr[i].split("=");
				if(paramArr[0]!=arg){
					arr.push(urlArgArr[i]);
				}
			}
			if(arr.length>0){
				nextUrl = arr.join("&");
			}
		}
		url = beforeUrl+nextUrl;
		return url;
	}
	return url;
}

(function($){
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
	
	/**
	 * 请求API函数
	 * service: api服务名称
	 * param: object参数
	 * success: 回调函数
	 */
	$.postApi = function (service, params, _success) {
		var token = app.getToken();
		if(typeof params == 'function'){
			_success = params;
			params = null;
		}
		$.ajax({
			url: app.host,
			type: "POST",
			data: {"service":service,"params":(params ? JSON.stringify(params) : ''), "version":0, "token":token},
			dataType: "json",
			//contentType: "application/json; charset=utf-8",
			success: function(data, status, xhr){
        		if(typeof data != 'object') {try {data = JSON.parse(data);} catch (e) { /*ignore*/ }}
        		if(data.errno==1000 || data.errno==1001 || data.errno==1002) {
					//alert("请登录！");
        			if(location.href.indexOf('/mall/index.html') == -1) {
	        			app.alert("您还没有登录，请先登录！",function(){
	        				location.href = "login.html?redirect=" + encodeURIComponent(delURLArg(location.href,"token"));
	        			});
	        			//window.history.go(-1);//window.history.back();返回上一页
        			}
				}else{
					if(typeof _success == "function"){
						_success(data, status, xhr);
					}
				}
        	}
		});
    };
    $.postApi2 = function (service, params, _success) {
		var token = app.getToken();
		if(typeof params == 'function'){
			_success = params;
			params = null;
		}
		$.ajax({
			url: app.host,
			//async: false,
			type: "POST",
			data: {"service":service,"params":(params ? JSON.stringify(params) : ''), "version":0, "token":token},
			dataType: "json",
			//contentType: "application/json; charset=utf-8",
			success: function(data, status, xhr){
        		if(typeof data != 'object') {try {data = JSON.parse(data);} catch (e) { /*ignore*/ }}
				if(typeof _success == "function"){
					_success(data, status, xhr);
				}
        	}
		});
    };
    
    if(app.getToken() != '') {
    	if(app.isLoadUser){
    		app.loadUser();
    	}
    	
    	//console.log('saveReadTime');
    	var readTimeStr = localStorage.getItem("readTime");
    	if(readTimeStr) {
    		localStorage.removeItem("readTime");
    		var readTime = JSON.parse(readTimeStr);
    		if(readTime && readTime.itemId && readTime.itemTitle 
    				&& readTime.openTime && readTime.closeTime && readTime.closeTime > 0) {
    			if(readTime.closeTime - readTime.openTime > 5000){
    				//停留超过5秒时
    				$.postApi2("ins.user.saveReadTime", readTime);
    			}
    		}
    	}
    }
})(jQuery);

//-----------------------------------------------

//保留两位小数  将浮点数四舍五入，取小数点后2位
function toDecimal(x) {
  var f = parseFloat(x);
  if (isNaN(f)) {
    return;
  }
  f = Math.round(x*100)/100;
  return f;
}

//只保留2位小数，如：2，会在2后面补上00.即2.00 
function toAmtStr(x) {
  var f = parseFloat(x);
  if (isNaN(f)) {
    return false;
  } 
  var f = Math.round(x*100)/100;
  var s = f.toString();
  var rs = s.indexOf('.');
  if (rs < 0) {
    rs = s.length;
    s += '.';
  }
  while (s.length <= rs + 2) {
    s += '0';
  }
  return s;
}
function formatFloat(src,pos){   
   return Math.round(src*Math.pow(10, pos))/Math.pow(10, pos);   
}


function formatFileSize(k) {
	return toAmtStr(k/1024);
}
function formatFileTime(sec) {
	if(sec) {
		if(sec < 60) {
			return (sec < 10) ? "0:0"+sec : "0:"+sec;
		}else{
			var y = sec % 60;
			if(y>0) {
				return (y < 10) ? (parseInt(sec/60) + ":0" + y) : (parseInt(sec/60) + ":" + y);
			}else{
				return parseInt(sec/60) + ":00";
			}
		}
	}
	return '';
}
function isEmpty(obj) {
    obj = $.trim(obj);
    if (obj.length == 0 || obj == null || obj == undefined) {
        return true;
    }else{
    	return false;
    }
}

