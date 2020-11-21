package pers.pudge.spark.java.utils;


import java.util.*;
import java.util.Map.Entry;

/**
 * @version 1.4.1
 */
public class MapUtils {

	public static <K, V> void fill_key_setMap(Map<K, Set<V>> key_setMap, K key, V val) {
		Set<V> valSet = key_setMap.get(key);
		if (valSet == null) {
			valSet = new HashSet<V>();
			valSet.add(val);
			key_setMap.put(key, valSet);
		} else {
			valSet.add(val);
		}
	}

	public static <K, V> void fill_key_setMap(Map<K, Set<V>> key_setMap, K key, Collection<V> vals) {
		Set<V> valSet = key_setMap.get(key);
		if (valSet == null) {
			valSet = new HashSet<V>();
			valSet.addAll(vals);
			key_setMap.put(key, valSet);
		} else {
			valSet.addAll(vals);
		}
	}
	
	public static <K, V> void fill_key_hashSetMap(Map<K, HashSet<V>> key_setMap, K key, V val) {
		HashSet<V> valSet = key_setMap.get(key);
		if (valSet == null) {
			valSet = new HashSet<V>();
			valSet.add(val);
			key_setMap.put(key, valSet);
		} else {
			valSet.add(val);
		}
	}
	

	@SuppressWarnings("unchecked")
	public static <K1, K2, V> void fill_key1_key2_valMap(Map<K1, Map<K2, V>> key1_key2_valMap, 
			K1 outKey, K2 innerKey, V strVal, boolean isAddLastVal) {
		Map<K2, V> key2_valMap = key1_key2_valMap.get(outKey);
		if (key2_valMap == null) {
			key2_valMap = new HashMap<K2, V>();
			key2_valMap.put(innerKey, strVal);
			key1_key2_valMap.put(outKey, key2_valMap);
		} else {
			if (isAddLastVal) {
				V existsVal = key2_valMap.get(innerKey);
				if (existsVal == null) {
					key2_valMap.put(innerKey, strVal);
				} else {
					Long existsValLong = Long.parseLong(existsVal.toString());
					Long finalValLong = Long.parseLong(strVal.toString()) + existsValLong;
					key2_valMap.put(innerKey, (V) finalValLong);
				}
			} else {
				key2_valMap.put(innerKey, strVal);
			}
		}
	}

	/**
	 * there is no meaning to fill strStrMap here
	 */
	public static <K> void fill_key_longMapAddUpVal(Map<K, Long> key_longMap, K key, long val) {
		Long existsVal = key_longMap.get(key);
		if (existsVal != null) {
			val = existsVal + val;
		}
		key_longMap.put(key, val);
	}
	
	
	public static void fill_str_strMapAddUpVal(Map<String, String> str_strMap, String key, String val) {
		String existsVal = str_strMap.get(key);
		if (existsVal != null) {
			val = String.valueOf(Long.parseLong(existsVal) + Long.parseLong(val));
		}
		str_strMap.put(key, val);
	}


	public static <K1, K2, V> void fill_key1_key2_valSetMap(Map<K1, Map<K2, Set<V>>> k1_k2_valSetMap,
			K1 outKey, K2 innerKey, V val) {
		Map<K2, Set<V>> k2_valSetMap = k1_k2_valSetMap.get(outKey);
		
		if (k2_valSetMap == null) {
			k2_valSetMap = new HashMap<K2, Set<V>>();
			Set<V> innerSet = new HashSet<V>();
			innerSet.add(val);
			k2_valSetMap.put(innerKey, innerSet);
			k1_k2_valSetMap.put(outKey, k2_valSetMap);
			
		} else {
			Set<V> innerSet = k2_valSetMap.get(innerKey);
			if (innerSet == null) {
				innerSet = new HashSet<V>();
				innerSet.add(val);
				k2_valSetMap.put(innerKey, innerSet);
			} else {
				innerSet.add(val);
			}
		}
	}
	
	
	public static <K1, K2, V> void fill_key1_key2_valListMap(Map<K1, Map<K2, List<V>>> k1_k2_valListMap,
			K1 outKey, K2 innerKey, V val) {
		Map<K2, List<V>> k2_valListMap = k1_k2_valListMap.get(outKey);
		
		if (k2_valListMap == null) {
			k2_valListMap = new HashMap<K2, List<V>>();
			List<V> innerList = new ArrayList<V>();
			innerList.add(val);
			k2_valListMap.put(innerKey, innerList);
			k1_k2_valListMap.put(outKey, k2_valListMap);
			
		} else {
			List<V> innerList = k2_valListMap.get(innerKey);
			if (innerList == null) {
				innerList = new ArrayList<V>();
				innerList.add(val);
				k2_valListMap.put(innerKey, innerList);
			} else {
				innerList.add(val);
			}
		}
	}
	

	public static void fill_str_str_strStrMap(Map<String, Map<String, Map<String, String>>> k1_k2_k3valMap,
			String key1, String key2, String key3, String lastVal, boolean isAddLastVal) {
		
		Map<String, Map<String, String>> k2_k3valMap = k1_k2_k3valMap.get(key1);
		
		if (k2_k3valMap == null) {
			k2_k3valMap = new HashMap<String, Map<String,String>>();
			Map<String, String> strStrMap = new HashMap<String, String>();
			strStrMap.put(key3, lastVal);
			k2_k3valMap.put(key2, strStrMap);
			k1_k2_k3valMap.put(key1, k2_k3valMap);
			
		} else {
			
			Map<String, String> strStrMap = k2_k3valMap.get(key2);
			if (strStrMap == null) {
				strStrMap = new HashMap<String, String>();
				strStrMap.put(key3, lastVal);
				k2_k3valMap.put(key2, strStrMap);
			} else {
				if (isAddLastVal) {
					String existValStr = strStrMap.get(key3);
					int existVal = 0;
					if (existValStr != null) {
						existVal = Integer.parseInt(existValStr);
					}
					existVal += Integer.parseInt(lastVal);
					strStrMap.put(key3, String.valueOf(existVal));
				} else {
					strStrMap.put(key3, lastVal);
				}
			}
		}
	}
	

	public static Map<String, String> merge_two_str_strMapAddVal(
			Map<String, String> alive, Map<String, String> dying) {
		for (Entry<String, String> entry : dying.entrySet()) {
			String dyingKey = entry.getKey();
			String dyingVal = entry.getValue();
			String aliveVal = alive.get(dyingKey);
			if (aliveVal == null) {
				aliveVal = String.valueOf(Integer.parseInt(aliveVal) + Integer.parseInt(dyingVal));
				alive.put(dyingKey, aliveVal);
			} else {
				alive.put(dyingKey, dyingVal);
			}
		}
		return alive;
	}
	
	public static <K, T> void fill_key_listMap(Map<K, List<T>> originalMap, K key, T listEle) {
		List<T> tempList = originalMap.get(key);
		if (tempList == null) {
			tempList = new ArrayList<T>();
			tempList.add(listEle);
			originalMap.put(key, tempList);
		} else {
			tempList.add(listEle);
		}
	}
	
	
	public static <K, T> void fill_key_arrListMap(Map<K, ArrayList<T>> originalMap, K key, T listEle) {
		ArrayList<T> tempList = originalMap.get(key);
		if (tempList == null) {
			tempList = new ArrayList<T>();
			tempList.add(listEle);
			originalMap.put(key, tempList);
		} else {
			tempList.add(listEle);
		}
	}

	
	/**
	 * @param strArr  len != 0 && len % 2 == 0
	 * @return 
	 */
	public static Map<String, String> getMapFromStrArr(String... strArr) {
		Map<String, String> resultMap = new HashMap<String, String>();
		int len = strArr.length;
		if (len != 0 && len % 2 == 0) {
			for (int i = 0; i < len; i += 2) {
				resultMap.put(strArr[i], strArr[i + 1]);
			}
		}
		return resultMap;
	}
	
}
