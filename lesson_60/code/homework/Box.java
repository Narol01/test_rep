package homework;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Box implements Iterable<Parcel>{

    List<Parcel> parcels;

    public Box(int numParcels) {
        Random random = new Random();
        this.parcels = Stream.generate(() -> new Parcel(random.nextDouble(0,2))) // Parcel weight between 1 and 2 kg
                .limit(numParcels)
                .collect(Collectors.toList());
    }

    public int quantity() {
        return parcels.size();
    }

    @Override
    public String toString() {
        return "\nBox have " + parcels;
    }

    @Override
    public Iterator<Parcel> iterator() {
        return parcels.iterator();
    }
}