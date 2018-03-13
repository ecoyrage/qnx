package com.fh.common.constants;

public enum MediaOwnerType {
	baseGoods(1), news(2), article(3), answer(4);
	private int type;
	private MediaOwnerType(int type) {
		this.type = type;
	}
	public int intValue() {
		return this.type;
	}

}
