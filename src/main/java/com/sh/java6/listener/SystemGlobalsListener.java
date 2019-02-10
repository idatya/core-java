package com.sh.java6.listener;

public class SystemGlobalsListener implements FileChangeListener
{
	final static String DEFAULT_CONFIG = "/home/impadmin/aditya/data/test_clean.txt";
	public void fileChanged(String filename)
	{
		
        System.out.println("Reloading........ "+ filename);

        Main.listenForChanges();
    }
	
	
	
	
	
}
