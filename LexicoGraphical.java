import java.util.Scanner;
class LexicoGraphical
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
char str1[]=str.toCharArray();
Arrays.sort(str1);
System.out.print(str1);
}
}
