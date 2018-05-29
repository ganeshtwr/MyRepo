
interface Fruit{
	// By default variables and method of a class is public and static  
	String TYPE="Type";
}

class Apple implements Fruit {
}

class Mango implements Fruit {	
	// Remove static keyword from here and see what happens
	public static String TYPE="Mango";
}




public class InheritanceDemo {

	public static void main(String[] args) {

		System.out.println(Apple.TYPE);
		System.out.println(Mango.TYPE);
		
	}

}
