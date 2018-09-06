import java.util.*;
import java.lang.*;
import java.io.*;
class SubtracTimeFormat
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int a,b,c,d,e,f;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		d=sc.nextInt();
		e=Math.abs(a-c);
		f=Math.abs(b-d);
		System.out.println(e+" "+f);
	}
}
