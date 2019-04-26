package com.sh.java8.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.sh.java8.common.CommonUtils;
import com.sh.java8.common.Task;
import com.sh.java8.common.TaskType;

public class StreamDemo {
	
	public static void main(String[] args) {
		java8();
		java7();
	}

	/*
	 * Java 8
	 */
	public static void java8() {
		List<Task> tasks = CommonUtils.getTasks();

		List<String> readingTasks = tasks.stream().filter(task -> task.getType() == TaskType.READING)
				.sorted((t1, t2) -> t1.getTitle().length() - t2.getTitle().length()).map(Task::getTitle)
				.collect(Collectors.toList());

		readingTasks.forEach(System.out::println);
		
		System.out.println();
	}
	

	/*
	 * Java 7
	 */
	public static void java7() {
		List<Task> tasks = CommonUtils.getTasks();
		List<Task> readingTasks = new ArrayList<>();
		for (Task task : tasks) {
			if (task.getType() == TaskType.READING) {
				readingTasks.add(task);
			}
		}
		Collections.sort(readingTasks, new Comparator<Task>() {
			@Override
			public int compare(Task t1, Task t2) {
				return t1.getTitle().length() - t2.getTitle().length();
			}
		});
		for (Task readingTask : readingTasks) {
			System.out.println(readingTask.getTitle());
		}
	}
}
