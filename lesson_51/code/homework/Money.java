package homework;

public enum Money {
    USD (1, "Dollar", 1.09), UAN(2, "Hryvnia", 0.025), RUB (3, "Ruble", 0.010), EUR (4, "Euro", 1);

    private int number;
    private String name;
    private double course;

    Money(int number, String name, double course) {
        this.number = number;
        this.name = name;
        this.course = course;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public double getCourse() {
        return course;
    }

    @Override
    public String toString() {
        return number + " : Currency name " + name  + ", course = " + course;
    }

}
