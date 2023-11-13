package practice.bus;

import java.util.ArrayList;
import java.util.List;

public class BusAppl {
    public static void main(String[] args) {
        /*
        - создать список городских маршрутов на основе автобусов из городского автопарка;
        - подсчитать общую вместимость автобусов из автопарка.
        */
        List<Bus> cityBus = new ArrayList<>();
        cityBus.add(new Bus("Mercedes", "num1", "100", 30));
        cityBus.add(new Bus("Scania", "num2", "10a", 40));
        cityBus.add(new Bus("MAN", "num3", "10c", 25));
        cityBus.add(new Bus("Mercedes", "num4", "3", 35));
        cityBus.add(new Bus("Volvo", "num5", "100", 45));

        Bus bus = new Bus("MANN", "num6", "200", 90);
        cityBus.add(bus);
        System.out.println(cityBus.size());
        System.out.println("Is Empty? - " + cityBus.isEmpty());
        System.out.println(cityBus);//простая черновая печать
//        for (Bus a:cityBus) {
//            System.out.println(a);
//        }
        cityBus.sort(Bus::compareTo);
        System.out.println("--------------Sorted List-----------");
        System.out.println(cityBus);
        System.out.println("----------------Sum bus Capacity");
        int totalCapacity = 0;
        for (Bus b : cityBus) {
            totalCapacity += b.getBusCapacity();
        }
        System.out.println("totalCapacity - "+totalCapacity);

    }
}
