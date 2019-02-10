package com.sh.java6.listener;


public class Main {

	final static String DEFAULT_CONFIG = "/home/impadmin/aditya/data/test_clean.txt";

	public static void listenForChanges()
	{
		int fileChangesDelay = 2000;
		
		if (fileChangesDelay > 0) {
			
			// System Properties
			FileMonitor.getInstance().addFileChangeListener(new SystemGlobalsListener(),DEFAULT_CONFIG, fileChangesDelay);

        }
	}

	public static void main(String[] args) {
		listenForChanges();
		
	}
}
