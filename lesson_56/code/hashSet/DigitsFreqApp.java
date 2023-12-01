package hashSet;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DigitsFreqApp {
    public static void main(String[] args) {

        double start = System.currentTimeMillis();
        Integer[] million = new Integer[1000001]; // todo вернуть млн
        int min = 1;
        int max = 1000_000;
        LocalDateTime now = LocalDateTime.now();
        for (int i = 0; i < million.length; i++) {
            int random = (int)(Math.random()*(max-min +1)+min);
            million[i] = random;
            System.out.print(million[i]+ " | ");
        }
        double end = System.currentTimeMillis();
        System.out.println();
        System.out.println("=====================================================");
        System.out.println("Time: " + ((end - start))/1000);

        Map<Integer, Integer> numbersMap = new HashMap<>();
        for (Integer n : million) { // идем по массиву
            String numbers = n.toString();// переводим каждое число в стринг
            //System.out.println(numbers); // todo
            for (int i = 0; i < numbers.length(); i++) { // идем по каждой цифре каждого числа
                int num = Character.getNumericValue(numbers.charAt(i)); // чарактером извлекам каждый символ в строке и возвращаем числом в num
                numbersMap.put(num, numbersMap.getOrDefault(num, 0)+1); // если число встречается то +1, если нет его то - возвращается валуе по дефолту(0)
            }
        }
        Set<Map.Entry<Integer, Integer>> currentNum = numbersMap.entrySet();
        System.out.println();
        for (Map.Entry<Integer, Integer> entry : currentNum) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

    }
}
