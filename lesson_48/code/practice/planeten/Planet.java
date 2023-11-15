package practice.planeten;

public class Planet implements Comparable<Planet>{
    String name;
    int distance;
    double mass;
    int numberOfSatellites;

    public Planet(String name, int distance, double mass, int numberOfSatellites) {
        this.name = name;
        this.distance = distance;
        this.mass = mass;
        this.numberOfSatellites = numberOfSatellites;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public int getNumberOfSatellites() {
        return numberOfSatellites;
    }

    public void setNumberOfSatellites(int numberOfSatellites) {
        this.numberOfSatellites = numberOfSatellites;
    }

    @Override
    public String toString() {
        return "\nPlanet{" +
                "name='" + name + '\'' +
                ", distance=" + distance +
                ", mass=" + mass +
                ", numberOfSatellites=" + numberOfSatellites +
                '}';
    }

    @Override
    public int compareTo(Planet o) {
        return this.distance-o.distance;
    }
    public int compareToAl(Planet o) {
        return this.name.compareTo(o.name);
    }
    public int compareToMas(Planet o) {
        return Double.compare(this.mass,o.mass);
    }
    public int compareToQu(Planet o) {
        return this.numberOfSatellites-o.numberOfSatellites;
    }
}
