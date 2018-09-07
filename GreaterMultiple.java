import java.util.Scanner;
class GreaterMultiple
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
if(n%10==0)
System.out.println(n);
else
{
n=(n/10)*10;
int b=n+10;
System.out.println(b);
}
}
}
