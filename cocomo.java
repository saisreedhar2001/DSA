import java.io.*;
import java.util.Scanner;
public class cocomo {
	public static void main(String[] args){
		double effort,time,staff,productivity;
    int size,model;

   System.out.println("Enter size of project (in KLOC) :");
       Scanner sc = new Scanner(System.in);
        size = sc.nextInt();
       if(size>=2 && size<=50){
       	
          System.out.println( " The Mode is organic");
          double a = 2.4;
          double b = 1.05;
          double c = 2.5;
          double d = 0.38;
       effort=a* Math.pow(size,b);

         time=c*Math.pow(effort,d);

        staff=effort/time;

         productivity=size/effort;
         
      staff = Math.round(staff);
System.out.println("Effort = " + effort + " Person-Month");

System.out.println("Development time = " + time + " Months");
System.out.println("Average Staff Required = " + staff +  "Persons");
System.out.println("Productivity = " + productivity + " KLOC/Person-Month");

       }

        else if(size>50 && size<=300){
     	    //semi-detached
       System.out.println( " The Mode is semi-detached" );
       
          double a = 3.0;
          double b = 1.12;
          double c = 2.5;
          double d = 0.35;
       effort=a* Math.pow(size,b);

         time=c*Math.pow(effort,d);

        staff=effort/time;

         productivity=size/effort;
         
      staff = Math.round(staff);
System.out.println("Effort = " + effort + "Person-Month");

System.out.println("Development time = " + time + "Months");
System.out.println("Average Staff Required = " + staff + "Persons");
System.out.println("Productivity = " + productivity + "KLOC/Person-Month");

              }
         else if(size>300){
        //embedded
       System.out.println( " The Mode is embedded");
       
      double a = 3.6;
          double b = 1.20;
          double c = 2.5;
          double d = 0.32;
       effort=a* Math.pow(size,b);

         time=c*Math.pow(effort,d);

        staff=effort/time;

         productivity=size/effort;
         
      staff = Math.round(staff);
System.out.println("Effort = " + effort + "Person-Month");

System.out.println("Development time = " + time + "Months");
System.out.println("Average Staff Required = " + staff + "Persons");
System.out.println("Productivity = " + productivity + "KLOC/Person-Month");

                }

	}
	
}