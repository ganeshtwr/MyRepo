import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimestampDemo {

	public static void main(String[] args) throws ParseException {
		
	
//		Date date=new Date();
//		System.out.println(" Old Time : "+date.getTime());		
//		Date date2=new Date();
//		System.out.println(" New Time : "+date2.getTime());
		
		long oldTime=1510566760815l;
		long newTime=1510567007720l;
		long result=newTime - oldTime;
		System.out.println(" Compared Time : "+result);
		
		System.out.println("Differce is : "+result*24*60*60*1000);
		
//		SimpleDateFormat dateFormat = new SimpleDateFormat(" ss S");
//		Date firstParsedDate = dateFormat.parse(Long.toString(oldTime));
//		Date secondParsedDate = dateFormat.parse(Long.toString(newTime));
//		long diff = secondParsedDate.getTime() - firstParsedDate.getTime();
//
//		System.out.println("Differnce : "+diff);
		
	}

}
