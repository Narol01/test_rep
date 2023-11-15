package practice.planeten;

import java.util.ArrayList;
import java.util.List;

public class PlanetAppl {
    public static void main(String[] args) {
        List<Planet> planets=new ArrayList<>();
        planets.add(new Planet("Меркурий",46,3.302*(Math.pow(10,23)),0));
        planets.add(new Planet("Венера",107,4.869*(Math.pow(10,24)),0));
        planets.add(new Planet("Земля",147,5.974*(Math.pow(10,24)),1));
        planets.add(new Planet("Марс",206,6.419*(Math.pow(10,23)),2));
        planets.add(new Planet("Юпитер",740,1.899*(Math.pow(10,27)),62));
        planets.add(new Planet("Сатурн",13495,5.685*(Math.pow(10,26)),34));
        planets.add(new Planet("Уран",27356,8.685*(Math.pow(10,25)),27));
        planets.add(new Planet("Нептун",44596,1.024*(Math.pow(10,26)),13));
        planets.add(new Planet("Плутон",44768,1.3*(Math.pow(10,22)),5));
        planets.sort(Planet::compareTo);
        System.out.println(planets);
        System.out.println("-------Sort by Alphabet-----");
        planets.sort(Planet::compareToAl);
        System.out.println(planets);
        System.out.println("-------Sort by Mass-----");
        planets.sort(Planet::compareToMas);
        System.out.println(planets);
        System.out.println("-------Sort by Numbers-----");
        planets.sort(Planet::compareToQu);
        System.out.println(planets);

    }
}
