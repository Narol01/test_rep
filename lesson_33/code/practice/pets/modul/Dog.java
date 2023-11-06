package practice.pets.modul;

public class Dog  extends Pets{

    private int Hours;

    private double price;

    public Dog(int id, String name, String breed, int age, double weight, int hours, double price) {
        super(id, name, breed, age, weight);
        Hours = hours;
        this.price = price;
    }

    public int getHours() {
        return Hours;
    }

    public void setHours(int hours) {
        Hours = hours;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "Hours=" + Hours +
                ", price=" + price + super.toString();
    }
    @Override
    public double prices() {

        return Hours*price;
    }
}
