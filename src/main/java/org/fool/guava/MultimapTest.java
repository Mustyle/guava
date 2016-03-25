package org.fool.guava;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

public class MultimapTest {
	public static void main(String[] args) {
		Multimap<String, String> multimap = ArrayListMultimap.create();
		multimap.put("lower", "a");
		multimap.put("lower", "b");
		multimap.put("lower", "c");
		multimap.put("lower", "d");
		multimap.put("lower", "e");

		multimap.put("upper", "A");
		multimap.put("upper", "B");
		multimap.put("upper", "C");
		multimap.put("upper", "D");
		multimap.put("upper", "E");

		Collection<String> lowerCollection = multimap.get("lower");
		System.out.println(lowerCollection.toString());
		
		Collection<String> upperCollection = multimap.get("upper");
		System.out.println(upperCollection.toString());
		
		Set<String> keySet = multimap.keySet();
		System.out.println(keySet.toString());
		
		Collection<String> values = multimap.values();
		System.out.println(values);

		Map<String, Collection<String>> map = multimap.asMap();

		for (String str : lowerCollection) {
			for (Map.Entry<String, Collection<String>> entry : map.entrySet()) {
				String key = entry.getKey();
				
				if (multimap.get(key).contains(str)) {
					System.out.println(key);
				}
			}
		}

	}
}
