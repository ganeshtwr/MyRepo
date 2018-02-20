import java.text.NumberFormat;

public class CurrencyConversionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    double d = 1.999e-4;
	    String d2 ="1.0E-6";
	    NumberFormat nf = NumberFormat.getInstance();
	    nf.setMinimumFractionDigits(8);
	    System.out.println("Example ::: "+nf.format(d));
	    System.out.println(" INR TO BTC :::: "+nf.format(Double.parseDouble(d2)));
		
	}

}
