package homework.sports;

import java.util.Objects;

public class Athlete implements Comparable<Athlete> {
    private String Lastname;
    private String name;
    private int regNumber;
    private String club;
    private double resultInSeconds;

    public Athlete(String lastname, String name, int regNumber, String club, double resultInSeconds) {
        Lastname = lastname;
        this.name = name;
        this.regNumber = regNumber;
        this.club = club;
        this.resultInSeconds = resultInSeconds;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(int regNumber) {
        this.regNumber = regNumber;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        club = club;
    }

    public double getResultInSeconds() {
        return resultInSeconds;
    }

    public void setResultInSeconds(double resultInSeconds) {
        this.resultInSeconds = resultInSeconds;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Athlete athlete = (Athlete) o;
        return regNumber == athlete.regNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(regNumber);
    }

    @Override
    public String toString() {
        return "\nAthlete{" +
                "Lastname='" + Lastname + '\'' +
                ", name='" + name + '\'' +
                ", regNumber=" + regNumber +
                ", Club='" + club + '\'' +
                ", resultInSeconds=" + resultInSeconds +
                '}';
    }

    @Override
    public int compareTo(Athlete o) {
        return Double.compare(this.resultInSeconds,o.resultInSeconds);
    }
}
