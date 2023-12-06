package homework;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Box{

    List<Parcel> parcels;

    public Box(int numParcels) {
        Random random = new Random();
        this.parcels = IntStream.range(0, numParcels)
                .mapToObj(i -> new Parcel(random.nextDouble() * 2))
                .collect(Collectors.toList());
    }
}