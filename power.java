public class Demo
{
public static void main(String args[])
{
int base=2,exponent=3,result=1;
while(exponent!=0)
{
result*=base;
--exponent;
}
System.out.println("answer:"+result);
}
}
