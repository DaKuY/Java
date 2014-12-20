package com.hibernateclass.simpleab.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Logger;

public class StrToDate {
	public static Date convert(String mmHyphenDdHyphenYyyy) {
		final Logger logger = Logger.getLogger(StrToDate.class);
//20141213-001:		SimpleDateFormat sdf = new SimpleDateFormat("M-dd-yyyy hh:mm:ss");
		DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
		Date myDate = null;
		try {
			myDate = dateFormat.parse(mmHyphenDdHyphenYyyy);
			logger.trace("java.util.Date for string mm-dd-yyyy: " + myDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return myDate;	
	}
}
