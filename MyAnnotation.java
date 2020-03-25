package hackerRank;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Abc{
	int value();
}


class Hello{
	@Abc(value=5)
	public void sayHello() {
		System.out.println("hello annotation");
	}
}

public class MyAnnotation {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		// TODO Auto-generated method stub
		Hello h = new Hello();
		h.sayHello();
		Method m = h.getClass().getMethod("sayHello");
		Abc a = m.getAnnotation(Abc.class);
		System.out.println("value -->"+a.value());

	}

}
