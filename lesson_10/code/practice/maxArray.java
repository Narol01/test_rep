package practice;

public class maxArray {
    public static void main(String[] args) {
        int[] array = {56, 73, 15, -10, 37, -14, 25, 65, 33, 38};
        int max = maxArra(array);
        int min = minArra(array);
        System.out.println("Maximum: "+ max + "\nMinimum: " + min);

    }

    public static int maxArra(int[] input) {

        int maxArra = input[0];
        for (int i = 0; i < input.length; i++) {
            if (maxArra < input[i]) {
                maxArra = input[i];
            }
        }
        return maxArra;
    }
    public static int minArra(int[] input) {

        int minArra = input[0];
        for (int i = 0; i < input.length; i++) {
            if (minArra > input[i]) {
                minArra = input[i];
            }
        }
        return minArra;
    }
}

