package network;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.*;

public class Utils {
	
	public static String getCurrentTime()
	{
		Date date = new Date();
		return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);
	}
	
//	private static Logger logger = Logger.getLogger(Utils.class);
	public static void log(String s)
	{
		logImpl(s);
	}
	
	public static void log(int b)
	{
		logImpl(b + "");
	}
	
	public static void log(boolean b)
	{
		logImpl(b ? "true" : "false");
	}
	
	public static void warn(String s)
	{
		System.out.println(getCurrentTime() + "[WARN] " + s);
//		logger.debug(s);
	}
	
	public static void error(String s)
	{
		System.err.println(getCurrentTime() + "[ERROR] " + s);
//		logger.error(s);
	}
	
	/////////////////////////////////////
	private static void logImpl(String s)
	{
		System.out.println(getCurrentTime() + "[INFO] " + s);
//		logger.info(s);
	}
}
