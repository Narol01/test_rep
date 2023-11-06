package forum;

public enum MenuForum {

    ADD_DOCUMENTS("Add a record"),
    VIEW_DOCUMENTS("View all records"),
    QUANTITY_DOCUMENTS("Get the number of records"),
    EXIT("Exit");
    private String type;

    MenuForum(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
    public static void printMenu(){
        MenuForum[] menu = MenuForum.values();
        for (MenuForum task1 : MenuForum.values()) {
            System.out.println(task1.ordinal() + 1 + ". " + task1.getType());
        }
    }
}
