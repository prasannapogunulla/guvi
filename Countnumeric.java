import java.util.Scanner;
class Countnumeric
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String test;
test=sc.nextLine();
count(test);
}
public static void count(String x)
{
char[] ch=x.toCharArray();
int num=0;
for(int i=0;i<x.length();i++)
{
if(Character.isDigit(ch[i])
{
num++;
}
}
System.out.println(num);
}
}
