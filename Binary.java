import java.util.Scanner;
class Binary
{ 
            public static void main(String args[]) 
        { 
                   int r=0,c=0,num,b; 
              Scanner sl=new Scanner(System.in); 
              num=sl.nextInt(); 
              b= num; 
              while(num>0) 
                   { 
                      if((num %10==0)|| (num%10==1)) 
                         c++; 
                         r++; 
                         num=num/10; 
                   } 
                      if(c==r) 
               System.out.println("yes"); 
               else 
               System.out.println("no"); 
           } 
}
