package hackerRank;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class JavaAnagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="anagramm";
		String b="marganaa";
		a="Hello";
		b="hello";
		a=a.toUpperCase();
		b=b.toUpperCase();
		java.util.Map <Character, Integer> hashA= new java.util.HashMap<Character,Integer>();
		for (char c : a.toCharArray()) {
			if(hashA.containsKey(c)) {
				Integer newVal = hashA.get(c) + 1;
				hashA.put(c, newVal);
			}else {
				hashA.put(c, 1);
			}	
		}
		System.out.println(java.util.Arrays.asList(hashA)); 
		java.util.HashMap <Character, Integer> hashB= new java.util.HashMap<Character,Integer>();
		for (char c : b.toCharArray()) {
			if(hashB.containsKey(c)) {
				Integer newVal = hashB.get(c) + 1;
				hashB.put(c, newVal);
			}else {
				hashB.put(c, 1);
			}	
		}
		System.out.println(Arrays.asList(hashB));
		
		if(hashA.equals(hashB)) {
			System.out.println("Anagaram");	
		}else {
			System.out.println("Not Anagaram");
		}
		
		
		
	}

}
