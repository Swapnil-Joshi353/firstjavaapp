package DemoReflecions;

public class Emp{
	int Empid;
	String EmpName;
	double EmpSalary;
	
	public Emp()
	{
		
	}

	public Emp(int empid, String empName, double empSalary) {
		Empid = empid;
		EmpName = empName;
		EmpSalary = empSalary;
	}

	
	@Override
	public String toString() {
		return "Empid=" + Empid + ", EmpName=" + EmpName + ", EmpSalary=" + EmpSalary ;
	}
	
	
	
	
}
