 import java.util.Scanner;
class DigitsOpr
{
private int num;
public void getNum(int x)
{
num=x;
}

public int productDigits()
{
int n,pro;
n=num;//keep value of num safe
pro=1;
while(n>0)
{
pro *=(n%10); //find digit using n=n%10 
n/=10;
}
return pro;
}
}

 class number1
{
public static void main(String []s)
{
DigitsOpr dig=new DigitsOpr();
int n;
Scanner sc=new Scanner(System.in);

n=sc.nextInt();
dig.getNum(n);

System.out.println(dig.productDigits());
}
}
