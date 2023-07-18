import java.lang.*;
import java.io.*;
import java.util.*;
 
class alpha {
 
// function to print string in sorted order
    static String sortString(String str) {
        char []arr = str.toCharArray();
        Arrays.sort(arr);
       
        String str2 = String.valueOf(arr);
        return str2;
    }
 
// Driver program to test above function
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
System.out.println("Enter Any word");
        String s = sc.nextLine();
        String newalpha = sortString(s);
          String  nstr="";
        char ch;   
      for (int i=0; i<newalpha.length(); i++)
      {
        ch= newalpha.charAt(i); //extracts each character
        nstr= ch+nstr; //adds each character in front of the existing string
      }
       System.out.println("Alphabetical Order :" +newalpha);
      System.out.println("Reversed word: "+ nstr);
    }
}