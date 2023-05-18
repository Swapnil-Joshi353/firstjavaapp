package Ass3;

import java.util.*;

public class SortEmpid implements Comparator<Emp> {

	
	public int compare(Emp o1, Emp o2) {
		return o1.Empid - o2.Empid;
	}

}
