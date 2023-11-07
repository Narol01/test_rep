package practice.toDoList;

import practice.toDoList.dao.ToDoList;
import practice.toDoList.dao.ToDoListImpl;
import practice.toDoList.model.Task;


import java.util.Arrays;
import java.util.Scanner;


public class ToDoAppl {
    public static void main(String[] args) {
        ToDoList toDoList;
        toDoList = new ToDoListImpl(5);
        Task[] taski;
        taski = new Task[4];
        taski[0] = new Task(1, "write", 1);
        taski[1] = new Task(2, "write", 2);
        for (int i = 0; i < taski.length; i++) {
            toDoList.addRecords(taski[i]);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to ToDoList Menu");
        while (true) {
            MenuTask.printMenu();
            System.out.print("Выберите действие: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1: {
                    while (true) {
                        System.out.print("Ввод дaнных");
                        System.out.print(" \nВведите task:");
                        String task = scanner.next();
                        Task task1 = new Task(toDoList.qtv()+1, task,toDoList.qtv()+1);
                        toDoList.addRecords(task1);
                        toDoList.viewRecords();
                        System.out.println("Дополнить ещё \n да-продожить \n нет-закончить");
                        String a = scanner.next();
                        if (a.equals("нет")) {
                            break;
                        }
                    }
                }
                case 2: {
                    System.out.println("Your tasks: ");
                    toDoList.viewRecords();
                    break;
                }
                case 3: {
                    System.out.print("Введите номер записи для удаления: ");
                    int recordNumber = scanner.nextInt();
                    if (taski[recordNumber] == null) {
                        System.out.println("Список записей пуст. Нечего удалять.");
                    } else {
                        if (recordNumber < 1 || recordNumber > taski.length) {
                            System.out.println("Неверный номер записи.");
                        } else {
                            toDoList.deleteRecords(recordNumber);
                            System.out.println("Запись удалена.");
                        }
                    }
                    break;
                }
                case 4: {
                    System.out.println("Выход из приложения.");
                    System.exit(0);
                    break;
                }

                //раскопировать cases;
                default: {
                    System.out.println("Неверный выбор");
                }
            }
        }
    }
}
