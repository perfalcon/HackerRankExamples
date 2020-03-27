package hackerRank.thirtyDays;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Stack;

public class Day18QueuesandStacks {
	static Deque<Character> queue=new ArrayDeque<Character>();  
	static Stack<Character> st = new Stack<Character>();
	public static void main(String[] args) {
		String s="racecar";
		for(char c : s.toCharArray()) {
			//queue.add(c);
			//st.add(c);
			enQueue(c);
			pushStack(c);
		}
		
        boolean isPalindrome = true;
        for (int i = 0; i < s.length()/2; i++) {
        	//popCharacter(); 
        	//dequeueCharacter();
			
			  if (popCharacter() != dequeueCharacter()) { isPalindrome = false; break; }
			 
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + s + ", is " 
                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
	}
	
	static void  enQueue(char c) {
		//System.out.println(c);
		queue.add(c);
	}
	static void pushStack(char c) {
		st.add(c);
	}
	static char popCharacter() {
		char c = st.pop();
		System.out.println(c);
		return c;
	}
	static char dequeueCharacter() {
		char c = queue.remove();
		System.out.println(c);
		return c;
	}
}
