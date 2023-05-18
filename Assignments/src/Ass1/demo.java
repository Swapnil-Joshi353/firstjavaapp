package Ass1;
import java.util.*;

public class demo extends Emp {
	public static void main(String []args)
	{
		Set<Emp> emps = new TreeSet<>();
		emps.add(new Emp(12,"Shri",15000));
		emps.add(new Emp(13,"Ram",16000));
		emps.add(new Emp(14,"Raj",17000));
		emps.add(new Emp(15,"Amar",55000));
		emps.add(new Emp(16,"Rani",18000));
		
		System.out.println(emps);
		
	}
	
}
