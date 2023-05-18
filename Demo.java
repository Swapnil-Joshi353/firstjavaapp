public class prime
{
	public static void main(String[]a)
	{
		boolean flag= true;
		int i = 1, n = 31;
		for(i =2; i<n; i++)
		{
			If(n%i==0)
			{
				flag= false;
				break;
			}
		}
		If(flag==true)
		System.out.println(n+" is prime");
	    else
		System.out.println(n+" is not prime");
	}
}