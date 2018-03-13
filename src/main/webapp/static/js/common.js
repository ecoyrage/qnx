var BaseUrl = window.location.protocol + "//" + window.location.host;
var Domain = window.location.host;
function ajaxJSON(url, method, data, async, func) {
	if (url.indexOf("http://") < 0) {
		//url = BaseUrl+url;
	}
	$.ajax({
		type : method,
		dataType : "json",
		data : data,
		contentType : "application/x-www-form-urlencoded;charset=UTF-8",
		url : url,
		async : async,
		success : func,
		error : function() {
		}
	});
}

function isNotBlank(a) {
	if (a == undefined || a == null || a == "null" || a == "undefined" || a == "") {
		return false
	}
	return true
}
function isDigital(b) {
	return $.isNumeric(b);
}
function checkTel(v) {
	var u = /^(13[0-9]|14(5|7)|15(0|1|2|3|5|6|7|8|9)|17[0-9]|18[0-9])\d{8}$/;
	return u.test(v)
};

function formatTime_ymdhms(now) {
	var year=now.getFullYear(); 
	var month=now.getMonth()+1; 
	var date=now.getDate()<10?("0"+now.getDate()):now.getDate(); 
	var hour=now.getHours()<10?("0"+now.getHours()):now.getHours(); 
	var minute=now.getMinutes()<10?("0"+now.getMinutes()):now.getMinutes(); 
	var second=now.getSeconds()<10?("0"+now.getSeconds()):now.getSeconds(); 
    return year+"-"+month+"-"+date+" "+hour+":"+minute+":"+second; 
}

/*
*倒计时
*str:"2015/8/29 14:43:42"  $Date:日jq对象  $Hour：时jq对象......
*/
function dtTime(str, $Date, $Hour, $Minute, $Second) {
    dtTimer = setInterval(function () {
        var oDate = new Date();
        var curTime = oDate.getTime();
        var overTime = Date.parse(str);
        var t = parseInt((overTime - curTime) / 1000);
        var d = parseInt(t / (24 * 3600));
        d = d < 10 ? '0' + d : d;
        var h = parseInt((t % (24 * 3600)) / 3600);
        h = h < 10 ? '0' + h : h;
        var m = parseInt((t % 3600) / 60);
        m = m < 10 ? '0' + m : m;
        var s = parseInt(t % 60);
        s = s < 10 ? '0' + s : s;
        if (t > 0) {
            $Date.text(d);
            $Hour.text(h);
            $Minute.text(m);
            $Second.text(s);
        }
        else {
            $Date.text('00');
            $Hour.text('00');
            $Minute.text('00');
            $Second.text('00');
        }

    }, 1000)
}

function TimeFormat(time) {
    if (parseInt(time)) {
        if (parseInt(time) < 10 && parseInt(time) > 0) {
            return "0" + time
        } else if (parseInt(time) < 0) {
            if (Math.abs(parseInt(time)) < 10) {
                return "0" + Math.abs(parseInt(time));
            } else {
                return Math.abs(parseInt(time));
            }
        }
        else {
            return time;
        }
    } else {
        return "00";
    }
}

/*TCChange:tab的c切换*
*$TLi:
t中点击的当前li对象
*$C：
c对象
*attrname:
t c 中实现匹配的凭证（attrname相等则匹配是一对）
*classname:
t c 内容中选中时（必须用同一个类名通过父级类实现）
*/
function TCChange($TLi, $C, attrname, classname) {
    $TLi.siblings('li').removeClass(classname);
    var sInd = $TLi.addClass(classname).attr(attrname);
    $C.children().removeClass(classname).filter(function (ind, obj) {
        return $(obj).attr(attrname) === sInd;
    }).addClass(classname);
}

/*
弹性运动
$obj
iRight:right的初始值
iTarget:right的目标值
*/
var timer = null;
function startMove($obj, iRight, iTarget) {
    var iR = iRight;
    clearInterval(timer);
    timer = setInterval(function () {
        var iSpeed = (iTarget - iRight) / 5;
        iSpeed *= 0.7;
        $('#side-service').find('.foot').css({ 'position': 'fixed' });
        if (Math.abs(iSpeed) < 1 && Math.abs(iTarget - iRight) < 1) {
            clearInterval(timer);
            if (iTarget > iR) {
                $('#side-service').find('h3').css({ 'position': 'fixed' });
                //$('#side-service').find('.foot').css({ 'position': 'fixed' });
                //$('#side-service').find('.foot').css({ "display": "block" });
            }

            $obj.css('right', iTarget + 'px');
        }
        else {
            iRight += iSpeed;
            $obj.css('right', iRight + 'px');
            $('#side-service').find('.foot').css({ 'position': 'fixed', "right": "" + iRight + "" });
            $('#side-service').find('.foot').css('right', iRight + 'px');
        }


    }, 30);
}
function closeSide() {
    $('#side-service').find('h3').css({ 'position': 'absolute' });
    $('#side-service').find('.foot').css({ 'position': 'absolute' });
    startMove($('#side-service'), 0, -270);
    $("#side-service .t li").removeClass("sel");

}


window.onload = function () {
    //延时加载
    $("img[tag='lazy']").lazyload({
        effect: "fadeIn",
        placeholder: "http://img5.zhongjiu.cn/blank.gif"
    });

    var oInp = $("#keyword").get(0);
    if (oInp!=null && oInp!=undefined) {
    	var oldInpVal = oInp.value;
        oInp.onfocus = function () {
            oInp.value = '';
        }
        oInp.onblur = function () {
            if (oInp.value === '') {
                oInp.value = oldInpVal;
            }
        }
	}
    
};
function cenave(lei) {
	$(window).bind('scroll', function() {
		if ($(window).scrollTop() >= 550) {
			$(lei).show();
		} else {
			$(lei).hide();
		}
	})
}

function ObjectById(id){
	return document.getElementById(id);
}

function getCookie(key) {
	return $.cookie(key, { path: "/", raw:true});
}

function setCookie(key, val, expires) {
	if (expires==null || expires==undefined) {
		expires = -1;
	}
	$.cookie(key, val, {expires:expires, path:'/', raw:true});
}

function delCookie(key) {
	$.cookie(key, null, {path:'/'}); 
}

function search(o) {
	window.location.href=BaseUrl+"/goods/list?keyword="+$("#keyword").val();
}

$(function () {


});
