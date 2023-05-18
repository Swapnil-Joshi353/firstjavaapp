package DemoReflecions;
import java.lang.reflect.*;

public class Main {
	public static void main(String[] args) {
		Emp e1 = new Emp(12,"Ram",15000);
		Class c1 = e1.getClass();
		
		Method []m = c1.getMethods();
		for(Method M : m)
			System.out.println(M);
		
		System.out.println("--------------Constructors-----------------");
		
		Constructor []c = c1.getConstructors();
		for(Constructor con : c)
			System.out.println(con);
	
		String S1 = "Naruto";
		Class c2 = S1.getClass();
		
		System.out.println("-------------------Methods-----------------------");
		Method[]m2 = c2.getMethods();
		for(Method M : m2)
		{
			System.out.println(M);
			System.out.println(M.getName() + "\n");
		}
		
		
	}
	
}
