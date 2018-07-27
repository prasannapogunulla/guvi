public class Demo
{
public static void main(String args[])
{
char ch;
System.out.println("enter the character:");
Scanner sc=new Scanner(System.in);
ch=sc.next().charAt(0);
if((ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u'))
{
System.out.println("given character is vowel");
}
  else
  {
    System.out.println("given character is consonent");
  }
}
}
