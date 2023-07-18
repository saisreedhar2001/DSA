import java.util.*;
class password{

public static void main(String [] args){

     System.out.println("Enter the number");
     Scanner sc = new Scanner(System.in);
     int number = sc.nextInt();
     int length = String.valueOf(number).length();
     int arrayoriginal [] = new int[length];
     int powerarray [] = new int[length];

     for(int i = 9; i >= 0; i--){

     	arrayoriginal[i] = number % 10;
        number = number / 10;
     }
     System.out.println(arrayoriginal);



}

}