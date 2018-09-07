import java.util.Scanner;
class AllNumbers
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
for(int i=0;i<str.length();i++)
{
if(Character.isDigit(str.charAt(i)))
System.out.print(str.charAt(i));
}
}
}
