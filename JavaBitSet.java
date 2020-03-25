package hackerRank;


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaBitSet {
	private static final Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) throws IOException {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		int N = scanner.nextInt();
		BitSet b1 = new BitSet(N);
		BitSet b2 = new BitSet(N);
		StringBuilder sb=new StringBuilder();

		int M = scanner.nextInt();
		for(int i=0;i<M;i++) {
			try {
				String op ="";
				if(scanner.hasNext())
						op=scanner.next();
				int a= 0;
				if(scanner.hasNext())
						a=scanner.nextInt();
				int b = 0;
				if(scanner.hasNext())
						b=scanner.nextInt();
				System.out.println("==="+i+"-->"+op+a+","+b);
				sb.append(i+","+op+" "+a+" "+b+"  "+",");
				
				switch(op) {
				case "AND":
					if(a==1) {
						b1.and(b2);
					}else {
						b2.and(b1);
					}    			
					break;
				case "OR":
					if(a==1) {
						b1.or(b2);
					}else {
						b2.or(b1);
					}
					break;
				case "XOR":				
					if(a==1) {
						b1.xor(b2);
					}else {
						b2.xor(b1);
					}
					break;
				case "FLIP":				
					if(a==1) {
						b1.flip(b);
					}else {
						b2.flip(b);
					}
					break;
				case "SET":				
					if(a==1) {
						b1.set(b);
					}else {
						b2.set(b);
					}
					break;
				}				
			}catch(Exception e) {
				
			}
				
				System.out.println(b1.cardinality()+" "+b2.cardinality());
				sb.append(b1.cardinality()+" "+b2.cardinality());
				//sb.append(","+"=IF(B2=C2,\"MATCH\", \"No Match\")");
				sb.append("\n");
			}
		
			writeToFile("bitSetOutput",sb);
			//=IF(B2=C2,"MATCH", "No Match")
		
		
		}
	/*
	 * private static String getNumberBitsSet(int N, BitSet b1, BitSet b2) { int
	 * b1Count =0, b2Count=0; for(int i=0;i<N;i++) { if(b1.get(i)) { b1Count++; }
	 * if(b2.get(i)) { b2Count++; } } return
	 * String.valueOf(b1Count)+" "+String.valueOf(b2Count); }
	 */
	
	
	public static void writeToFile(String file, StringBuilder sbHtml) throws IOException {
		File outputFile = new File(file);
		FileWriter ffw = new FileWriter(outputFile.getAbsoluteFile());
		BufferedWriter bw = new BufferedWriter(ffw);
		bw.write(sbHtml.toString());
		bw.close();
		System.out.println(outputFile.getPath());

	}

	}