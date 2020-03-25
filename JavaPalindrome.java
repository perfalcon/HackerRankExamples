package hackerRank;

public class JavaPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="898";
		

		StringBuilder sb = new StringBuilder(str);
		System.out.println(sb.toString());
		System.out.println(sb.reverse());
		if(sb.toString().equals(sb.reverse().toString())){
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		
		
		
		int a = 898;
		System.out.println(new StringBuilder(String.valueOf(a)).toString());
		if(String.valueOf(a).equals((new StringBuilder(String.valueOf(a))).reverse().toString())) {
			System.out.println("palin");
		}else {
			System.out.println("not palin");
		}
		
		
		
		

	}

}
