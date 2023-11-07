package practice.toDoList.dao;

import practice.toDoList.MenuTask;
import practice.toDoList.model.Task;

import java.util.Arrays;

public class ToDoListImpl implements ToDoList {
    private Task[] task;
    MenuTask menuTask;

    private int size;

    public ToDoListImpl(int capacity) {
        task = new Task[capacity];
        this.size = 0;
    }

    public Task findTask(int taskNumber) {
        for (int i = 0; i < size; i++) {
            if (task[i].getTaskNumber() == taskNumber) {
                Task findedTask = task[i];
                return findedTask;
            }
        }
        return null;
    }

    public boolean addRecords(Task tasks) {
        if (tasks == null || size == task.length || findTask(tasks.getTaskNumber()) != null) {
            return false;
        }
        task[size] = tasks;
        size++;
        return true;
    }

    @Override
    public void viewRecords() {
        for (int i = 0; i < size; i++) {
            System.out.println(task[i]);
        }
        System.out.println("You have " + size + " tasks.");
    }

    @Override
    public Task deleteRecords(int taskNumber) {
        for (int i = 0; i < size; i++) {
            if (task[i].getTaskNumber() == taskNumber) {
                Task removedTask = task[i];
                for (int j = i; j < size - 1; j++) {
                    task[j] = task[j + 1];
                }
                task[size - 1] = null;
                size--;
                for (int j = 0; j < size; j++) {
                    task[j].setId(j);
                }
                return removedTask;
            }
        }
        return null;
    }

    @Override
    public void exit() {
        System.out.println("Выход из приложения.");

    }

    public int qtv() {
        return size;
    }
}
