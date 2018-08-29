import java.util.Scanner;
class EvenOrOdd
{
public static void main(String args[])
{
int num1,num2,sum;
Scanner scan=new Scanner(System.in);
num1=scan.nextInt();
num2=scan.nextInt();
sum=num1+num2;
if(sum%2==0)
{
System.out.println("even");
}
else
{
System.out.println("odd");
}
}
