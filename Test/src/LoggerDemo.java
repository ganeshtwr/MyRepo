import org.apache.log4j.DailyRollingFileAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;

public class LoggerDemo {

	public static Logger logger=Logger.getLogger(LoggerDemo.class);
	
	 public static void main(String[] args) {
		 
	        // creates pattern layout
	        PatternLayout layout = new PatternLayout();
	        String conversionPattern = "%d{yyyy-MM-dd HH:mm:ss} [%thread] %-5level %logger{36} - %msg%n";
	        layout.setConversionPattern(conversionPattern);
	 
	        // creates daily rolling file appender
	        DailyRollingFileAppender rollingAppender = new DailyRollingFileAppender();
	        rollingAppender.setFile("/home/ganesh/logger.log");
	        rollingAppender.setDatePattern("'-'yyyy-MM-dd");
	        rollingAppender.setLayout(layout);
	        rollingAppender.activateOptions();
	 
	        // configures the root logger
	        logger.setLevel(Level.DEBUG);
	        logger.addAppender(rollingAppender);
	 
	        // creates a custom logger and log messages	
	        
	        logger.debug("Wait for tomorrow to view new logger file in /home/ganesh/ "
	        		+ "location because current file is created and it does not display time"
	        		+ " on file current log file. It only shows date with previous file. ");
	        
	        logger.debug("this is a debug log message");
	        logger.info("this is a information log message");
	        logger.warn("this is a warning log message");
	 
	    }

}
