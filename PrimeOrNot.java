import java.util.Scanner;
class PrimeOrNot
{
    public static void main(String[] args) 
    {
        int num;
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        boolean flag = false;
        for(int i = 2; i <= num/2; ++i)
        {
            if(num % i == 0)
            {
                flag = true;
                break;
            }
        }

        if (!flag)
            System.out.println("yes");
        else
            System.out.println("no");
    }
}
