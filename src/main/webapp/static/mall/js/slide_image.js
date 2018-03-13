function SlideImage(panel, images, links, height)
{
	this.screenWidth = document.body.clientWidth ? document.body.clientWidth : window.screen.width;

	this.width = Math.max(this.screenWidth, 260) - 0;
	this.height   = height ? height : 260;

	this.panel  = panel;
	this.images = images;
	this.links  = links;
	
	this.imageUl   = null;
	this.statusBar = null;


	this.panel.style.position = 'relative';

	var imageFrame = document.createElement('div');
	imageFrame.className = "bcz-slider-cont"; 
	imageFrame.style.width  = this.width + 'px';
	imageFrame.style.height = this.height + 'px';
	this.panel.appendChild(imageFrame);
	this.buildImageFrame(imageFrame, images);

	// var gap = document.createElement('div');
	// gap.style.height = '10px';
	// gap.innerHTML = ' ';
	// this.panel.appendChild(gap);

	var statusBarFrame = document.createElement('div');
	statusBarFrame.className = 'bcz-slider';
	this.buildStatusBar(statusBarFrame, images);
	this.panel.appendChild(statusBarFrame);

	this.buildEvent(panel, images);
};
SlideImage.prototype.buildImageFrame = function (frame, images)
{
	var ul = document.createElement('ul');
	ul.id = 'uu';
	ul.className = "bcz-slct-ul";
	frame.appendChild(ul);
	this.imageUl = ul;

	for (var i = 0; images != null && i < images.length; i++)
	{
		var image = images[i];
		var link  = this.links && this.links[i] ? this.links[i] : null;
		var li = document.createElement('li');
		li.style.width = this.width + 'px';
		li.l = '1';
		ul.appendChild(li);

		var img = document.createElement('img');
		img.style['max-width'] = this.width + 'px';
		img.style['max-height'] = this.height + 'px';
		img.src = image;
		if (link)
		{
			img.link = link;
			img.onclick = function () {window.location.href = this.link;}
		}
		li.appendChild(img);
		// 根据图片实际内容，调整frame的高度
		img.onload = function () {if (this.clientHeight) frame.style.height = this.clientHeight + 'px';}
	}
};
SlideImage.prototype.buildStatusBar = function (frame, images)
{
	var bar = document.createElement('div');
	bar.id = "slideStatusBar";
	bar.className = "bcz-slider-status";
	frame.appendChild(bar);
	this.statusBar = bar;
	if (images.length <= 1)
	{
		bar.style.display = 'none';
	}

	for (var i = 0; images != null && i < images.length; i++)
	{
		var ii = document.createElement('i');
		ii.className = i == 0 ? 'sel' : '';
		bar.appendChild(ii);
	}

};
SlideImage.prototype.buildEvent = function (frame, images)
{
	var self = this;
	this._touchEvent = {
		'startPnt'	 : null, 
		'offset'	   : 0, 
		'alreadyMoved' : 0, 
		'size'		 : self.width, 
		'count'		: images.length, 
		'limit'		: {'min' : -self.width * (images.length - 1), 'max' : 0},
		'moveToPos'	: function (pos)
		{
			if (pos >= self._touchEvent.limit.max) pos = self._touchEvent.limit.max;
			if (pos <= self._touchEvent.limit.min) pos = self._touchEvent.limit.min;
			
			var value = 'translate3d(' +pos+ 'px, 0px, 0px)';
			self.imageUl.style.WebkitTransform = value;	 // Safari and Chrome
			self.imageUl.style.transform       = value;
			self.imageUl.style.OTransform      = value;	 // Opera
			self.imageUl.style.msTransform     = value;	 // IE 9
			self.imageUl.style.MozTransform    = value;	 // Firefox
			return pos;
		}
	};

//	console.info(self._touchEvent.limit);
	
	frame.addEventListener('touchstart', function (e)
	{
		var pt = e.touches[0];
		self._touchEvent.startPnt = {'clientX' : pt.clientX, 'clientY' : pt.clientY};
	});
	frame.addEventListener('touchmove', function (e)
	{
		if (!self._touchEvent.startPnt) return;
		// e.preventDefault();
		var pt = e.touches[0];
		self._touchEvent.offset = (pt.clientX - self._touchEvent.startPnt.clientX) * 2;
		var diff = self._touchEvent.alreadyMoved + self._touchEvent.offset;
		self._touchEvent.moveToPos(diff);
		
		var yDis = Math.abs(pt.clientY - self._touchEvent.startPnt.clientY);
		var xDis = Math.abs(pt.clientX - self._touchEvent.startPnt.clientX);
		e.returnValue = (yDis > xDis && yDis > 4);
		if (e.returnValue)
		{
			finalMove(e);
		}
	});
	var finalMove = function (e)
	{
		var target = self._touchEvent.alreadyMoved;
		if (Math.abs(self._touchEvent.offset) > 20)
		{
			target += (self._touchEvent.offset >= 0 ? self._touchEvent.size : -self._touchEvent.size);
		}
		target = self._touchEvent.moveToPos(target);
		self._touchEvent.alreadyMoved = target;
		var idx = Math.abs(target / self._touchEvent.size);
		var cs = self.statusBar.childNodes;
		for (var i = 0, cursor = 0; i < cs.length; i++)
		{
			var c = cs[i];
			if (c.tagName && c.tagName.toLowerCase() == 'i')
			{
				c.className = cursor == idx ? 'sel' : '';
				cursor++;
			}
		}
	};
	frame.addEventListener('touchend', finalMove);
};
