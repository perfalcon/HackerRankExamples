package hackerRank;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StrongPassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String pass = "Abl";
		//pass="#HackerRank123";
		//pass="4700";
		pass="AUzs-nV";
				
		 
		/*
		 * String str=".*[0-9]+.*"; //".*[a-z]+.*"; //"([A-Z]|[a-z])+.*"; Pattern
		 * pattern = Pattern.compile(str);
		 * 
		 * 
		 * Matcher matcher = pattern.matcher(pass);
		 * 
		 * Pattern p = Pattern.compile("([A-Z]|[a-z])+.*"); Matcher m =
		 * p.matcher("aaaaab"); boolean b = m.matches();
		 * 
		 * System.out.println(b);
		 * 
		 * System.out.println("matchers-->"+matcher.matches()); if(matcher.matches()) {
		 * System.out.println("found upper and lower"); }
		 */
		int count =0;
		if(pass.length()>=6) {
		}else {
			System.out.println(6-pass.length());
		}

		
			if(pass.matches(".*[A-Z]+.*")) {
				System.out.println("found upper and lower");				
			}else {
				count++;
			}
			if(pass.matches(".*[0-9]+.*")) {
				System.out.println("found num");
			}else {
				count++;
			}
			if(pass.matches(".*[!@#$%^&*()\\-\\+]+.*")) {
				System.out.println("found special");
			}else {
				count++;
			}
			 if(pass.matches(".*[a-z]+.*")){

		        }else{
		         count++;
		        }
			
			
		if(count+pass.length()<6) {
			int temp = 6-(count+pass.length());
			count = count+temp;
			System.out.println("---"+temp);
		}
			 
		System.out.println("==="+count);
	}

}
