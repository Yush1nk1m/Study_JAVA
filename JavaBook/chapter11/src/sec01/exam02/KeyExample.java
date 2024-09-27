package sec01.exam02;

import java.util.HashMap;

public class KeyExample {
	public static void main(String[] args) {
		// Use Key object as primary key and generate HashMap object storing String value
		HashMap<Key, String> hashMap = new HashMap<Key, String>();	
		
		// Store "VALUE" as primary key new Key(1)
		hashMap.put(new Key(1), "VALUE");
		
		// Read "VALUE" using primary key new Key(1)
		String value = hashMap.get(new Key(1));
		System.out.println(value);
	}
}
