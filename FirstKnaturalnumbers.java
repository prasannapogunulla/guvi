import java.util.Scanner;
class FirstKnaturalnumber
{
public static void main(String args[])
{
int num,count=1,total=0;
Scanner sc=new Scanner(System.in);
num=sc.nextInt();
while(count<=num)
{
total=total+count;
count++;
}
System.out.println(total);
}
}
