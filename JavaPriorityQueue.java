package hackerRank;



import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;
/*
 * Create the Student and Priorities classes here.
 */

class StudentPQ{
	private int id;
	private String fname;
	private double cgpa;
	public StudentPQ(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return fname;
	}
	public double getCgpa() {
		return cgpa;
	}
	/*
	 * public int compareTo(Student1 s2) { if(s2.getCgpa()==this.cgpa) {
	 * if(this.fname==s2.getFname()) { return
	 * Integer.valueOf(s2.getId()).compareTo(this.id); }else { return
	 * this.fname.compareTo(s2.getFname()); } }else { return
	 * Double.valueOf(s2.getCgpa()).compareTo(this.cgpa); }
	 * 
	 * }
	 */
	
}

class Priorities{
	
	Priorities(){}	
	List<StudentPQ> getStudents(List<String> events){
	PriorityQueue<StudentPQ> p = new PriorityQueue<StudentPQ>(priorityComparator);
	ArrayList<StudentPQ>x = new ArrayList<StudentPQ>();
	for(String event : events) {
		System.out.println(event);
		String data[]=event.split("\\s");
		//if(event.startsWith("ENTER")) {
		if(data[0].equals("ENTER")) {			
			p.add(new StudentPQ(Integer.parseInt(data[3]),data[1],Double.parseDouble(data[2])));
		}else if(data[0].equals("SERVED")) {
			if(!p.isEmpty())
				p.remove();
		}
	}
	
	for(StudentPQ pq : p) {
		x.add(pq);
	}
	
	
	Collections.sort(x,priorityComparator);
	
	return x;
		
	}
	
	 public static Comparator<StudentPQ> priorityComparator = new Comparator<StudentPQ>() {

		@Override
		public int compare(StudentPQ p1, StudentPQ p2) {
			  if(p2.getCgpa()==p1.getCgpa()) {
				  //System.out.println("GPA equal -->"+p2.getCgpa()+" "+p1.getCgpa());
		            if(p1.getName()==p2.getName()) {
		                return Integer.valueOf(p1.getId()).compareTo(p2.getId());
		            }else {
		                return p1.getName().compareTo(p2.getName());
		            }
		        }else {
		        	//System.out.println("Not GPA equal -->"+p2.getCgpa()+" "+p1.getCgpa());
		            return Double.valueOf(p2.getCgpa()).compareTo(p1.getCgpa());    
		        }
		}

	       
	    };
}

public class JavaPriorityQueue {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();
    
    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());    
        List<String> events = new ArrayList<>();
        
        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }
        
        List<StudentPQ> students = priorities.getStudents(events);
        
        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (StudentPQ st: students) {
                System.out.println(st.getName()+" "+st.getCgpa());
                
            }
        }
    }
}