package com.sh.java8.stream;

import static java.util.stream.Collectors.groupingBy;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import static java.util.Comparator.comparing;

import com.sh.java8.common.Task;
import com.sh.java8.common.TaskType;

public class StreamDemo2 {
	public List<String> allReadingTasks(List<Task> tasks) {
		return tasks.stream().filter(task -> task.getType() == TaskType.READING).sorted(comparing(Task::getCreatedOn))
				.map(Task::getTitle).collect(Collectors.toList());

	}

	public List<String> allReadingTasksSortedByCreatedOnDesc(List<Task> tasks) {
		return tasks.stream().filter(task -> task.getType() == TaskType.READING)
				.sorted(comparing(Task::getCreatedOn).reversed()).map(Task::getTitle).collect(Collectors.toList());

	}

	public List<Task> allDistinctTasks(List<Task> tasks) {
		return tasks.stream().distinct().collect(Collectors.toList());
	}

	public List<String> topN(List<Task> tasks, int n) {
		return tasks.stream().filter(task -> task.getType() == TaskType.READING).sorted(comparing(Task::getCreatedOn))
				.map(Task::getTitle).limit(n).collect(Collectors.toList());
	}

	public long countAllReadingTasks(List<Task> tasks) {
		return tasks.stream().filter(task -> task.getType() == TaskType.READING).count();
	}

	public List<String> allDistinctTags(List<Task> tasks) {
		return tasks.stream().flatMap(task -> task.getTags().stream()).distinct().collect(Collectors.toList());
	}

	public boolean isAllReadingTasksWithTagBooks(List<Task> tasks) {
		return tasks.stream().filter(task -> task.getType() == TaskType.READING)
				.allMatch(task -> task.getTags().contains("books"));
	}

	public boolean isAnyReadingTasksWithTagJava8(List<Task> tasks) {
		return tasks.stream().filter(task -> task.getType() == TaskType.READING)
				.anyMatch(task -> task.getTags().contains("java8"));
	}

	public String joinAllTaskTitles(List<Task> tasks) {
		return tasks.stream().map(Task::getTitle).reduce((first, second) -> first + " *** " + second).get();
	}

	public static void main(String[] args) {

		Map<String, List<Integer>> numbersPerThread = IntStream.rangeClosed(1, 160).parallel().boxed()
				.collect(groupingBy(i -> Thread.currentThread().getName()));

		numbersPerThread.forEach((k, v) -> System.out.println(String.format("%s >> %s", k, v)));
	}
}