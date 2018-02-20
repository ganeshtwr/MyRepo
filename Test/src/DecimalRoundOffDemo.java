import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class DecimalRoundOffDemo {

	public static void main(String[] args) {

		double d = 2.34568;
	    DecimalFormat f = new DecimalFormat("##.##");
	    System.out.println(f.format(d));
		
	    System.out.println("Round off value of Double 2.34568 is "+round(d, 4));
	    
	}

	private static double round(double value, int places) {
	    if (places < 0) throw new IllegalArgumentException();
	 
	    BigDecimal bd = new BigDecimal(Double.toString(value));
	    bd = bd.setScale(places, RoundingMode.HALF_DOWN);
	    return bd.doubleValue();
	}
	
}
