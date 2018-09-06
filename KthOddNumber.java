import java.util.Scanner;
class KthOddNumber
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n,k;
n=sc.nextInt();
k=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
a[i]=sc.nextInt();
int count=0;
for(int j=0;j<n;j++)
{
if((a[j]%2)!=0)
{
count++;
}
if(count==k)
{
System.out.println(a[j]);
break;
}
}
}
}
