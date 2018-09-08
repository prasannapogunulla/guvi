import java.util.Scanner;
class DivideByTwoRec
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int num,res,ans;
num=sc.nextInt();
if((num%2)==0)
{
ans=num/2;
System.out.println(ans);
}
else
System.out.println(num);
}
}
