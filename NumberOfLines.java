import java.util.Scanner;
class NumberOfLines
{
public static void main(String args[])
{
int count=0,i;
Scanner sc=new Scanner(System.in);
String c=sc.nextLine();
for(i=0;i<c.length();i++)
if(c.charAt(i)=='.')
{
count++;
}
count=count+1;
System.out.println(count);
}
}
