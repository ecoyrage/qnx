package com.fh.common.constants;

public enum FileType {
	image(1), audio(2), video(3), word(4), excel(5);
	private int type;
	private FileType(int type) {
		this.type = type;
	}
	public int intValue() {
		return this.type;
	}
	@Override
	public String toString() {
		//return this.name();
		return super.toString();
	}
}
