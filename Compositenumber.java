import java.util.Scanner;
class CompositeNum
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
check(num);
}
static void check(int a)
{
int n=0;
for(int i=1;i<=a;i++)
{
if(a%i==0)
n++;
}
if(n>2)
System.out.println("yes");
else
System.out.println("no");
}
}
