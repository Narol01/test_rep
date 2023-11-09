package homework.temperatura;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Temperatura {
    public static void main(String[] args) {
        int[] august={11,10,8,10,6,14,9};
        int[] november={13,13,15,9,8,11,14};
        int sumA=0;
        int sumN=0;
        int count=0;
        for (int i = 0; i < august.length; i++) {
            sumA+=august[i];
            sumN+=november[i];
            count=august.length+november.length;
        }
        double avg=(double) (sumA+sumN)/count;
        System.out.println(Arrays.toString(august));
        System.out.println(Arrays.toString(november));
        System.out.println("Среднее значение температуры за последние две недели "+avg);

        //Способ два при помощи обьеденения масива используя интерфейс IntStream
        int[] week=IntStream.concat(IntStream.of(august),(IntStream.of(november))).toArray();
        System.out.println(Arrays.toString(week));
        int n=0;
        for (int i = 0; i < week.length; i++) {
            n+=week[i];
        }
        double avg1=(double) n/week.length;
        System.out.println("Среднее значение температуры за последние две недели "+avg1);
    }
}
