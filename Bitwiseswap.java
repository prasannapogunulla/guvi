import java.util.Scanner;
class Bitwiseswap
{
public static void main(String args[])
{
int m,n;
Scanner s=new Scanner(System.in);
m=s.nextInt();
n=s.nextInt();
m=m^n;
n=m^n;
m=m^n;
System.out.print(m);
System.out.print("\t");
System.out.print(n);
}
}
