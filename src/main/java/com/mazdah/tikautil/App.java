package com.mazdah.tikautil;

import java.io.File;
import java.io.IOException;

import org.apache.tika.Tika;
import org.apache.tika.exception.TikaException;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
      //Assume sample.txt is in your current directory		        
        File file = new File("sample.xls");
        
        //Instantiating Tika facade class
        Tika tika = new Tika();
        String filecontent;
		try {
			filecontent = tika.parseToString(file);
			System.out.println("Extracted Content: " + filecontent);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TikaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
