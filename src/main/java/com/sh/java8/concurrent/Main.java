package com.sh.java8.concurrent;

import java.util.Date;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main implements Callable<String> {

	public static void main(String[] args) {
		 ScheduledExecutorService executor = Executors.newScheduledThreadPool(2); 
		 final Future handler = executor.submit(new Timeout());
		 executor.schedule(new Runnable(){
		     public void run(){
		         handler.cancel(true);
		     }      
		 }, 2, TimeUnit.SECONDS);
	}

	@Override
	public String call() throws Exception {
		for (int i = 0; i < Integer.MAX_VALUE; i++) {
			System.out.println(new Date());
		}
		return "done";
	}

}
