package hackerRank;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.Map.Entry;

public class JavaBigDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<BigDecimal> list = new ArrayList<BigDecimal>();
		// list.add(new BigDecimal("9"));
		list.add(new BigDecimal("-100"));
		list.add(new BigDecimal("50"));
		list.add(new BigDecimal("0"));
		list.add(new BigDecimal("56.6"));
		list.add(new BigDecimal("90"));
		list.add(new BigDecimal("0.12"));
		list.add(new BigDecimal(".12"));
		list.add(new BigDecimal("02.34"));
		list.add(new BigDecimal("000.000"));
		
		
		List<String> list2= new ArrayList<String>();
		// list.add(new BigDecimal("9"));
		list2.add("-100");
		list2.add("50");
		list2.add("0");
		list2.add("56.6");
		list2.add("90");
		list2.add("0.12");
		list2.add(".12");
		list2.add("02.34");
		list2.add("000.000");
		
		
		Comparator<String> valueComparator = new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {
				BigDecimal a = new BigDecimal(s1);
				BigDecimal b = new BigDecimal(s2);
				return b.compareTo(a);
			}		
        };
        
        list2.sort(valueComparator);
        
      

		//Collections.sort(list, Collections.reverseOrder());
//        Collections.sort(list, valueComparator);

		/*
		 * for (BigDecimal d : list) { System.out.println(d); }
		 */
		System.out.println("=====");
		
		for (int i = 0; i < list2.size(); i++) {
			System.out.println(list2.get(i));
			list2.get(i).toString();
		}
		
		
		

		/*
		 * HashMap<String,BigDecimal> h= new HashMap<String,BigDecimal>();
		 * h.put("-100",new BigDecimal("-100")); h.put("50",new BigDecimal("50"));
		 * h.put("0",new BigDecimal("0")); h.put("56.6",new BigDecimal("56.6"));
		 * h.put("90",new BigDecimal("90")); h.put("0.12",new BigDecimal("0.12"));
		 * h.put(".12",new BigDecimal(".12")); h.put("02.34",new BigDecimal("02.34"));
		 * h.put("000.000",new BigDecimal("000.000"));
		 * System.out.println("HashMap before sorting, random order ");
		 * Set<Entry<String, BigDecimal>> entries = h.entrySet();
		 * 
		 * for(Entry<String, BigDecimal> entry : entries){
		 * System.out.println(entry.getKey() + " ==> " + entry.getValue()); }
		 * 
		 * Comparator<Entry<String, BigDecimal>> valueComparator = new
		 * Comparator<Entry<String,BigDecimal>>() {
		 * 
		 * @Override public int compare(Entry<String, BigDecimal> arg0, Entry<String,
		 * BigDecimal> arg1) { // TODO Auto-generated method stub BigDecimal a =
		 * arg0.getValue(); BigDecimal b = arg1.getValue(); return b.compareTo(a); } };
		 * 
		 * // Sort method needs a List, so let's first convert Set to List in Java
		 * List<Entry<String, BigDecimal>> listOfEntries = new ArrayList<Entry<String,
		 * BigDecimal>>(entries);
		 * 
		 * // sorting HashMap by values using comparator Collections.sort(listOfEntries,
		 * valueComparator);
		 * 
		 * 
		 * String []s=new String[h.size()];
		 * 
		 * LinkedHashMap<String, BigDecimal> sortedByValue = new LinkedHashMap<String,
		 * BigDecimal>(listOfEntries.size());
		 * 
		 * // copying entries from List to Map int i=0; for(Entry<String, BigDecimal>
		 * entry : listOfEntries){ sortedByValue.put(entry.getKey(), entry.getValue());
		 * s[i++]=entry.getKey(); }
		 * 
		 * System.out.println("HashMap after sorting entries by values ");
		 * 
		 * Set<Entry<String, BigDecimal>> entrySetSortedByValue =
		 * sortedByValue.entrySet();
		 * 
		 * for(Entry<String, BigDecimal> mapping : entrySetSortedByValue){
		 * System.out.println(mapping.getKey());// + " ==> " + mapping.getValue()); }
		 * 
		 * 
		 * for( i=0;i<h.size();i++) { System.out.println(s[i]); }
		 * 
		 * 
		 */

		// https://www.java67.com/2015/01/how-to-sort-hashmap-in-java-based-on.html

	}

}
