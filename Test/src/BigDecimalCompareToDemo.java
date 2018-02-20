
	import java.math.*;

	public class BigDecimalCompareToDemo {

	   public static void main(String[] args) {

	      // create 2 BigDecimal objects
	      BigDecimal bg1, bg2;

	      bg1 = new BigDecimal("-12");
	      bg2 = new BigDecimal("0");

	      //create int object
	      int res;

	      res = bg1.compareTo(bg2); // compare bg1 with bg2
	      
	      if(bg1.compareTo(bg2) < 0)
	    	  System.out.println(" Result 1 :::: "+res);
	    	  
	      bg1 = new BigDecimal("0");
	      bg2 = new BigDecimal("0");
	      
	      res = bg1.compareTo(bg2); // compare bg1 with bg2
	      
	      if(bg1.compareTo(bg2) < 0)
	    	  System.out.println(" Result 2 :::: "+res);
	      
	      bg1 = new BigDecimal("1");
	      bg2 = new BigDecimal("0");
	      
	      res = bg1.compareTo(bg2); // compare bg1 with bg2
	      
	      if(bg1.compareTo(bg2) < 0)
	    	  System.out.println(" Result 3 :::: "+res);
	      
	      
	   }
	}