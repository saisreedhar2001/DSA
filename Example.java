import java.util.*;
public class Example
{
 public static void main(String[] args)
 {	
Scanner s=new Scanner(System.in);
int a;
System.out.println("enter the a value");
a=s.nextInt();
 int b;
System.out.println("enter the b value");
b=s.nextInt();
 int c;
 System.out.println("enter the c value");
  c=s.nextInt();
 double temp1 = Math.sqrt(b * b - 4 * a * c);
 double root1 = (-b +  temp1) / (2*a) ;
 double root2 = (-b -  temp1) / (2*a) ;
 System.out.println("The roots of the Quadratic Equation \"2x2 + 6x + 4 = 0\" are "+root1+" and "+root2);
 }
}
