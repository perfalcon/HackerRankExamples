package hackerRank;

public class JavaSingletonPattern {
	private static JavaSingletonPattern instance;
	public  String str;
	private JavaSingletonPattern() {

	}

	public static  JavaSingletonPattern getInstance() {
		if(instance==null) {
			instance = new JavaSingletonPattern();	
		}
		return instance;
	}
}



