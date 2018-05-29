import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SortingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		https://stackoverflow.com/questions/25371300/sort-list-based-on-priority-from-a-map
		
		
		Map<String, Integer> auto = new HashMap<>();
		auto.put("Audy", 3);
		auto.put("Citroen", 5);
		auto.put("Opel", 10);
		auto.put("BMW", 20);

		List<String> given = new ArrayList<>();
		given.add("Opel");
		given.add("BMW");
		given.add("Citroen");

		// to sort the selected elements.
		given.sort(Comparator.comparing(auto::get));

		// to sort all elements.
		List<String> names = auto.entrySet().stream()
		        .sorted(Comparator.comparing(Map.Entry::getValue))
		        .map(Map.Entry::getKey)
		        .collect(Collectors.toList());
	}

}
