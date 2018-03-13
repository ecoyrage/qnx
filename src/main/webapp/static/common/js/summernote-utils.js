$(function(){
	$('div.summernote').each(function() {
		var $this = $(this);
		var placeholder = $this.attr("placeholder") || '';
		var url = $this.attr("uploadUrl") || '';
		var prefixUrl = $this.attr('prefixUrl') || '';
	    //
		$this.summernote({
			lang: 'zh-CN',
			height: 200,
			minHeight: null,
			maxHeight: null,
			focus: false,//打开页面后焦点定位到编辑器中
			/*toolbar: [    
		          ['style', ['bold', 'italic', 'underline', 'clear']],
		          ['font', ['strikethrough', 'superscript', 'subscript']],
		          ['fontsize', ['fontsize']], // 有字号，但是默认没有显示
		          ['color', ['color']],
		          ['para', ['ul', 'ol', 'paragraph']],
		          ['height', ['height']]
			],*/
			placeholder: placeholder,
			callbacks: {
			    onImageUpload: function(files) {
					// upload image to server and create imgNode...
					//$summernote.summernote('insertNode', imgNode);
			      	
					// onImageUpload的参数为files，summernote支持选择多张图片
					var $files = $(files);
					// 通过each方法遍历每一个file
					$files.each(function() {
						var file = this;
						// FormData，新的form表单封装，具体可百度，但其实用法很简单，如下
						var data = new FormData();
						// 将文件加入到file中，后端可获得到参数名为“file”
						data.append("file", file);
						// ajax上传
						$.ajax({
							data : data,
							type : "POST",
							url : url,// div上的uploadUrl
							cache : false,
							contentType : false,
							processData : false,
							// 成功时调用方法，后端返回json数据
							success : function(response) {
								// 封装的eval方法，可百度
								var json = JSON.parse(response);
								// 控制台输出返回数据
								console.log(json);
								if(json.errno==0){
									var imageUrl = prefixUrl + json.data.url;
									//方式2：nginx跳转
									//var imageUrl = prefixUrl + json.data.path;
									// http://www.x.com/ins/imageFile/2017/0814/image_jpeg/1502680545576001.jpg
									// 插入到summernote
									$this.summernote('insertImage', imageUrl, function($image) {
										// todo，后续可以对image对象增加新的css式样等等，这里默认
										//$image.css('width', $image.width() / 3);
										$image.attr('style', 'width:100%;');
									});
								}else{
									alert(json.errmsg);
								}
							},
							// ajax请求失败时处理
							error : function(){
								console.log('--error--');
							}
						});
					});
			    }
			  }
		});
	});
	
});