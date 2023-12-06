package practice.pomegranate;

import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Box implements Iterable<Pomegranate> {
    String name;
    List<Pomegranate> granates;

    public Box(String name, int numBoxes) {
        this.name = name;
        Random random = new Random();
        this.granates = IntStream.range(0, numBoxes)
                .mapToObj(i -> new Pomegranate(random.nextInt(6) + 5))
                .collect(Collectors.toList());
    }

    @Override
    public Iterator<Pomegranate> iterator() {
        return granates.iterator();
    }
}
