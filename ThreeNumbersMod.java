import java.util.Scanner;
class ThreeNumbersMod
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int a,b,c,s;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		s=(a*b)%c;
		System.out.println(s);
		}
}
