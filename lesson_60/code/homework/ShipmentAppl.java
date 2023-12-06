package homework;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ShipmentAppl {
    public static void main(String[] args) {
        Random random = new Random();
        int numContainers = random.nextInt(11) + 10; // От 10 до 20 контейнеров

        List<Container> containers = Stream.generate(() ->
                        new Container("Container " + (numContainers), random.nextInt(11) + 10))
                .limit(numContainers)
                .collect(Collectors.toList());

        containers.forEach(container -> {
            System.out.println("Container: " + container.label);
            container.boxes.forEach(box -> {
                System.out.println("  Box with " + box.parcels.size() + " parcels");
                box.parcels.forEach(parcel ->
                        System.out.println("    Parcel with weight: " + parcel.weight + " kg"));
            });
            System.out.println();
        });

        int totalParcels = containers.stream()
                .flatMap(container -> container.boxes.stream())
                .mapToInt(box -> box.parcels.size())
                .sum();

        double totalWeight = containers.stream()
                .flatMap(container -> container.boxes.stream())
                .flatMap(box -> box.parcels.stream())
                .mapToDouble(parcel -> parcel.weight)
                .sum();

        System.out.println("Total parcels: " + totalParcels);
        System.out.println("Total weight: " + totalWeight + " kg");
    }
}
