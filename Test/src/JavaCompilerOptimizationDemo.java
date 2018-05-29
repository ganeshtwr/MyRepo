
public class JavaCompilerOptimizationDemo {

	public static void main(String[] args) {

		System.out.println(T.X); 
		System.out.println(P.Y); 
		
	}

}

class T {
	
	public static int X=100;
	// And a class is loaded only once at a time.
	// It means If I take another static variable then it wont execute this static block again 
	static{
		System.out.println("T class is loaded.");
	}
	
}

class P	{

	// See the byte code of this program 
	// compiler has already binded Y at the time of compilation because of final keyword.
	
	public static final int Y=200;
	
	static{
		System.out.println("P class is loaded.");
	}

}