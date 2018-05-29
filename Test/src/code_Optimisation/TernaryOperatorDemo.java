package code_Optimisation;

public class TernaryOperatorDemo {

	public static void main(String[] args) {
		
		int a=2,b=4,max=0;
		
		// Old convention
		if (a > b) {
			  max = a;
			  System.out.println("If Max : "+max);
		}
		else {
			  max = b;
			  System.out.println("Else Max : "+max);
		} 
		
		// New convention
		max = (a > b) ? a : b;
		  System.out.println("In ternary Max : "+max);		
		
	}

}
