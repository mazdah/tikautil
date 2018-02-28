package com.mazdah.tikautil;

import java.io.File;
import java.io.IOException;

import org.apache.tika.Tika;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
      //assume example.mp3 is in your current directory
        File file = new File("sample.xls");//
        
        //Instantiating tika facade class 
        Tika tika = new Tika();
        
        //detecting the file type using detect method
        String filetype;
		try {
			filetype = tika.detect(file);
			System.out.println("FILE TYPE = " + filetype);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
