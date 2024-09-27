package sec01.exam06;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
	public static void main(String[] args) {
		// Generate Map Collection
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		// Store object
		map.put("A", 85);
		map.put("B", 90);
		map.put("C", 80);
		map.put("B", 95);
		System.out.println("Total number of entries : " + map.size());
		
		// Find object
		System.out.println("\tB : " + map.get("B"));
		System.out.println();
		
		// Process object one by one
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while (keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println();
		
		// Delete object
		map.remove("B");
		System.out.println("Total number of objects : " + map.size());
		
		// Process object one by one
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		
		while (entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println();
		
		// Delete all objects
		map.clear();
		System.out.println("Total number of objects : " + map.size());
	}
}
