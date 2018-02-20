package util;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Properties;

import com.zaxxer.hikari.HikariDataSource;

public class DBUtil {

	private static final String DB_USERNAME="db.username";
	private static final String DB_PASSWORD="db.password";
	private static final String DB_URL="db.url";
	private static final String DB_DRIVER="driver.class.name";
	
	private static Properties properties=null;
	private static HikariDataSource dataSource=null;
	
	static{
		
		try{
			
			properties=new Properties();
			properties.load(new FileInputStream("src/db.properties"));
			
			dataSource=new HikariDataSource();
			
			dataSource.setDriverClassName(properties.getProperty(DB_DRIVER));			
			dataSource.setJdbcUrl(properties.getProperty(DB_URL));
			dataSource.setUsername(properties.getProperty(DB_USERNAME));
			dataSource.setPassword(properties.getProperty(DB_PASSWORD));
			
			dataSource.setMinimumIdle(100);
			dataSource.setMaximumPoolSize(10000);
			
			dataSource.setAutoCommit(false);
			dataSource.setLoginTimeout(3);
			
		}catch (IOException | SQLException e) {
				e.printStackTrace();	
		}
		
	}
	
	public static HikariDataSource getDataSource() {
		return dataSource;
	}
	
}
