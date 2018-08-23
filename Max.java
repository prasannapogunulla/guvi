import java.util.Scanner;
class Max
{
public static void main(String args[])
{
int n,max;
Scanner s=new Scanner(System.in);

int a[]=new int[10];
for(int i=0;i<10;i++)
{
a[i]=s.nextInt();
}
max=a[0];
for(int i=0;i<10;i++)
{
if(max<a[i])
{
max=a[i];
}
}
System.out.println(max);
}
}
