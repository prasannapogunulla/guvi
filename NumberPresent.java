import java.util.Scanner;
class NumberPresent
{
public static void main(string args[])
{
Scanner sc=new Scanner(System.in);
int count=0;
int n=sc.nextInt();
int k=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
for(int i=0;i<n;i++)
{
if(count>0)
{
System.out.println("yes");
}
else
{
System.out.println("no");
}
}
}
}
