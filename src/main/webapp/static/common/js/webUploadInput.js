$(function(){
	$('.webuploader-input').each(function(index){
		var input = $(this);
		var name = input.attr('name');
		var value = input.attr('value');
		var fileName = input.attr('fileName') || '';
		var fileType = input.attr('fileType') || '';
		var fileMime = input.attr('fileMime') || '';
		var uploadUrl = input.attr('uploadUrl') || '';
		var prefixUrl = input.attr('prefixUrl') || '';
		var fileLimit = input.attr('fileLimit') || 1;
		var valueType = input.attr('returnType') || 'path';//path/id
		
		//check
		if(name=='' || fileType=='' || uploadUrl==''){
			console.log("[webuploader-input] error: 'name,fileType,uploadUr' not define.");
			return;
		}
		
		var box = $('<div class="uploader-box wu-example"></div>');
		var $list = $('<div class="uploader-list"></div>');
		var pickerName = '选择'+ (fileType=='image'?'图片':(fileType=='audio'?'音频':'文件'));
		var filePicker = '<div id="filePicker_'+index+'" class="webuploader-container">'+pickerName+'</div>';
		box.append($list).append(filePicker);
		//box.append('<button id="ctlBtn" class="btn btn-default">开始上传</button>');
		input.after(box);
		
		// 优化retina, 在retina下这个值是2
		ratio = window.devicePixelRatio || 1,
		// 缩略图大小
		thumbnailWidth = 100 * ratio,
		thumbnailHeight = 100 * ratio;
		
		var accept = null;
		if(fileType=='image'){
			accept = {
				title: 'Images',
		        extensions: 'gif,jpg,jpeg,bmp,png',
		        mimeTypes: 'image/*'
			};
		}else if(fileType=='audio'){
			accept = {
				title: 'Audios',
		        //extensions: 'gif,jpg,jpeg,bmp,png',
		        mimeTypes: 'audio/*'
			};
		}else if(fileType=='video'){
			accept = {
				title: 'Videos',
		        //extensions: 'gif,jpg,jpeg,bmp,png',
		        mimeTypes: 'video/*'
			};
		}
		
		//初始化Web Uploader
		var uploader = WebUploader.create({
		    // 选完文件后，是否自动上传。
		    auto: true,
		    swf: sys.ctxPath + '/static/content/plugins/webuploader/Uploader.swf',
		    server: uploadUrl,
		    pick: '#filePicker_'+index,
		    fileNumLimit: fileLimit,
		    accept: accept
		});
		// 当文件被加入队列之前触发
		uploader.on('beforeFileQueued', function(file) {
			var curFileNum = $list.children(".file-item").length;
			if(curFileNum >= fileLimit){
				alert("超过上传文件数限制！");
				return false;
			}
			return true;
		});
		// 当有文件添加进来的时候
		uploader.on('fileQueued', function(file) {
			//cailin
			var fileData = file.source.source;
			var itemId = file.id;
	    	if(fileType=='image'){
	    		var $li = $('<div class="file-item" id="' + itemId + '"><div class="thumbnail"><img><div class="info">' + file.name 
	    				+ '</div></div><span class="remove" itemId="'+itemId+'" itemUrl=""></span></div>'),
			    $img = $li.find('img');
	    		$list.append( $li );
	    		
		    	// 创建缩略图
			    uploader.makeThumb( file, function( error, src ) {
			        if ( error ) {
			            $img.replaceWith('<span>不能预览</span>');
			            return;
			        }
			        $img.attr( 'src', src );
			    }, thumbnailWidth, thumbnailHeight );
			    
			    $li.find(".remove").on("click",function(){
			    	$li.off().remove();
			    	uploader.removeFile(file, true);
			    	uploader.reset();
			    });
	    	}else if(fileType=='audio'){
	    		var $li = $('<div class="file-item audio" id="' + itemId 
	    				+ '"><div class="thumbnail"><img></div><span class="remove" itemId="'+itemId+'" itemUrl=""></span></div>'),
			    $img = $li.find('img');
		    	$img.attr('src', sys.ctxPath + '/static/content/plugins/webuploader/images/red-music-logo.jpg');
			    $list.append( $li );
			    
			    $li.find(".remove").on("click",function(){
			    	$li.off().remove();
			    	uploader.removeFile(file, true);
			    	uploader.reset();
			    });
	    	}
	    	
	    	if(fileLimit == 1) {
	    		input.val("");
	    	}else{
	    		var itemId = $(this).attr("itemId");
	    		var itemUrl = $(this).attr("itemUrl");
	    		var vals = input.val().split(',');
	    		vals.remove(itemUrl);
	    		vals.removeAll('');
	    		input.val(vals.toString());
	    	}
		});

		// 文件上传过程中创建进度条实时显示。
		uploader.on( 'uploadProgress', function( file, percentage ) {
		    var $li = $( '#'+file.id ),
		        $percent = $li.find('.progress span');

		    // 避免重复创建
		    if ( !$percent.length ) {
		        $percent = $('<p class="progress"><span></span></p>').appendTo( $li ).find('span');
		    }

		    $percent.css( 'width', percentage * 100 + '%' );
		});

		// 文件上传成功，给item添加成功class, 用样式标记上传成功。
		uploader.on( 'uploadSuccess', function(file, response) {
			var itemId = file.id;
			var $fileItem = $('#'+itemId);
			$fileItem.children(".thumbnail").addClass('upload-state-done');
			if(response.errno==0){
				if(fileType=='audio'){
					$fileItem.children('.remove').attr("itemUrl", response.data.url);
					var val = response.data.path;
					if(valueType == 'id') {
						val = response.data.url;
					}
					var url = prefixUrl + val;
					var audioPanel = $('<div class="audio-panel">'
				    		+'<audio controls="controls">'
							+'<source src="' + url+'" type="'+response.data.mime+'" />'
							+'<embed src="'+url+'" />'
							+'</audio>'
							+'<div class="info">' + response.data.name + '</div></div>');
					$fileItem.append(audioPanel);
					
					if(fileLimit == 1) {
						input.val(val);
					}else{
						var vals = input.val().split(',');
						vals.push(val);
						vals.removeAll('');
						input.val(vals.toString());
					}
				}else{
					$fileItem.children('.remove').attr("itemUrl", response.data.path);
					var val = response.data.path;
					if(fileLimit == 1) {
						input.val(val);
					}else{
						var vals = input.val().split(',');
						vals.push(val);
						vals.removeAll('');
						input.val(vals.toString());
					}
				}
				
			}else{
				$fileItem.off().remove();
				uploader.removeFile(file, true);
		    	uploader.reset();
				alert(response.errmsg);
			}
		});

		// 文件上传失败，现实上传出错。
		uploader.on( 'uploadError', function( file ) {
		    var $li = $( '#'+file.id ),
		        $error = $li.find('div.error');

		    // 避免重复创建
		    if ( !$error.length ) {
		        $error = $('<div class="error"></div>').appendTo( $li );
		    }

		    $error.text('上传失败');
		});
		// 完成上传完了，成功或者失败，先删除进度条。
		uploader.on( 'uploadComplete', function( file ) {
		    $( '#'+file.id ).find('.progress').remove();
		});
		
		uploader.on('ready', function() {
			if(value!=''){
				if(fileType=='image'){
					var fnames = fileName.split(',');
					var urls = value.split(",");
					for (var i = 0; i < urls.length; i++) {
						if(urls[i] != ''){
							var newUrl = prefixUrl + urls[i];
							var fname = fnames[i] || fnames[0];
							
							var itemId = new Date().getTime();
							var $li = $('<div class="file-item" id="' + itemId + '"><div class="thumbnail"><img src="'+newUrl+'"><div class="info">' 
									+ fname + '</div></div><span class="remove" itemId="' + itemId + '" itemUrl="'+urls[i]+'"></span></div>');
							$li.find(".remove").on("click",function(){
								var itemId = $(this).attr("itemId");
								var itemUrl = $(this).attr("itemUrl");
								//$(this).off();
								$("#"+itemId).remove();
								if(fileLimit == 1) {
						    		input.val("");
						    	}else{
						    		var vals = input.val().split(',');
						    		vals.remove(itemUrl);
						    		vals.removeAll('');
						    		input.val(vals.toString());
						    	}
							});
							$list.append($li);
						}
					}
				}else if(fileType=='audio'){
					var urls = value.split(",");
					var fnames = fileName.split(',');
					var fmimes = fileMime.split(',');
					console.log('fileMime = '+fileMime);
					
					for (var i = 0; i < urls.length; i++) {
						if(urls[i] != ''){
							var mType = fmimes[i];
							if(mType && mType!=''){
								mType = ' type="'+mType+'"';
							}
							var url = prefixUrl + urls[i];
							var audioPanel = '<div class="audio-panel">'
								+'<audio controls="controls">'
								+'<source src="'+url+'"'+mType+' />'
								+'<embed src="'+url+'"'+mType+' />'
								+'</audio>'
								+'<div class="info">' + fnames[i] + '</div></div>';
							var itemId = new Date().getTime();
							var $li = $('<div class="file-item audio" id="' + itemId + '"><div class="thumbnail"><img src="' 
									+ sys.ctxPath + '/static/content/plugins/webuploader/images/red-music-logo.jpg"/></div>'
									+ '<span class="remove" itemId="'+itemId+'" itemUrl="' + urls[i] + '"></span>'
									+ audioPanel + '</div>');
							$li.find(".remove").on("click",function(){
								var itemId = $(this).attr("itemId");
								var itemUrl = $(this).attr("itemUrl");
								$("#"+itemId).remove();
								if(fileLimit == 1) {
						    		input.val("");
						    	}else{
						    		var vals = input.val().split(',');
						    		vals.remove(itemUrl);
						    		vals.removeAll('');
						    		input.val(vals.toString());
						    	}
							});
							$list.append( $li );
							//var hexColor = $li.find("audio").getBorderColor();
							//$li.find('.audio-panel').css("background-clor", hexColor);
						}
					}
				}
			}
		});
	});

	$.fn.getBackgroundColor = function() {
	    var rgb = $(this).css('background-color');
	    if(rgb >= 0){
	    	return rgb;//如果是一个hex值则直接返回
	    }else{
	        rgb = rgb.match(/^rgb\((\d+),\s*(\d+),\s*(\d+)\)$/);//"rgb(0, 0, 0)"
	        function hex(x) {
				return ("0" + parseInt(x).toString(16)).slice(-2);
			}
			rgb= "#" + hex(rgb[1]) + hex(rgb[2]) + hex(rgb[3]);
	    }
	    return rgb;
	}
	$.fn.getBorderColor = function() {
		var rgb = $(this).css('border-top-color');
		if(rgb >= 0){
			return rgb;//如果是一个hex值则直接返回
		}else{
			rgb = rgb.match(/^rgb\((\d+),\s*(\d+),\s*(\d+)\)$/);//"rgb(0, 0, 0)"
			function hex(x) {
				return ("0" + parseInt(x).toString(16)).slice(-2);
			}
			rgb= "#" + hex(rgb[1]) + hex(rgb[2]) + hex(rgb[3]);
		}
		return rgb;
	}
});