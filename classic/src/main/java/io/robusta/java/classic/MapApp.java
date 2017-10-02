package io.robusta.java.classic;

import java.util.*;
import java.util.Map.Entry;

/**
 *
 * Map : We add entry with map.put(key, val) We read value with map.get(key) We
 * read keys with map.keySet() We read values with map.values() We read entries
 * with map.entrySet()
 *
 *
 */
public class MapApp {

	Map<Integer, String> buildMap(int key1, String val1, int key2, String val2) {

		Map<Integer, String> hashMap = new HashMap<>();

		hashMap.put(key1, val1);
		hashMap.put(key2, val2);
		
		return hashMap;

	}

	Map<Integer, String> buildMap(int[] keys, String[] values) {

		if (keys.length!= values.length){
			throw new IllegalArgumentException("looser");
			
		}
		Map<Integer, String> hashMap = new HashMap<>();

		for (int i = 0; i < keys.length; i++) { 

			hashMap.put (keys[i], values [i]);
			
		}
      return hashMap; 
      }
		


	Set<Integer> getKeys(Map<Integer, String> map) {
		Set<Integer> set = new HashSet<>();
		set= map.keySet();
		return set;
	}

	List<Integer> getKeysAsList(Map<Integer, String> map) {
		List <Integer> list = new ArrayList<>();
		list.addAll(map.keySet());
		
		return list;
	}

	Set<Entry<Integer, String>> getEntries(Map<Integer, String> map) {
		return map.entrySet();
	}

	List<String> getValues(Map<Integer, String> map) {
		return null;
	}

	String[] getValuesFromMap(Map<Integer, String> map, int key1, int key2) {
		return null;
	}

	List<Integer> getKeysHavingValue(Map<Integer, String> map, String value) {
		return null;
	}

	List<Integer> getKeysHavingValueAnyValue(Map<Integer, String> map, String... values) {
		return null;
	}

	// TODO: move up
	String displayMap(Map<Integer, String> map) {
		// Use map.entrySet()to have nice display
		for (Entry<Integer, String> entry : map.entrySet()) {
			System.out.println("Entry:" + entry.getKey());
			System.out.println("Value:" + entry.getValue());
		}

		return null;
	}

	List<Card> getCards(Map<Integer, Character> map) {
		return null;
	}

}
