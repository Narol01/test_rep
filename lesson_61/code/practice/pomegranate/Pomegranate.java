package practice.pomegranate;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Pomegranate implements Iterable<Seed> {

    List<Seed> seeds;

    public Pomegranate(int numParcels) {
        Random random = new Random();
        this.seeds = IntStream.range(0, numParcels)
                .mapToObj(i -> new Seed(random.nextDouble() * 2))
                .collect(Collectors.toList());
    }

    @Override
    public Iterator<Seed> iterator() {
        return seeds.iterator();
    }
}