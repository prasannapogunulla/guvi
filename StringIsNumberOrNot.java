import java.util.Scanner;
class StringIsNumberOrNot
{
    public static void main(String[] args) 
    {

        String string;
        Scanner sc=new Scanner(System.in);
        string=sc.nextLine();
        boolean numeric = true;

        try {
            Double num = Double.parseDouble(string);
        } catch (NumberFormatException e) {
            numeric = false;
        }

        if(numeric)
            System.out.println("yes");
        else
            System.out.println("No");
    }
}
