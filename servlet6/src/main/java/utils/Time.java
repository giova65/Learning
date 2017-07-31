package utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Time {

	private static final String PATTERN = "dd.MM.yyyy";
	private final Date _time;

	public Time(String time) {
		try {
			SimpleDateFormat format = new SimpleDateFormat(PATTERN);
			format.setLenient(false);
			_time = format.parse(time);
		} catch (ParseException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public String toString() {
		return new SimpleDateFormat(PATTERN).format(_time);
	}
}
