import java.util.Scanner;
  
public class numberpattern
{            
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in); //Taking rows value from the user    
        System.out.println("Enter the number of rows: ");    
        int rows = sc.nextInt();         
        for (int i = 1; i <= 5; i++) 
        {
            for(int k =1; k <=(5 - i);k++){
                System.out.println("  ");
            }
            for (int j = 1; j <= i; j++)
            {
                System.out.print(i);
            }
               
            System.out.println();
        }         
        sc.close();
    }
}