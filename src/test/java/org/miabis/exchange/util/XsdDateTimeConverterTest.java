package org.miabis.exchange.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeParseException;

import org.junit.Assert;
import org.junit.Test;

public class XsdDateTimeConverterTest {
	
	@Test
	public void marshallAndUnmarshall(){
		String dateStr = "2004-06-10T14:22:00";
		String dateStr2 = XsdDateTimeConverter.marshalDateTime(XsdDateTimeConverter.unmarshal(dateStr));
		Assert.assertEquals(dateStr,dateStr2);
	}
	
	@Test
	public void testMarshallAndUnmarshall(){
		LocalDateTime date = LocalDateTime.now();
		LocalDateTime date2 = XsdDateTimeConverter.unmarshal(XsdDateTimeConverter.marshalDateTime(date));
		Assert.assertEquals(date,date2);
	}
	
	//Should throw exception since date is in wrong format
	@Test(expected=DateTimeParseException.class)
	public void unmarshallWrongDateFormat(){
		String dateStr = "2004-06-10";
		XsdDateTimeConverter.unmarshal(dateStr);
	}
	
}
