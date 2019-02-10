package com.sh.java6;

import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;


public class PrintCharacters {
	public static void main(String[] args)
	   {
	      byte[] bRay = null;
	      char quote = '"';
	      int ndx;
	      String sInitial = "Enc" + "\u20AB";

	      try { bRay = sInitial.getBytes("UTF-16"); }
	      catch( UnsupportedEncodingException  uee )
	      {
	        System.out.println( "Exception: "  + uee);
	      }

	      System.out.println( quote + sInitial + quote + 
	               " String as UTF-16, " + 
	                "bRay length: " + bRay.length + "." );
	      for( ndx = 0; ndx < bRay.length; ndx++ )
	      {
	        System.out.print( Integer.toHexString( bRay[ ndx++ ] ) + " " );
	        System.out.print( Integer.toHexString( bRay[ ndx ] ) + "   " );
	      }

	      System.out.println("\n");

	      OutputStreamWriter osw = new OutputStreamWriter( System.out );

	      bRay = sInitial.getBytes();
	      System.out.println( quote + sInitial + quote + 
	               " String as platform default - " + 
	                 osw.getEncoding() + 
	                ", bRay length: " + bRay.length + "." );
	      for( ndx = 0; ndx < bRay.length; ndx++ )
	      {
	        System.out.print( Integer.toHexString( bRay[ ndx ] ) + "   " );
	      }

	      System.out.println("\n");

	      try 
	      {
	        sInitial = new String( sInitial.getBytes("UTF-8"), "UTF-8");
	        bRay = sInitial.getBytes("UTF-8");
	      }
	      catch( UnsupportedEncodingException  uee )
	      {
	        System.out.println( "Exception: "  + uee);
	      }

	      System.out.println( quote + sInitial + quote + 
	               " String as UTF-8, " + 
	                "bRay length: " + bRay.length + "." );

	      for( ndx = 0; ndx < bRay.length; ndx++ )
	      {
	        System.out.print( Integer.toHexString( bRay[ ndx ] ) + "   " );
	      }

	   }

}
