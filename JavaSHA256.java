package hackerRank;



import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;

public class JavaSHA256 {

    public static void main(String[] args) throws NoSuchAlgorithmException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	
    	Scanner in = new Scanner(System.in);
    	String s= in.next();
    	System.out.println("\n" + s + " : " + toHexString(getSHA(s))); 
    	
    	
    	MessageDigest digest = MessageDigest.getInstance("SHA-256");
    	byte[] encodedhash = digest.digest(s.getBytes(StandardCharsets.UTF_8));
    	    	
    	System.out.println("\n" + s + " : " + bytesToHex(encodedhash));
    	
    	System.out.println("MD5 -->\n" + s + " : " + MD5Hash(s));
    	
    	
    }
    
    private static String MD5Hash(String s) throws NoSuchAlgorithmException {
    	String hashString="";
    	MessageDigest digest = MessageDigest.getInstance("MD5");
    	byte[] encodedhash = digest.digest(s.getBytes(StandardCharsets.UTF_8));
    	hashString=bytesToHex(encodedhash);
    		     
    	return hashString;
    }
    
    private static String bytesToHex(byte[] hash) {
        StringBuffer hexString = new StringBuffer();
        for (int i = 0; i < hash.length; i++) {
        String hex = Integer.toHexString(0xff & hash[i]);
        if(hex.length() == 1) hexString.append('0');
            hexString.append(hex);
        }
        return hexString.toString();
    }

public static byte[] getSHA(String input) throws NoSuchAlgorithmException 
{  
    // Static getInstance method is called with hashing SHA  
    MessageDigest md = MessageDigest.getInstance("SHA-256");  

    // digest() method called  
    // to calculate message digest of an input  
    // and return array of byte 
    return md.digest(input.getBytes(StandardCharsets.UTF_8));  
} 

public static String toHexString(byte[] hash) 
{ 
    // Convert byte array into signum representation  
    BigInteger number = new BigInteger(1, hash);  

    // Convert message digest into hex value  
    StringBuilder hexString = new StringBuilder(number.toString(16));  

    // Pad with leading zeros 
    while (hexString.length() < 32)  
    {  
        hexString.insert(0, '0');  
    }  

    return hexString.toString();  
} 

}