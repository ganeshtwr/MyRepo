package test;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.RollingFileAppender;

public class LoggingSample {

	public static Logger logger=Logger.getLogger(LoggingSample.class);
	
	public static void main(String[] args) {

//		// Layout
		PatternLayout patternLayout=new PatternLayout();
		patternLayout.setConversionPattern("%d - %c - %p - %m%n");
		
//		// RollingFileAppender
		RollingFileAppender rollingFileAppender=new RollingFileAppender();
		rollingFileAppender.setLayout(patternLayout);
		rollingFileAppender.setFile("/home/ganesh/logger.log");
		rollingFileAppender.setMaximumFileSize(2000);
		rollingFileAppender.activateOptions();
		
//		// adding Appender to Logger
		logger.setLevel(Level.INFO);
		logger.addAppender(rollingFileAppender);
				
		
		// Task for Logger
		try {
			
			// File to find 
			
			FileInputStream fileInputStream=new FileInputStream("/home/ganesh/logger.log");
		
			DataInputStream dataInputStream=new DataInputStream(fileInputStream);
		
			BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(dataInputStream));
			
			String str;
			
			try {
				while((str=bufferedReader.readLine())!=null){
					
				System.out.println(str);		
				// If found then see logger file 
				logger.info("File found");
				
				}
				dataInputStream.close();
			} catch (IOException e) {
	
				logger.error("Cant write data in log file");
				e.printStackTrace();
				
				try {
					fileInputStream.close();
					dataInputStream.close();
					bufferedReader.close();
				} catch (IOException io) {
					io.printStackTrace();
				}
			}
		
		} catch (FileNotFoundException e) {
	
			// And if not then see logger file
			logger.warn("This is warning");
			logger.error("File not found",e);
			logger.trace("This msg will not be logged since log");
			e.printStackTrace();
		}	
	}
}
