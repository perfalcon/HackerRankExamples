package hackerRank;


import java.util.*;
class JavaStack{
	
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		
		
		
		while (sc.hasNext()) {
			String input=sc.next();
			if(input.equals("quit"))
				break;
            //Complete the code			
			//System.out.println(checkBalanced(input));
			System.out.println(check(input));
		}
		
		
	}
	static Map<Character, Character> sym = new HashMap<>();
	static Map<Character, Character> invSym = new HashMap<>();
	static {
		sym.put('}', '{');
		sym.put(')', '(');
		sym.put(']', '[');
		
		/*
		 * sym.forEach((a, b) -> { invSym.put(b, a); });
		 */
	}

	private static boolean check(String str) {
		Stack<Character> st = new Stack<Character>();
		for(int i=0; i<str.length(); i++) {
			char c = str.charAt(i);
			if(sym.containsKey(c) 
					&& !st.empty() 
					&& st.peek().equals(sym.get(c))) {
				st.pop();
			} else {
				st.push(c);
			}
		}
		
		return st.empty();
		
	}

	private static boolean checkBalanced(String input) {
		Deque<Character> d = new ArrayDeque<Character>();
		//System.out.println("===>"+input);
		boolean flag = true;
		if(input.length()%2!=0) {
			flag=false;
			return flag;
		}
		for(char c : input.toCharArray()) {
			d.add(c);
		}	
		char[] a= input.toCharArray();
		if(verifyCharacter(a[0],a[1])) {
			System.out.println("1---");
			for(int i=2; i<a.length;i+=2) {
				char c1 = a[i];
				char c2 = a[i+1];
				flag=verifyCharacter(c1,c2);
			}		
		}else {
			while(!d.isEmpty()) {
				System.out.println("2---");
				char cf = d.removeFirst();
				char cl = d.removeLast();
				System.out.println(cf+"==="+cl);
				flag=verifyCharacter(cf,cl);
				if(flag) {
					String x= Arrays.toString(d.toArray());
					System.out.println("==>"+x);
					if(!d.isEmpty())
						flag=checkBalanced(Arrays.toString(d.toArray()));
				}
			}	
		}
		System.out.println("--"+flag);		
		return flag;
	}

	private static boolean verifyCharacter(char c1, char c2) {
		if(c1 == '{' && c2=='}') {
			return true;
		}else if (c1=='(' && c2==')') {
			return true;
		}else if(c1=='[' && c2==']'){
			return true;
		}else {
			return false;
		}
		
	}
}