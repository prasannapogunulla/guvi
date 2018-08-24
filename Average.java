import java.util.Scanner;
class Average
{
public static void main(String args[])
{
int n,res=0;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
a[i]=sc.nextInt();
for(int i=0;i<n;i++)
res=res+a[i];
System.out.println(res/n);
}
}
