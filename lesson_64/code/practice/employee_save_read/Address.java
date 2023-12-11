package practice.employee_save_read;

import java.io.Serializable;

public class Address  implements Serializable {
    private String city;
    private String street;
    private int building;
    private int aprt;

    public Address(String city, String street, int building, int aprt) {
        System.out.println("Constructor Address ifs working ");
        this.city = city;
        this.street = street;
        this.building = building;
        this.aprt = aprt;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getBuilding() {
        return building;
    }

    public void setBuilding(int building) {
        this.building = building;
    }

    public int getAprt() {
        return aprt;
    }

    public void setAprt(int aprt) {
        this.aprt = aprt;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", building=" + building +
                ", aprt=" + aprt +
                '}';
    }
}
