package com.fedex.soapsamples.util;

import org.apache.axis.encoding.SerializationContext;
import org.apache.axis.encoding.ser.CalendarSerializer;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


/**
 * Custom Serializer for dateTime (Calendar).
 *
 */
public class CustomCalendarSerializer extends CalendarSerializer {

    private static SimpleDateFormat zulu =
        new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
  
    public String getValueAsString(Object value, SerializationContext context) {
        Date date = value instanceof Date ? (Date) value : ((Calendar) value).getTime();
        // Serialize to String
        synchronized (zulu) {
        	// SimpleDateFormat returns offset in hhmm format
        	// change it to return in hh:mm format
        	return zulu.format(date).replaceAll("(\\d\\d)$", ":$1");
        }
    }
}
