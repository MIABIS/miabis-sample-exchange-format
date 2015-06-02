package org.miabis.exchange.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class XsdDateTimeConverter {

    public static LocalDateTime unmarshal(String dateTime) {
    	
    	DateTimeFormatter format = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
    	return LocalDateTime.parse(dateTime, format);
    }

    public static String marshalDate(LocalDateTime date) {
    	return date.format(DateTimeFormatter.ISO_LOCAL_DATE);
    }

    public static String marshalDateTime(LocalDateTime dateTime) {
    	return dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
    }

}