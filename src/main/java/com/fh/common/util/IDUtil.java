package com.fh.common.util;

import java.util.UUID;

public class IDUtil {
	
	private static final String ABCabc123 = "ABCDEFGHJKLMNPQRSTUVWXYZabcdefghjklmnpqrstuvwxyz0123456789";
	private static final String ABCabc123_ = "ABCDEFGHJKLMNPQRSTUVWXYZabcdefghjklmnpqrstuvwxyz0123456789_";


	public static String genUUID() {
		return UUID.randomUUID().toString();
	}

	private static StringBuffer[] digits = { new StringBuffer("0"),
			new StringBuffer("1"), new StringBuffer("2"),
			new StringBuffer("3"), new StringBuffer("4"),
			new StringBuffer("5"), new StringBuffer("6"),
			new StringBuffer("7"), new StringBuffer("8"), new StringBuffer("9") };

	private static StringBuffer randomDigit(boolean isZeroOK) {
		int index;
		if (isZeroOK) {
			index = (int) Math.floor(Math.random() * 10);
		} else {
			index = 1 + (int) Math.floor(Math.random() * 9);
		}
		return (digits[index]);
	}

	public static String random(int numDigits) {
		StringBuffer s = new StringBuffer("");
		for (int i = 0; i < numDigits; i++) {
			if (i == 0) {
				// First digit must be non-zero.
				s.append(randomDigit(false));
			} else {
				s.append(randomDigit(true));
			}
		}
		return s.toString();
	}

}
