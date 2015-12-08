package com.java2novice.date;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

public class LongToDate {

	@Test
	public void dateToLong() throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String date = "2011-09-20 12:30:45";
		long timeStart = sdf.parse(date).getTime();
		System.out.println("dateToLong:" + date + "->" + timeStart);
	}

	@Test
	public void longToDate() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		long timeStart = 1449629455968L;
		Date date = new Date(timeStart);
		System.out.println("longToDate:" + timeStart + "->" + sdf.format(date));
	}
}