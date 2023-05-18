package Ass3;
import java.util.*;

public class SortEmpSalary implements Comparator<Emp> {

	public int compare(Emp o1, Emp o2) {
		return (int) (o1.EmpSalary - o2.EmpSalary);
	}

}
