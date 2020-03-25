package hackerRank;
import java.math.BigDecimal;
import java.util.*;

class Student1{
	private int id;
	private String fname;
	private double cgpa;
	public Student1(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}
	public int getId() {
		return id;
	}
	public String getFname() {
		return fname;
	}
	public double getCgpa() {
		return cgpa;
	}
	 public int compareTo(Student1 s2) {
	        if(s2.getCgpa()==this.cgpa) {
	            if(this.fname==s2.getFname()) {
	                return Integer.valueOf(s2.getId()).compareTo(this.id);
	            }else {
	                return this.fname.compareTo(s2.getFname());
	            }
	        }else {
	            return Double.valueOf(s2.getCgpa()).compareTo(this.cgpa);    
	        }
	        
	    }
	
}

//Complete the code
public class JavaSort
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		
		List<Student1> studentList = new ArrayList<Student1>();
		while(testCases>0){
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();
			
			Student1 st = new Student1(id, fname, cgpa);
			studentList.add(st);
			
			testCases--;
		}
      
		Comparator<Student1> valueComparator = new Comparator<Student1>() {
			@Override
			public int compare(Student1 s1, Student1 s2) {
				return s1.compareTo(s2);
			}		
        };
        
		
		studentList.sort(valueComparator);
		
		//Collections.sort((List<T>) studentList);
		
      	for(Student1 st: studentList){
			System.out.println(st.getFname());
		}
	}
}



