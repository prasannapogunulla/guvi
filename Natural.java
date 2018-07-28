public class Demo
{
public static void main(String args[])
{
int n,i=1,sum=0;
Scanner input=new Scanner(System.in);
System.out.println("enter number:");
n=input.nextInt();
do
{
sum=sum+i;
i+=1;
}while(i<=n);
System.out.println("sum of first"+n+"numbers="+sum);
}
}
