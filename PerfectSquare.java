import java.util.Scanner;
class PerfectSquare
{
static boolean isPerfectSquare(double x)
{
double sr=Math.sqrt(x);
return ((sr-Math.floor(sr))==0);
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int m=sc.nextInt();
int x;
x=n*m;
if(isPerfectSquare(x))
System.out.print("yes");
else
System.out.print("no");
}
}
