
import java.io.Console;  
public class consoleusernamepassword{

	public static void main(String[] args)
    {
        // Create the console object
        Console cnsl
            = System.console();
 
        // Read line
        String str = cnsl.readLine(
            "Enter username : ");
  
        // Print username
        System.out.println(
            "Username : " + str);
  
        // Read password
        // into character array
        char[] ch = cnsl.readPassword(
            "Enter password : ");
  
        // Print password
        String pass = String.valueOf(ch);   
        System.out.println("Password is: " + pass);
    }
}