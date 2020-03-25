package hackerRank;

public class TestSingleton {

	public static void main(String[] args) {
		JavaSingletonPattern js2 = JavaSingletonPattern.getInstance();
		JavaSingletonPattern js1 = JavaSingletonPattern.getInstance();
		
		System.out.println(js1==js2);
		
	}

}
