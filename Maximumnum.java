import java.util.Scanner;
class Maximum
{
public static void main(String args[])
{
int large=0;
int num;
Scanner input=new Scanner(System.in);
int n=input.nextInt();
num=input.nextInt();
for(int i=2;i<n;i++)
{
num=input.nextInt();
if(num>large)
{
large=num;
}
}
System.out.println(large);
}
}

