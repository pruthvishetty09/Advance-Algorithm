import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
public class Sortedvalues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create and initialize Map
		 Map<Integer, String> map = new HashMap<>();
		 map.put(3, "Cherry");
		 map.put(1, "Apple");
		 map.put(4, "Date");
		 map.put(2, "Banana");
		 // Sort the map by keys in ascending order using TreeMap
		 Map<Integer, String> sortedMap = new TreeMap<>(map);
		 
		 
		 Set<Entry<Integer, String>> s= sortedMap.entrySet();
		 // Display the sorted Map elements using normal for-each loop
		 for (Entry<Integer, String> entry : s) {
		 
		 System.out.println(entry.getKey()+" : "+ entry.getValue());
		 
		 }
		 }
}