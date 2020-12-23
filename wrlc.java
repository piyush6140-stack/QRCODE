package geolife.piyush.com;

import java.io.*; 
import java.util.*; 
public class wrlc
{
public static String t1;
public static String t2;
public static void wrphp(String php)
{
	getlc temp=new getlc();
	t2=temp.lqr();
	File de=new File("C:\\Users\\abhii\\Desktop\\Geolife Piyush-1\\src\\geolife\\piyush\\com\\dir.txt");
	de.delete();
	try {
      FileWriter myWriter = new FileWriter("C:\\Users\\abhii\\Desktop\\Geolife Piyush-1\\src\\geolife\\piyush\\com\\dir.txt");
      myWriter.write(php+"\n");
      myWriter.write(t2);	
      myWriter.close();
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
}
public static void wrqr(String qr)
{
	getlc temp=new getlc();
	t1=temp.lphp();
	File de=new File("C:\\Users\\abhii\\Desktop\\Geolife Piyush-1\\src\\geolife\\piyush\\com\\dir.txt");
	de.delete();
	try {
      FileWriter myWriter = new FileWriter("C:\\Users\\abhii\\Desktop\\Geolife Piyush-1\\src\\geolife\\piyush\\com\\dir.txt");
      myWriter.write(t1+"\n");
      myWriter.write(qr);	
      myWriter.close();
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
}

public static void main(String [] args)
{

wrphp("A");
wrqr("B");

}
}
