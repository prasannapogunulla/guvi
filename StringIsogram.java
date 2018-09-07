import java.util.Scanner;
class StringIsogram
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
isIsogram(str);
}
static void isIsogram(String s)
{
String[] ary=s.split("");
Set<String> mySet=new HashSet<String>(Arrays.asList(ary));
if(s.length()==mySet.size())
{
System.out.println("Yes");
}
else
{
System.out.println("No");
}
}
}
