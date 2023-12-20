package family_budget.model;

public enum Menu {
    BUDGET(1, " - Add Budget - "),
    ALL(2, " - View of purchases - "),
    LOAD(3, " - Load new purchases - "),
    REMOVE(4, " - Remove purchase - "),
    STORES(5, " - Searching purchases by store - "),
    PERSONS(6, " - Searching purchases by person - "),
    PERIOD(7, " - Searching purchases by period - "),
    CHECK(8, " - Check your current budget - "),
    EXIT(9, " - Exit");
    ;
    // поля
    private int menuItem;
    private String action;

    Menu(int menuItem, String action) {
        this.menuItem = menuItem;
        this.action = action;
    }

    public static void printMenu(){
        Menu[] menu = Menu.values();
        for (int i = 0; i < menu.length; i++) {
            System.out.print(menu[i].menuItem + " - " + menu[i].action + " | ");
        }
        System.out.println();
    }
}