import java.util.Scanner;
class LeastAndHighest
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
a[i]=sc.nextInt();
int min=a[0];
int max=a[0];
for(int j=0;j<a.length;j++)
{
if(a[j]>max)
max=a[j];
if(a[j]<min)
min=a[j];
}
System.out.print(min+" ");
System.out.print(max);
}
}
