package practice.toDoList.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import practice.toDoList.dao.ToDoList;
import practice.toDoList.dao.ToDoListImpl;
import practice.toDoList.model.Task;

import static org.junit.jupiter.api.Assertions.*;

class ToDoListImplTest {
    ToDoList toDoList;

    Task[] task;

    @BeforeEach
    void setUp() {
        toDoList = new ToDoListImpl(5);
        task = new Task[4];
        task[0] = new Task(1, "write", 1);
        task[1] = new Task(2, "write", 2);
        for (int i = 0; i < task.length; i++) {
            toDoList.addRecords(task[i]);
        }
    }

    @Test
    void addRecords() {assertFalse(toDoList.addRecords(null));
        assertFalse(toDoList.addRecords(task[2]));
        Task task1=new Task(3,"write",3);
        assertTrue(toDoList.addRecords(task1));
    }

    @Test
    void viewRecords() {
        toDoList.viewRecords();
    }

    @Test
    void deleteRecords() {
        assertEquals(task[0] ,toDoList.deleteRecords(1));
        assertEquals(1, toDoList.qtv());
        assertNull(toDoList.deleteRecords(1));

    }
}