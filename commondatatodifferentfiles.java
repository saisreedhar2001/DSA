import java.io.*;  

public class commondatatodifferentfiles{
	public static void main(String args[])throws Exception{    
          CharArrayWriter out=new CharArrayWriter();    
          out.write("hi hello welcome namesthe"); 
            
          FileWriter f1=new FileWriter("D:\\DSA\\a.txt");
          FileWriter f2=new FileWriter("D:\\DSA\\b.txt");

             FileWriter f3=new FileWriter("D:\\DSA\\c.txt");
           FileWriter f4=new FileWriter("D:\\DSA\\d.txt");
   
          out.writeTo(f1);    
          out.writeTo(f2);    
          out.writeTo(f3);    
          out.writeTo(f4);    
          f1.close();    
          f2.close();    
          f3.close();    
          f4.close();    
          System.out.println("Success...");    
         }   

} 