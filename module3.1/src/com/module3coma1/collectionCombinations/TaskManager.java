package com.module3coma1.collectionCombinations;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class TaskManager {

	ArrayList<String> executedTasks;

	public TaskManager() {
		this.executedTasks = new ArrayList<String>();
	}

	public void executeTasks(ArrayDeque<String> theQueue) {
		while(theQueue.size() > 0) {
			String theTask = theQueue.poll();//pobieranie zadania z kolekcji i konwertowanie go do zmiennej lokalnej theTask typu String
			System.out.println("Processing the task: " + theTask);
			executedTasks.add(theTask);
		}
		System.out.println("\nExecuted total " + executedTasks.size() + " tasks\n");
	}
}
