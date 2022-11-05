package sec01.verify.exam09;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;

public class MapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		String name = null;
		int maxScore = 0;
		int totalScore = 0;
		
		Set<String> keySet = map.keySet();
		
		Iterator<String> keyIterator = keySet.iterator();
		
		while (keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer score = map.get(key);
			if (score > maxScore) {
				maxScore = score;
				name = key;
			}
			totalScore += score;
		}
		
		System.out.println("Average score : " + (totalScore / map.size()));
		System.out.println("Maximum score : " + maxScore);
		System.out.println("ID which get maximum score : " + name);
	}
}