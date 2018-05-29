package code_Optimisation;
import java.util.logging.Logger;
 
class Demo {
	
	public static void main() {
		Logger l = Logger.getLogger(Person.class.getName());		
		l.info("Helloooooooooooooooo...................");
	}
	
}

class Person {
	
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}