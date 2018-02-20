import java.util.Comparator;

public class Player implements Comparator {

	private int rank;
	private String name;
	private int age;
	
	public Player() {
		super();
	}

	public Player(int rank, String name, int age) {
		super();
		this.rank = rank;
		this.name = name;
		this.age = age;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return this.rank+"-"+this.name+"-"+this.age;
	}
	
	@Override
	public int compare(Object o1, Object o2) {
		
		Player p1=(Player)o1;
		Player p2=(Player)o2;
	
		return p2.getRank()-p1.getRank();
	}
	
	
	
}
