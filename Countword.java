import java.util.Scanner;
class Count
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int sum=0;
String val=sc.nextLine();
int len=val.length();
for(int i=0;i<len;i++)
{
if(val.charAt(i)==' ')
{
continue;
}
sum++;
}
System.out.println(sum);
}
}
