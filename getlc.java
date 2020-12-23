package geolife.piyush.com;

import java.io.*; 
import java.util.*; 
public class getlc 
{ 
public static String t1;
public static String t2;
  public static String lphp() 
  { 
try
{   
    File file=new File("C:\\Users\\abhii\\Desktop\\Geolife Piyush-1\\src\\geolife\\piyush\\com\\dir.txt"); 
    Scanner sc = new Scanner(file);
	t1= sc.nextLine(); 
}
catch(FileNotFoundException e)
{
System.out.println(e);
}

		return t1; 
  }
public static String lqr() 
  { 
try{
    
    File file=new File("C:\\Users\\abhii\\Desktop\\Geolife Piyush-1\\src\\geolife\\piyush\\com\\dir.txt"); 
    Scanner sc = new Scanner(file);
	String t= sc.nextLine();
	t2=sc.nextLine(); 
    }
catch(FileNotFoundException e)
{
System.out.println(e);
}

		return t2; 
  }
public static void main(String [] args)	
{
	String s=lphp();
	System.out.println(s);
	String s1=lqr();
	System.out.println(s1);
}
} 