import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorJava7 {

public static void main(String[] args) {
	
	List<Player> playerList=new ArrayList<>();
	
	Player p1=new Player(24,"Ganesh",25);
	Player p2=new Player(34,"Ankit",19);	
	Player p3=new Player(14,"Ashish",17);
	
	playerList.add(p1);
	playerList.add(p2);
	playerList.add(p3);
	
	System.out.println("Beofre Sort ::::: "+playerList);
	
	Collections.sort(playerList,new Player());
	
	System.out.println("After Sort ::::: "+playerList);

	
}

	
}
