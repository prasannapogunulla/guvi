import java.util.Scanner;
import java.io.*;
class FirstThree
{
public static void main(String args[])
{
String str;
Scanner sc=new Scanner(System.in);
str=sc.next();
  int n=sc.nextInt();
System.out.println(str.substring(0,n));
}
}
