package com.fh.common.util;

import java.text.SimpleDateFormat;
import java.util.concurrent.atomic.AtomicInteger;


public class IDUtils {
	private static final AtomicInteger increase = new AtomicInteger();
	private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyyMMddHHmmssSSS");
	private static long lastTimestamp;
	private static final String ABCabc123 = "ABCDEFGHJKLMNPQRSTUVWXYZabcdefghjklmnpqrstuvwxyz0123456789";
	private static final String ABCabc123_ = "ABCDEFGHJKLMNPQRSTUVWXYZabcdefghjklmnpqrstuvwxyz0123456789_";

	private static StringBuffer[] digits = { new StringBuffer("0"),
			new StringBuffer("1"), new StringBuffer("2"),
			new StringBuffer("3"), new StringBuffer("4"),
			new StringBuffer("5"), new StringBuffer("6"),
			new StringBuffer("7"), new StringBuffer("8"), new StringBuffer("9") };

	public static String genSecretKey(int len){
		int index;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < len; i++) {
			index = (int) (Math.random()*(ABCabc123_.length()));
			sb.append(ABCabc123_.charAt(index));
		}
		return sb.toString();
	}

	public static long nextTimestamp(){
		long timestamp = System.currentTimeMillis();
		while (timestamp <= lastTimestamp) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
			}
			timestamp = System.currentTimeMillis();
		}
		lastTimestamp = timestamp;
		return timestamp;
	}
	

	public static synchronized String next() {
		StringBuilder builder = new StringBuilder();
		builder.append(nextTimestamp());
		//循环0000~9999之间的序列数
		builder.append(String.format("%03d", Math.abs(increase.incrementAndGet() % 1000)));
		return builder.toString();
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

	private static StringBuffer randomDigit(boolean isZeroOK) {
		int index;
		if (isZeroOK) {
			index = (int) Math.floor(Math.random() * 10);
		} else {
			index = 1 + (int) Math.floor(Math.random() * 9);
		}
		return (digits[index]);
	}


	
}
