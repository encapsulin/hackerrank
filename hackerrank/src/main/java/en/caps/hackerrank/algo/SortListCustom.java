package en.caps.hackerrank.algo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortListCustom {

	//https://beginnersbook.com/2017/10/java-8-lambda-comparator-example-for-sorting-list-of-custom-objects/
	
	public static void main(String[] args) {
		sortListOfMaps();
	}
	
	static void sortListOfMaps() {
		//https://www.baeldung.com/java-hashmap-sort
		Map<String,String> map = new HashMap<>();
		map.put("id3", "title1");
		map.put("id1", "title2");
		map.put("id2", "title3");
		System.out.println(map);
//		map.
	}
	
	static void sortListOfLists() {
//		class CustomCMP<T> implements Comparator<T>{
//
//			@Override
//			public int compare(T o1, T o2) {
//				List<String> aList = (List)o1.get
//				return 0;
//			}
//			
//			
//		}
		
		List<List<String>> aListList = new ArrayList<>();
		
		List<String> aList = new ArrayList<>();
		aList.add("id1");
		aList.add("title2");
		aList.add("price3");
		
		aListList.add(aList);
		
		List<String> aList2 = new ArrayList<>();
		aList2.add("id2");
		aList2.add("title3");
		aList2.add("price1");
		
		aListList.add(aList2);
		
		List<String> aList3 = new ArrayList<>();
		aList3.add("id3");
		aList3.add("title1");
		aList3.add("price2");
		
		aListList.add(aList3);
		System.out.println(aListList);
		
		Collections.sort(aListList, (o1,o2)-> o1.get(1).compareTo(o2.get(1) ));
		System.out.println(aListList);
		
		aListList.sort((o1,o2)-> o1.get(2).compareTo(o2.get(2) ));
		System.out.println(aListList);	
	}

}
