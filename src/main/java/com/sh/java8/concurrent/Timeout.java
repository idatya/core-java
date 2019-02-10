package com.sh.java8.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Timeout implements Callable<String> {

	@Override
	public String call() throws Exception {
		
		// In a Callable<Object>
	    long startTime = System.currentTimeMillis();
	    while(System.currentTimeMillis() - startTime < 5000) { // wait for max 5 seconds.
	        /*if(resource.isAvailable()) {
	            // Do something with the resource
	            return someValue;
	        }*/
	    }

	    //throw new TimeoutException("Resource could not be acquired");
		
		return "done";
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ExecutorService service = Executors.newSingleThreadExecutor();

		try {
			service.submit(new Timeout()).get(2, TimeUnit.SECONDS);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}