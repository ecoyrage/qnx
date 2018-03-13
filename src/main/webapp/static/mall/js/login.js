jQuery(document).ready(function($){
	var $form_modal = $('.cd-user-modal'),
		$form_login = $form_modal.find('#cd-login'),
		$form_signup = $form_modal.find('#cd-signup'),
		$form_modal_tab = $('.cd-switcher'),
		$tab_login = $form_modal_tab.children('li').eq(0).children('a'),
		$tab_signup = $form_modal_tab.children('li').eq(1).children('a'),
		$main_nav = $('.main_nav');

	//��������
	$main_nav.on('click', function(event){
		if( $(event.target).is($main_nav) ) {
			// on mobile open the submenu
			$(this).children('ul').toggleClass('is-visible');
		} else {
			// on mobile close submenu
			$main_nav.children('ul').removeClass('is-visible');
			//show modal layer
			$form_modal.addClass('is-visible');	
			//show the selected form
			( $(event.target).is('.cd-signup') ) ? signup_selected() : login_selected();
		}
	});

	//�رյ�������
	$('.cd-user-modal').on('click', function(event){
		if( $(event.target).is($form_modal) || $(event.target).is('.cd-close-form') ) {
			$form_modal.removeClass('is-visible');
		}	
	});
	//ʹ��Esc���رյ�������
	$(document).keyup(function(event){
    	if(event.which=='27'){
    		$form_modal.removeClass('is-visible');
	    }
    });

	//�л���
	$form_modal_tab.on('click', function(event) {
		event.preventDefault();
		( $(event.target).is( $tab_login ) ) ? login_selected() : signup_selected();
	});

	function login_selected(){
		$form_login.addClass('is-selected');
		$form_signup.removeClass('is-selected');
		//$form_forgot_password.removeClass('is-selected');
		$tab_login.addClass('selected');
		$tab_signup.removeClass('selected');
	}

	function signup_selected(){
		$form_login.removeClass('is-selected');
		$form_signup.addClass('is-selected');
		//$form_forgot_password.removeClass('is-selected');
		$tab_login.removeClass('selected');
		$tab_signup.addClass('selected');
	}
	function showRegister(){
		//show modal layer
		$form_modal.addClass('is-visible');	
		signup_selected();
	}
	function hideForm(){
		$form_modal.removeClass('is-visible');
	}
	
	
	var ruid = getQueryString("ruid");
	var redirect = getQueryString("redirect");
	if(redirect && redirect!=""){
		if(redirect == "register"){
			showRegister();
		}else{
			redirect = delURLArg(decodeURI(redirect), "token");
			$("#downloadApp").show();
		}
	}
	$("#login").on("click", function(){
		app.showLoading();
		var mobile = $("#signin-username").val();
		var password = $("#signin-password").val();
		$.postApi("ins.user.login", {"mobile":mobile, "password":password}, function(res){
			app.hideLoading();
			if(res.errno==0) {
				app.msg("登录成功！");
				app.setUser(res.data);
				if(redirect && redirect!=""){
					location.href = redirect;
				}else{
					//location.href = "index.html?token="+res.data.accessToken;
					location.href = "index.html";
				}
			}else{
				app.msg(res.errmsg);
			}
		});
	});
	
	$("#sendSmsBtn").on("click",function(){
		var mobile = $("#signup-username").val();
		if(isEmpty(mobile)){
			app.msg("手机号不能为空");
			return;
		}else if(!(/^1[0-9]{10}$/.test(mobile))){
			app.msg("手机号格式不正确");
			return;
		}
		$.postApi("ins.user.mobileSms", {"mobile":mobile, "type":1}, function(res){
			app.msg("验证码发送成功");
			var times = 100;
			var smsIntv = window.setInterval(function(){
				if(times > 0){
					$("#sendSmsBtn").val((--times)+"s 后重新发送");
				}else{
					$("#sendSmsBtn").val("获取验证码");
					window.clearInterval(smsIntv);
				}
			},1000);
		});
	});
	
	$("#register").on("click", function(){
		var name = $("#name").val();
		var mobile = $("#signup-username").val();
		var password = $("#signup-password").val();
		var password2 = $("#signup-password2").val();
		var smscode = $("#smscode").val();
		if(isEmpty(name)){
			app.msg("昵称不能为空");
			return;
		}
		if(isEmpty(mobile)){
			app.msg("手机号不能为空");
			return;
		}else if(!(/^1[0-9]{10}$/.test(mobile))){
			app.msg("手机号格式不正确");
			return;
		}
		if(isEmpty(smscode)){
			app.msg("短信验证码不能为空");
			return;
		}
		if(isEmpty(password)){
			app.msg("密码不能为空");
			return;
		}else{
			var reg = new RegExp(/^(?![^a-zA-Z]+$)(?!\D+$)/);
			if (password.length < 6 || password.length > 20) {
				app.msg("密码格式不正确(6~20位字母/数字组合)");
		        return;
		    }
			/*if(!reg.test(password)){
		    	app.msg("密码格式不正确(6~20位字母/数字组合)");
		        return;
		    }*/
			if(password != password2){
				app.msg("两次密码输入不一致");
				return;
			}
		}
		
		app.showLoading();
		$.postApi("ins.user.register", {"name":name, "mobile":mobile, "password":password, "code":smscode, "ruid":ruid}, function(res){
			app.hideLoading();
			if(res.errno==0) {
				app.msg("注册成功,请下载保道APP体验更多服务！");
				app.setUser(res.data);
				if(redirect && redirect!=""){
					if(redirect == "register"){
						hideForm();
						$("#downloadApp").show();
					}else{
						location.href = redirect;
					}
				}else{
					location.href = "index.html";
				}
			}else{
				app.msg(res.errmsg);
			}
		});
	});
});
