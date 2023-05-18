package Ass3;
import java.util.*;

public class SortEmpName implements Comparator<Emp> {

	public int compare(Emp o1, Emp o2) {
		return o1.EmpName.compareTo(o2.EmpName);
	}

}
