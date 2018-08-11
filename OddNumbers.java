class OddNumbers
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
  int a=nextInt();
  int b=nextInt();
  for(int i=a+1;i<b;i++)
  {
    if(i%2!=0)
    {
      System.out.println(i);
    }
  }
}
}
