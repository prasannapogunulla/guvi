import java.util.Scanner;
import java.math.RoundingMode;
import java.text.DecimalFormat;
class AreaOfFarm
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
double a=sc.nextDouble();
double b=sc.nextDouble();
double c;
c=a*b;
System.out.format("%.5f",c);
}
}
