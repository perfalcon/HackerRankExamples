package hackerRank;

import java.util.Arrays;
//not solved.
public class SuperReducedString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aabcd";
		str="aabccdd";
		str="aaabccddd";

		System.out.println(str.length());
		String newStr="";
		for(int i=0,pos=i;i<str.length()&&(pos<=str.length());i++) {
			System.out.println("pos-->"+pos);
			if(pos<str.length()-1&&str.charAt(pos)==str.charAt(pos+1)) {
				System.out.println("==>"+str.charAt(pos)+"==="+str.charAt(pos+1));
				pos+=2;
			}else{
				newStr+=str.charAt(pos); 
				pos++;
				System.out.println("pos-->>"+pos);
				if(pos==str.length()-1) {
					newStr+=str.charAt(pos);
				}
			}
			System.out.println("---"+newStr);
		}
		System.out.println(newStr);

	}


}
