import java.util.Date;
import java.util.concurrent.TimeUnit;

public class TimeDifferenceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date startDate = new Date();    // Set start date
		
		// To pause program
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Date endDate = new Date(); 		// Set end date

		long duration  = endDate.getTime() - startDate.getTime();

		long diffInSeconds = TimeUnit.MILLISECONDS.toSeconds(duration);
		long diffInMinutes = TimeUnit.MILLISECONDS.toMinutes(duration);
		long diffInHours = TimeUnit.MILLISECONDS.toHours(duration);
		
		System.out.println("Hour ::: "+diffInHours+" Minutes ::: "+diffInMinutes +" Seconds "+diffInSeconds);
		
	}

}
