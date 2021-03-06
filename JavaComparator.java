package hackerRank;

import java.util.*;

//Write your Checker class here

@SuppressWarnings("rawtypes")
class Checker implements Comparator{
	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Player p1 = (Player)o1;
		Player p2 = (Player)o2;
		
		//return Integer.valueOf(p2.score).compareTo(Integer.valueOf(p1.score));
		
		  if(p1.score== p2.score) { 
			  return p1.name.compareTo(p2.name);
		  
		  }else { 
			  return Integer.valueOf(p2.score).compareTo(Integer.valueOf(p1.score)); }
		 
		//return 0;
	}
	
}

class Player{
 String name;
 int score;
 
 Player(String name, int score){
     this.name = name;
     this.score = score;
 }
}

class JavaComparator {

 @SuppressWarnings("unchecked")
public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     int n = scan.nextInt();

     Player[] player = new Player[n];
     Checker checker = new Checker();
     
     for(int i = 0; i < n; i++){
         player[i] = new Player(scan.next(), scan.nextInt());
     }
     scan.close();

     Arrays.sort(player, checker);
     for(int i = 0; i < player.length; i++){
         System.out.printf("%s %s\n", player[i].name, player[i].score);
     }
 }
}