package com.sh.java6.thread;

import com.sh.java6.thread.One.innerClass;

/**
 * @author aditya
 *
 */
public class ThestInnerClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ThestInnerClass inner = new ThestInnerClass();
		inner.display();

	}

	/**
	 * 
	 */
	private void display() {
		One inn = new One(); 
		for(int i=0;i<=2;i++){
			inn.startThread("one");			
		}
		
		innerClass innn = new One.innerClass();
		for(int i=0;i<=2;i++){
			innn.run();			// it is calling run method in same thread ; so no multi-threading
		}
		for(int i=0;i<=2;i++){
			innn.start();	 // given exception in second loop because same thread instance trying to start again		
		}
	}
	
}