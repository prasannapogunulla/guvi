import java.util.Scanner;
class Swap
{
public static void main(String args[])
{
int x,y,temp;
Scanner in=new Scanner(System.in);
x=in.nextInt();
y=in.nextInt();
System.out.println(y);
temp=x;
x=y;
y=temp;
System.out.println(x);
}
