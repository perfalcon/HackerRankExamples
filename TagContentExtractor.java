package hackerRank;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagContentExtractor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String strs[]= {"<h1>Nayeem loves counseling</h1>" , 
				"<h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while</par>" , 
				"<Amee>safat codes like a ninja</amee>" ,
				"<SA premium>Imtiaz has a secret crush</SA premium>"
				};
		
		String regex="<([a-z]+)([^<]+)*(?:>(.*)<\\/\\1>|\\s+\\/>)";
		regex="<(.*)>(.*)<(\\/.*)>";
		regex="<(.+)>([^<]+)</\\1>";
		Pattern pattern = Pattern.compile(regex,Pattern.MULTILINE);
		for(int i=0;i<strs.length;i++) {
			Matcher matcher = pattern.matcher(strs[i]);
			boolean matchFound=false;
			while(matcher.find()) {
				//System.out.println(matcher.groupCount());
				System.out.println(matcher.group(2));
				matchFound=true;
				
			}
			 if (! matchFound) {
                 System.out.println("None");
             }
		}
		

	}

}
