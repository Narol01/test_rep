package practice.seasons;

public enum Season {

    WINTER(1,"Winter"),SPRING(2,"Spring"),SUMMER(3,"Summer"),AUTUMN(4,"Autumn") ;
    private  int number;
    private String name;

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    Season(int number, String name) {
        this.number = number;
        this.name = name;

    }
}
