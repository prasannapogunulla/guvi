import java.util.Scanner;
class TimeInHoursMinute
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
int hours=t/60;
int minutes=t%60;
System.out.println(hours+" "+minutes);
}
}
