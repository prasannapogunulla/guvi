import java.util.Scanner;
 class Exponent
{
	public static void main(String args[])
	{
		int base,exponent;
		Scanner sc=new Scanner(System.in);
		base=sc.nextInt();
		exponent=sc.nextInt();
		long result=1;
		while(exponent!=0)
		{
			result*=base;
			--exponent;
		
		}
		System.out.println(result);
	}
}
