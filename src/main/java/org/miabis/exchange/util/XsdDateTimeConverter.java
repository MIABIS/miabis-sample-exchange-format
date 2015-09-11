package org.miabis.exchange.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * This class handles the marshalling and unmarshalling of dates from the xsd schema.
 * @author jvillaveces
 *
 */
public class XsdDateTimeConverter {
	
	/**
	 * Returns the LocalDateTime representation for the given input string
	 * @param dateTime a date fromatted as a string
	 * @return	the LocalDateTime
	 */
    public static LocalDateTime unmarshal(String dateTime) {
    	DateTimeFormatter format = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
    	return LocalDateTime.parse(dateTime, format);
    }

    /**
	 * Returns the LocalDateTime representation of the given input string.
	 * This method does not return the time and as such its usage is discouraged
	 * @param dateTime a date fromatted as a string
	 * @return	the LocalDateTime
	 */
    public static String marshalDate(LocalDateTime date) {
    	return date.format(DateTimeFormatter.ISO_LOCAL_DATE);
    }

    /**
     * Returns a String representation of the given input LocalDateTime.
     * @param dateTime The LocalDateTime to transform to string
     * @return	The string representing the given LocalDateTime
     */
    public static String marshalDateTime(LocalDateTime dateTime) {
    	return dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
    }

}