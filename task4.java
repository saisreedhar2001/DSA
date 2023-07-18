import java.util.*;

public class task4{

	public static void main(String[] args){
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter Number");
            int number = sc.nextInt();

            for(;;){
            	if(number<0){
            	System.out.println("Negative Number");

            	System.out.println("Enter Number");
            number = sc.nextInt();

            }else if(number == 999){
               
                   System.out.println("Stop");
                   break;
              
            }else{
                System.out.println("positive number");
                System.out.println("Binary Eqvilent is " + Integer.toBinaryString(number));
                break;
            }
            }

            

	}
}