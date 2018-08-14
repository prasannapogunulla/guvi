import java.util.Scanner;
class Wordcount
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String word;
word=sc.nextLine();
String data[];
int k=0;
data=word.split("");
for(int i=0;i<data.length;i++)
{
if(data[i].equals(" "))
{
k++;
}
}
System.out.println(k);
}
}
