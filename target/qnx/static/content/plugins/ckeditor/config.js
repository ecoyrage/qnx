/**
 * @license Copyright (c) 2003-2017, CKSource - Frederico Knabben. All rights reserved.
 * For licensing, see LICENSE.md or http://ckeditor.com/license
 */

/*CKEDITOR.editorConfig = function( config ) {
	// Define changes to default configuration here. For example:
	// config.language = 'fr';
	// config.uiColor = '#AADC6E';
};*/

CKEDITOR.editorConfig = function( config ) {
	config.toolbarGroups = [
		{ name: 'clipboard', groups: [ 'clipboard', 'undo' ] },
		{ name: 'tools', groups: [ 'tools' ] },
		{ name: 'paragraph', groups: [ 'align', 'list', 'indent', 'blocks', 'bidi', 'paragraph' ] },
		{ name: 'document', groups: [ 'doctools', 'mode', 'document' ] },
		'/',
		{ name: 'basicstyles', groups: [ 'basicstyles', 'cleanup' ] },
		{ name: 'links', groups: [ 'links' ] },
		{ name: 'insert', groups: [ 'insert' ] },
		'/',
		{ name: 'styles', groups: [ 'styles' ] },
		{ name: 'colors', groups: [ 'colors' ] },
		{ name: 'others', groups: [ 'others' ] },
		{ name: 'forms', groups: [ 'forms' ] },
		{ name: 'editing', groups: [ 'find', 'selection', 'spellchecker', 'editing' ] },
		{ name: 'about', groups: [ 'about' ] }
	];
	
	config.removeButtons = 'NewPage,Templates,Save,Cut,Copy,Paste,PasteText,PasteFromWord,Find,Replace,SelectAll,Scayt,About,PageBreak,Language,Print,Iframe,BidiLtr,BidiRtl,Undo,Redo,SpecialChar,Form,Checkbox,Radio,TextField,Textarea,Select,Button,ImageButton,HiddenField';
	
	config.font_names = '宋体/SimSun;新宋体/NSimSun;仿宋/FangSong;楷体/KaiTi;微软雅黑/Microsoft YaHei;微软正黑/Microsoft JhengHei;仿宋_GB2312/FangSong_GB2312;'+  
    '楷体_GB2312/KaiTi_GB2312;黑体/SimHei;华文细黑/STXihei;华文楷体/STKaiti;华文宋体/STSong;华文中宋/STZhongsong;'+  
    '华文仿宋/STFangsong;华文彩云/STCaiyun;华文琥珀/STHupo;华文隶书/STLiti;华文行楷/STXingkai;华文新魏/STXinwei;'+  
    '方正舒体/FZShuTi;方正姚体/FZYaoti;细明体/MingLiU;新细明体/PMingLiU;'+  
    'Arial Black/Arial Black;'+ config.font_names;
	
	//工具栏是否可以被收缩
	config.toolbarCanCollapse = true;
	//工具栏默认是否展开
    config.toolbarStartupExpanded = true;
    //预览区域显示内容
    config.image_previewText=' ';
    //图片上传的action或servlet
    config.filebrowserImageUploadUrl= "/ins/admin/upload/image?ckeditor=1&callback=CKEDITOR.tools.callFunction";

};