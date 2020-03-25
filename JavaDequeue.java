package hackerRank;
import java.util.*;

public class JavaDequeue {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Deque deque = new ArrayDeque<>();
		int n = in.nextInt();
		int m = in.nextInt();

		HashSet<Integer> set = new HashSet<Integer>();
		int x[] = new int[n];
		
		int max=0;
		for (int i = 0; i < n; i++) {
			int num = in.nextInt();
			//x[i]=num;
			
			deque.add(num);
			set.add(num);
			if(deque.size()==m) {
				if(set.size()>max) max=set.size();
				int f = (int) deque.remove();
				if(!deque.contains(f)) set.remove(f);
			}
			
			System.out.print(i);
			
			
		}        

		
		/*
		 * for(int i=0;i<n-(m-1);i++) { Deque d = new ArrayDeque<>(); for(int
		 * j=0;j<m;j++) { d.add(x[i+j]); } System.out.println(d); Iterator iter =
		 * d.iterator(); HashSet<Integer> set = new HashSet<Integer>(); int dupCount=0;
		 * while(iter.hasNext()) { if(!set.add((int)iter.next())) { dupCount++; } }
		 * System.out.println(d.size()-dupCount); if((d.size()-dupCount)>max)
		 * max=d.size()-dupCount; }
		 */
		
		
		
		
		
		System.out.println("Max is : "+max);
	}
}