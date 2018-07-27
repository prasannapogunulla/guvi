public class Demo
{
public static void main(String  args[])
{
int x,y,z;
System.out.println("enter three integers");
Scanner sc=new Scanner(System.in);
x=sc.nextInt();
y=sc.nextInt();
z=sc.nextInt();
if(x>y&&x>z)
System.out.println(1);
else if(y>x&&y>z)
System.out.println(-1);
else if(z>x&&z>y)
System.out.println(z);
else
System.out.println("three numbers are distinct");
}
}
