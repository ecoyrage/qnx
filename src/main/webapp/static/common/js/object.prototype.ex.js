Array.prototype.indexOf = function(val) {
	for (var i = 0; i < this.length; i++) {
		if (this[i] == val)
			return i;
	}
	return -1;
};

Array.prototype.remove = function(val) {
	var index = this.indexOf(val);
	if (index > -1) {
		this.splice(index, 1);
	}
	return this;
};
Array.prototype.removeAll = function(val) {
	var index = this.indexOf(val);
	if (index > -1) {
		this.splice(index, 1);
		return this.removeAll(val);
	}else{
		return this;
	}
};
Array.prototype.replace = function(val, newVal) {
	var index = this.indexOf(val);
	if (index > -1) {
		this.splice(index, 1, newVal);
	}
	return this;
};
Array.prototype.replaceAll = function(val, newVal) {
	var index = this.indexOf(val);
	if (index > -1) {
		this.splice(index, 1, newVal);
		return this.replaceAll(this, newVal);//迭代
	}else{
		return this;
	}
};