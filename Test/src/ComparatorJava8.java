import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorJava8 {

public static void main(String[] args) {
	
	List<Player> playerList=new ArrayList<>();
	
	Player p1=new Player(24,"Ganesh",25);
	Player p2=new Player(34,"Ankit",19);	
	Player p3=new Player(14,"Ashish",17);
	
	playerList.add(p1);
	playerList.add(p2);
	playerList.add(p3);
	
	System.out.println("Beofre Sort ::::: "+playerList);
	
	//Lamda Expressions
	
	Comparator<Player> byRank=(Player player1, Player player2) -> player1.getRank()-player2.getRank();
	Comparator<Player> byAge=(Player player1, Player player2) -> player1.getAge()-player2.getAge();
		
	/************************ OR ************************/
	
	Comparator<Player> byRanking=Comparator.comparing(Player::getRank);
	Comparator<Player> byAging=Comparator.comparing(Player::getAge);

	Collections.sort(playerList,byRank);
	System.out.println("After Sort by Rank ::::: "+playerList);

	Collections.sort(playerList,byAge);
	System.out.println("After Sort by Age ::::: "+playerList);

}	
}
