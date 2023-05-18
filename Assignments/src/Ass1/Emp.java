package Ass1;

public class Emp implements Comparable<Emp> {
	private int Empid;
	private String EmpName;
	private double EmpSalary;
	
	public Emp()
	{
		
	}

	public Emp(int empid, String empName, double empSalary) {
		Empid = empid;
		EmpName = empName;
		EmpSalary = empSalary;
	}

	public int compareTo(Emp o) {
		return (int) (this.EmpSalary-o.EmpSalary);
	}

	@Override
	public String toString() {
		return "Emp [Empid=" + Empid + ", EmpName=" + EmpName + ", EmpSalary=" + EmpSalary + "]";
	}
	
	
	
	
}
