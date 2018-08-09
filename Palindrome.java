class Palindrome
{
public static void main(String args[])
{
int num=121,reversedInteger=0,remainder,originalInteger;
originalInteger=num;
while(num!=0)
{
remainder=num%10;
reversedInteger=reversedInteger*10+remainder;
num/=10;
}
if(originalInteger==reversedInteger)
{
System.out.println("yes");
}
else
{
System.out.println("No");
}
}
}
