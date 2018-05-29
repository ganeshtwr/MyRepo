
public class Test3 {

	public static void main(String[] args) {
		
		// Both objects will be created in SCP and heap area
		String one="Ganesh" ;
		String two="Ganesh" ;
		String three="GAnesh";
		
		if(one == two){
			System.out.println("Have same address");
		}
		else{
			System.out.println("Have not same address");
		}
		
		if(one == three){
			System.out.println("Have same address");
		}
		else{
			System.out.println("Have not same address");
		}
	}

}
