package com.sh.java6.thread;


/**
 * @author aditya
 *
 */
public class One {
	
	
	
	Thread thread = new Thread(new Runnable() {
		
		public void run() {
			for(int i=0;i<=9;i++){					
			System.out.println("In Outer class "+i+"."+i);
			}
		}
	});
	
	
	
	public void startThread(final String str){
		if(!thread.isAlive()){
			System.out.println("Trying to start thread first time from startThread.");
			thread.start();
		}else{
			System.out.println("Thread allready running from startThread.");
			
		}
		
		
	}
	
	
	/**
	 * 
	 */
	public void check() {
		
			if(!thread.isAlive()){
				System.out.println("Trying to start thread first time.");
				thread.start();
			}else{
				System.out.println("Thread allready running from cheack.");
				
			}
			
			
		}	


	public static class innerClass extends Thread{
		
		public void run(){
			for(int sec=0;sec<=9;sec++){					
				System.out.println("In Inner class :"+sec+"."+sec);
				}
			}
		
	} 
}
