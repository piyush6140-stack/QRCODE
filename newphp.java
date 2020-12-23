package geolife.piyush.com;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class newphp {
public static void newphp(String Filen,String url)
    {
        /*Scanner fname=new Scanner (System.in);
        System.out.println ("Enter File Name:");
        String Filen=fname.nextLine ();
        System.out.println ("Enter url");
        String url=fname.nextLine ();
        //String url="https://www.google.com/";*/
	getlc s=new getlc();
	String lc=s.lphp();
    try (FileWriter F1 = new FileWriter (lc+"\\"+"\\"+Filen+".php")) {
	
	
        F1.write ("<?php \n");
        F1.write ("header(\"Location:"+url+"\");\n");
        F1.write("exit;\n?> ");
        F1.close();
    }
	catch(IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    }   
public static void main(String[] args)
{
newphp("w","y");
}

}

