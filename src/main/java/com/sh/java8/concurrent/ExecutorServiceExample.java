package com.sh.java8.concurrent;

import java.util.Date;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class ExecutorServiceExample {
	public static void main(String[] args) {
		final Runnable stuffToDo = new Thread() {
			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println(new Date());
				}
			}
		};

		final ExecutorService executor = Executors.newSingleThreadExecutor();
		final Future future = executor.submit(stuffToDo);
		executor.shutdown(); // This does not cancel the already-scheduled task.
		try {
			future.get(1, TimeUnit.MINUTES);
		} catch (InterruptedException ie) {
			/* Handle the interruption. Or ignore it. */
		} catch (ExecutionException ee) {
			/* Handle the error. Or ignore it. */
		} catch (TimeoutException te) {
			/* Handle the timeout. Or ignore it. */
		}
		if (!executor.isTerminated())
			executor.shutdownNow();
	}
}
