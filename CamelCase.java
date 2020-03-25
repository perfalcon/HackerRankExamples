package hackerRank;

public class CamelCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="saveChangesInTheEditor";
		str="oneTwoThree";
		String s1="";
		int count=1;
		for(int i=0;i<str.length();i++) {
			char c= str.charAt(i);
			//System.out.println(c ==67);
			if(str.charAt(i)>=65 && str.charAt(i)<=90) {
				s1=""+str.charAt(i);
				count++;
			}else {
				s1+=str.charAt(i);
			}
			System.out.println(s1);
		}
		System.out.println(count);

	}

}
