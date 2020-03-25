package hackerRank;

public class JavaStringIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String A="hello";
		String B="java";
		System.out.println("Length-->"+(A.length()+B.length()));
		if(A.compareTo(B)>0) {
			System.out.println("Yes");
		} /*
			 * else if(A.compareTo(B)<0){ System.out.println("Yes"); }
			 */else {
			System.out.println("No");
		}
		
		System.out.println(A.substring(0, 1).toUpperCase()+A.substring(1)+" "+B.substring(0, 1).toUpperCase()+B.substring(1));
	
		
		int n =-100;
		//Integer.toString(n);
		String s=String.valueOf(n);
        if(n==Integer.valueOf(s)) {
            System.out.println("Good job");    
        }else {
            System.out.println("Wrong answer");
        }
		
		
	}

}
