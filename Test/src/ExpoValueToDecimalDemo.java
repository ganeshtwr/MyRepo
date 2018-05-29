
	import java.math.*;

	public class ExpoValueToDecimalDemo {

	   public static void main(String[] args) {

	      // create a BigDecimal object
	      BigDecimal bg;

	      // create a String object
	      String s;

	      MathContext mc = new MathContext(4); // 3 precision

	      bg = new BigDecimal("7.0E-4",mc);

	      BigDecimal bd=new BigDecimal("7.0E-4");
	      
	      System.out.println("Valu of "+bd+" in decimal "+bd.toPlainString());
	      
	      // assign the plain string value of bg to s
	      s = bg.toPlainString();

	      String str = "Plain string value of " + bg + " is " + s;

	      // print s value
	      System.out.println( str );
	   }
	}