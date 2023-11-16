package practice.country;

import java.util.Objects;

public class Country implements Comparable<Country>{
    String name;
    int population;
    String continent;

    public Country(String name, int population, String continent) {
        this.name = name;
        this.population = population;
        this.continent = continent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country = (Country) o;
        return Objects.equals(name, country.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "\nCountry{" +
                "name='" + name + '\'' +
                ", population=" + population +
                ", continent='" + continent + '\'' +
                '}';
    }

    @Override
    public int compareTo(Country o) {
        return this.name.compareTo(o.name);
    }
    public int compareToPop(Country o) {
        return this.population-(o.population);
    }
    public int compareToCont(Country o) {
        int res=this.continent.compareTo(o.continent);
        return res!=0 ? res : (o.population)-this.population;
    }
}
