import java.util.Scanner;
class NumberOfDigits
{
private static Scanner sc;
public static void main(String args[])
{
int number,count=0;
sc=new Scanner(System.in);
number=sc.nextInt();
while(number>0)
{
number=number/10;
count=count+1;
}
System.out.println(count);
}
}
