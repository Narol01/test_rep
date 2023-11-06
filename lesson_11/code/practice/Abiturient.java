package practice;

public class Abiturient {
    public static void main(String[] args) {
        double sum=0;
        double[] marks = {2, 3, 3, 1, 4, 5, 1, 3, 2, 1, 1, 3, 2};
        for (int i = 0; i < marks.length; i++) sum += marks[i];
        System.out.printf("average marks = %.2f", sum/marks.length);
    }
}
