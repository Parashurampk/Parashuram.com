package TInterview;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class MapSortByValue {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("Thirty", 30);
		map.put("Ten", 10);
		map.put("Twenty", 20);
		map.put("FourTwenty", 420);
		map.put("one Twenty", 120);
		// print the map
		System.out.println(map);
		// sorting
		LinkedHashMap<String, Integer> smap = map.entrySet().stream()
				.sorted((t1, t2) -> t1.getValue().compareTo(t2.getValue()))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (t1, t2) -> t1, LinkedHashMap::new));
		System.out.println(smap);
		int size = smap.size();
		System.out.println(size);
		int max = Collections.max(smap.values());
		int SecondMax = 0;
		for (int value : smap.values()) {
			if (value > max) {
				SecondMax = max;
				max = value;
			} else if (value > SecondMax && value != max) {
				SecondMax = value;
			}
		}
		System.out.println(SecondMax);
		Integer Value = SecondMax;
		for (Entry<String, Integer> entry : smap.entrySet()) {
			if (entry.getValue() == Value) {
				System.out.println("\nThe key of the: " + Value + " is " + entry.getKey());
				smap.remove(entry.getKey());
				break;
			}
		}

		System.out.println(smap);
	}
}