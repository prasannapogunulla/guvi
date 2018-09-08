import java.util.Scanner;
class LastNcharacter
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		String str;
		Scanner sc=new Scanner(System.in);
		str=sc.next();
		int n,m;
		m=sc.nextInt();
		n=str.length();
		for(int i=(n-m);i<n;i++){
			System.out.print(str.charAt(i));
			
		}
	}
}

