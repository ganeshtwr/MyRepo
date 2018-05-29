import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) throws ParseException {
		
//		String datePattern = "yyyy.MM.dd";
//	    Date today;
//	    String dateOutput;
//	    SimpleDateFormat simpleDateFormat;
//	    simpleDateFormat = new SimpleDateFormat(datePattern);
//	    today = new Date();
//	    dateOutput = simpleDateFormat.format(today);
//	    System.out.println(datePattern + " - " + dateOutput);

	    
	    SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy.MM.dd");
	    Date today = new Date();
	    String dateOutput = simpleDateFormat.format(today);
	    System.out.println("Output - " + dateOutput);
	}

}
