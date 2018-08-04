public class Demo
{
public static void main(String args[])
{
int n=0,i=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter a number:");
n=sc.nextInt();
for(i=1;i<n;i++)
{
if(i%2==0)
{
System.out.println(i+"");
}
}
System.out.println();
}
}
