package utils;

import java.io.FileOutputStream;
import java.util.Calendar;


/**
 * This class is used to deal with logging operation
 * @author Kuldeep Saxena
 *
 */
public class Logger {

	
	/**
	 * default accessor object
	 */
	private static final Logger logger = new Logger ();
	
	/**
	 * output stream
	 */
	private FileOutputStream out;
	
	/**
	 * default constructor
	 * initializes output stream
	 *
	 */
	private Logger ()
	{
		
		try
		{
			Calendar c = Calendar.getInstance();
			out = new FileOutputStream ("logs/" + c.get(Calendar.DAY_OF_MONTH) + "_" + c.get(Calendar.MONTH) + "_" + c.get(Calendar.YEAR) + "-" + c.get(Calendar.HOUR) + "_" + c.get(Calendar.MINUTE) +  "_" + c.get(Calendar.SECOND) + ".log");
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * default accessor method
	 * @return object of this class
	 */
	public static Logger getDefaultInstance ()
	{
		return logger;
	}
	
	/**
	 * write message to the output stream
	 * @param message message to be written
	 */
	public void writeLog (String message)
	{
		try
		{
			out.write(message.getBytes());
			out.write("\n".getBytes());
		}
		catch (Exception e)
		{
			
		}
	}
}
