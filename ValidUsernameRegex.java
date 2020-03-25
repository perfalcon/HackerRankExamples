package hackerRank;

public class ValidUsernameRegex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String regex = "^[a-zA-Z|_|0-9]{8,30}";
		//regex="^[a-zA-z0-9_]{8,30}";
		regex="(?![0-9|_])\\w{8,30}";
		String usernames[]=
			{
					"Julia",
					"Samantha",
					"Samantha_21",
					"1Samantha",
					"Samantha?10_2A",
					"JuliaZ007",		
					"Julia@007",
					"_Julia007"	
			};
		for(int i=0;i<usernames.length;i++) {
			//System.out.println(usernames[i]+"=="+usernames[i].matches(regex));
			System.out.println(usernames[i]+"="+(usernames[i].matches("(?![0-9|_])\\w{8,30}")?"valid":"invalid"));
		
			
			
		}
	}

}
