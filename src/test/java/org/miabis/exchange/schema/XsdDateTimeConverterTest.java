package org.miabis.exchange.schema;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.time.LocalDateTime;

import org.junit.Test;
import org.miabis.exchange.util.XsdDateTimeConverter;

public class XsdDateTimeConverterTest {
	
	@Test
	public void shouldBeEqual(){
		LocalDateTime now = LocalDateTime.now();
		String nowStr = XsdDateTimeConverter.marshalDateTime(now);
		assertEquals(now, XsdDateTimeConverter.unmarshal(nowStr));
	}
	
	@Test
	public void shouldUnmarshal(){
		String dateStr = "2004-06-10T14:22:00";
		
		LocalDateTime date = XsdDateTimeConverter.unmarshal(dateStr);
		assertNotNull(date);
		
		assertEquals(dateStr, XsdDateTimeConverter.marshalDateTime(date));
	}

}
