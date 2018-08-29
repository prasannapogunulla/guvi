import java.util.Scanner;
 class Simple_Interest
{
    public static void main(String args[]) 
    {
        int p, r, t;
        Scanner s = new Scanner(System.in);
       
        p = s.nextInt();
       
        r = s.nextInt();
        
        t = s.nextInt();
        
        int si = (p * t * r) / (100);
        System.out.print(si);
    }
}
