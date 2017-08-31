package utils;

import java.util.Date;

import org.apache.commons.lang.time.DateFormatUtils;

public class DateUtils {

	public static String getToday() {
		String today = DateFormatUtils.format(new Date(), "yyyy-MM-dd");

		return today;
	}

}
