package homework;

import java.util.Scanner;

public class TarakansRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество тараканов: ");
        int numberOfTarakans = scanner.nextInt();

        System.out.print("Введите расстояние (количество итераций): ");
        int distance = scanner.nextInt();
        // Шаг 2: Создание и запуск потоков для тараканов
        Tarakan[] tarakans = new Tarakan[numberOfTarakans];
        Thread[] tarakanThreads = new Thread[numberOfTarakans];

        for (int i = 0; i < numberOfTarakans; i++) {
            tarakans[i] = new Tarakan(distance);
            tarakanThreads[i] = new Thread(tarakans[i]);
            tarakanThreads[i].start();
        }
        // Шаг 3: Дождаться завершения всех потоков
        for (int i = 0; i < numberOfTarakans; i++) {
            try {
                tarakanThreads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Шаг 4: Определение таракана-победителя
        int winnerNumber = findWinner(tarakans);

        // Шаг 5: Вывод результата
        System.out.println("Congratulations to tarakan #" + winnerNumber + " (winner)!");
        System.out.println("Гонка завершена!");
    }

    private static int findWinner(Tarakan[] tarakans) {
        int winnerNumber = 0;
        long maxRaceTime = 0;

        for (int i = 0; i < tarakans.length; i++) {
            if (tarakans[i].getRaceTime() > maxRaceTime) {
                maxRaceTime = tarakans[i].getRaceTime();
                winnerNumber = i + 1; // Нумерация тараканов начинается с 1
            }
        }

        return winnerNumber;
    }
}
