import java.util.Scanner;
class SmallestOne
{
public static void main(String[] args)
{
    int smallest = 0;
    int large = 0;
    int num;
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    num = input.nextInt();
    smallest = num; 
    for (int i = 2; i < n; i++) 
    {
        num = input.nextInt();
       if (num < smallest) 
       {
            smallest = num;
        }
    }
   System.out.println(smallest);
}
}
