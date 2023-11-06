package practice.toDoList.dao;

import practice.toDoList.model.Task;

public interface ToDoList {
    boolean addRecords(Task tasks);
    void viewRecords();
    Task deleteRecords(int id);
    int qtv();
    void exit();
}
