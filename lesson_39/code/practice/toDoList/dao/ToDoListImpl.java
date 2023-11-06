package practice.toDoList.dao;

import practice.toDoList.MenuTask;
import practice.toDoList.model.Task;

import java.util.Arrays;

public class ToDoListImpl implements ToDoList{
    private Task[] task;
    MenuTask menuTask;

    private int size;
    public ToDoListImpl(int capacity){
        task=new Task[capacity];
        this.size=0;
    }

    public Task findTask(int id) {
        for (int i = 0; i < size; i++) {
            if(task[i].getId() == id){
                return task[i];
            }
        }
        return null;
    }

    public boolean addRecords(Task tasks) {
        if(tasks == null || size == task.length || findTask(tasks.getId()) != null){
            return false;
        }
        task[size]=tasks;
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
            if(task[i].getTaskNumber()==taskNumber){
                Task deleted =task[i];
                task[i]=task[size-1];
                task[size-1]=null;
                size --;
                return deleted;
            }
        }
        return null;
    }

    @Override
    public void exit() {
        System.out.println("Выход из приложения.");

    }
    public int qtv(){
        return size;
    }
}
