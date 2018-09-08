import java.util.Scanner;
class SumOfAp
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int d=sc.nextInt();
		int n=sc.nextInt();
		int ap=n*(2*a+(n-1)*d)/2;
		System.out.println(ap);
		}
}
