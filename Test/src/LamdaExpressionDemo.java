import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LamdaExpressionDemo {

public static void main(String[] args) {
	
	List<Player> playerList=new ArrayList<>();
	
	Player p1=new Player(24,"Ganesh",25);
	Player p2=new Player(34,"Kartik",19);	
	Player p3=new Player(14,"Ashish",17);
	
	playerList.add(p1);
	playerList.add(p2);
	playerList.add(p3);
	
//	System.out.println("Before Sort ::::: "+playerList);
	
	// Only 1 method will be declared like run(), and forEach and
	// sort method of Collections class to overloaded compare method
	playerList.forEach(player -> System.out.println("Before Sort ::::: "+player) );
	
	
//	Collections.sort(playerList,new Player());
	
	Collections.sort(playerList,
			
			(player1, player2) ->
			player1.getRank()-player2.getRank()
			
			);
	
	System.out.println("After Sort ::::: "+playerList);

	
}

	
}
