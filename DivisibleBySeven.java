import java.util.Scanner;
class DivisibleBySeven
{
    public static void main(String[] args) 
    {

        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();

        if (i%7 == 0) 
        {
            System.out.println("yes");
        } 
        else 
        {
        	System.out.println("no");
        }
           
    }
}
