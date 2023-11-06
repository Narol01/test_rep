package practice.toDoList;

public enum MenuTask {
    ADD_RECORD("Добавить запись"),
    VIEW_RECORDS("Посмотреть все записи"),
    DELETE_RECORD("Удалить запись (по номеру)"),
    EXIT("Выйти");

    private String type;

    MenuTask(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
    public static void printMenu(){
        MenuTask[] menu = MenuTask.values();
        for (MenuTask task1 : MenuTask.values()) {
            System.out.println(task1.ordinal() + 1 + ". " + task1.getType());
        }
    }
}
