import java.util.Scanner;
 class VolumeOfaCuboid
{
	public static void main (String[] args) throws java.lang.Exception
	{
	  Scanner sc=new Scanner(System.in);
		int l=sc.nextInt();
		int b=sc.nextInt();
		int h=sc.nextInt();
		int s,v;
		if(l==1&&b==1&&h==1)
		{
			s=2*l*b*h;
			v=l*b*h;
			System.out.print(s+" "+v);
		}
		else
		{
			s=((2*l*b)+(2*b*h)+(2*h*l));
			v=(l*b*h);
			System.out.print(s+" "+v);
		}
	}
}
	
