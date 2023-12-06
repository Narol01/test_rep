package practice.pomegranate;

import java.util.List;
import java.util.OptionalInt;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PomegranateAppl {
    public static void main(String[] args) {

        Random random = new Random();
        int numBox = random.nextInt(100, 201); // От 100 до 200 boxes

        List<Integer> boxNumbers = IntStream.rangeClosed(1, numBox)
                .boxed()
                .collect(Collectors.toList());

        List<Box> boxes = Stream.generate(() ->
                        new Box("From Turkey ", random.nextInt(10, 21)))
                .limit(numBox)
                .collect(Collectors.toList());

        IntStream.range(0, numBox).forEach(index -> {
            Box box = boxes.get(index);
            System.out.println("Boxes " + boxNumbers.get(index) + " : " + box.name);
            box.granates.forEach(pomegranate -> {
                System.out.println("Pomegranate in Box " + pomegranate.seeds.size());
                pomegranate.seeds.forEach(seed ->
                        System.out.println("Seed in Pomegranates with " + seed.weight + " Gram"));
            });
            System.out.println();
        });

        int totalSeed = boxes.stream()
                .flatMap(box -> box.granates.stream())
                .mapToInt(pomegranate -> pomegranate.seeds.size())
                .sum();

        double totalWeight = boxes.stream()
                .flatMap(box -> box.granates.stream())
                .flatMap(pomegranate -> pomegranate.seeds.stream())
                .mapToDouble(seed -> seed.weight)
                .sum();

        System.out.println("Total seed: " + totalSeed);
        System.out.println("Total weight: " + totalWeight + " gram");

        //Рассчитайте максимальное количество семян в одной коробке.
        long max = boxes.stream()
                .flatMap(box -> box.granates.stream())
                .mapToLong(pomegranate -> pomegranate.seeds.size())
                .max()
                .orElse(0);
        System.out.println(max);


    }
}