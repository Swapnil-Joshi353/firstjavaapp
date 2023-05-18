package Ass3;

import java.util.*;

public class Demo extends Emp{
	public static void main(String[] args) {
		List<Emp> e1 = new ArrayList();
		e1.add(new Emp(1,"Amar",10000));
		e1.add(new Emp(9,"Ajay",20000));
		e1.add(new Emp(2,"Balu",15700));
		e1.add(new Emp(8,"Chetan",33300));
		e1.add(new Emp(3,"Dick",10099));
		e1.add(new Emp(6,"Tom",5009));
		e1.add(new Emp(4,"Elvis",17500));
		e1.add(new Emp(7,"Farhad",9999));
		e1.add(new Emp(8,"Garfield",15800));
		e1.add(new Emp(5,"Harry",23500));
		
		System.out.println("Sort According to Id");
		Collections.sort(e1, new SortEmpid());
		System.out.println(e1);
		
		System.out.println("Sort According to Employee Names");
		Collections.sort(e1, new SortEmpName());
		System.out.println(e1);
		
		System.out.println("Sort According to Salary");
		Collections.sort(e1, new SortEmpSalary());
		System.out.println(e1);
	}
}
