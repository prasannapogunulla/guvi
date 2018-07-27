public class Demo
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int year=sc.nextInt();
boolen flag=false;
if(year%400==0)
{
flag=true;
}
else if(year%100==0)
{
flag=flase;
}
else if(year%4==0)
{
flag=true;
}
else
{
flag=false;
}
if(flag)
{
System.out.println("no");
}
else
{
System.out.println("yes");
}
}
}


