package de.westnordost.osmapi.common;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/** Format used to represent dates within the OSM Api 0.6 (except notes)*/
public class OsmXmlDateFormat
{
	private static final SimpleDateFormat DEFAULT = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssX");
	
	public Date parse(String source) throws ParseException
	{
		return DEFAULT.parse(source);
	}
	
	public String format(Date date)
	{
		return DEFAULT.format(date);
	}
}
