import java.util.Scanner;
class KthSmallestNum
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int k=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
a[i]=sc.nextInt();
for(int j=0;j<n;j++)
{
if(j==k-1)
{
System.out.println(a[j]);
}
}
}
}
