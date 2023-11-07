package practice.highSchool.model;

public class Aspirant extends Member {
    String direction;

    public Aspirant(int id, String firstName, String lastName, String direction) {
        super(id, firstName, lastName);
        this.direction = direction;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    @Override
    public String toString() {
        return "Aspirant{" +
                "direction='" + direction
                + super.toString();
    }
}