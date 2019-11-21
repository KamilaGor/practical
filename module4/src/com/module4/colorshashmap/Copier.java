package com.module4.colorshashmap;

import java.util.HashMap;
import java.util.Map;

public class Copier {

	public void duplicateMap(Map<Integer, String> sourceMap, Map<Integer, String> destinationMap) {
		for(Map.Entry<Integer, String> entryMap: sourceMap.entrySet()) {
			destinationMap.put(entryMap.getKey(), entryMap.getValue());
		}
	}
}
