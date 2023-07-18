import java.util.*;
public class sumofdigits{
    
   public static void main(String [] args){
       long sum = 0,m;
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the digit");
                m = sc.nextInt();
                long digit = m;
                while(m>0){
                    long n = m%10;
                   sum = sum + n;
                    m = m/10;

                }
                System.out.println("sum of digits of " + digit + "is " + sum);



   }




}