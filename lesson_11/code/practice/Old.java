package practice;

public class Old {
    public static void main(String[] args) {
        int[] age={30,18,45,52,45,25,61,38,40,35,36,45,47,34,29,22,18};

        int max = maxArr(age);
        int index1 = indexArra(age);
        System.out.println("\nMax age : " + max);
        System.out.println("index of max element: " +index1);
        int min = minArra(age);
        int index2 = indexArr(age);
        System.out.println("\nMin age : " + min);
        System.out.println("index of min element: " + index2);


        int s=age[0];
        int dCount=0;
        int indexI=0;
        int indexJ=0;
        int sameArra = age[0];
        for (int i = 0; i < age.length; i++) {
            for (int j = i+1; j < age.length; j++) {
                if(age[i] == age[j]){
                    s=age[i];
                    dCount++;
                    indexI=i;
                    indexJ=j;
                    System.out.println("\nDuplicate:" +s + "\nIndex of 1 dublicat: " + indexI + "\nIndex of 2 dublicat: " + indexJ);
                    System.out.println("Quality of duplicate:" +dCount);
                }
            }
        }
//        System.out.println("Duplicate:" +s + "\nIndex of dublicat: " + index);
//        System.out.println("Quality of duplicate:" +dCount);
    }
    public static int maxArr(int[] input) {
        int maxArra = input[0];
        int index = 0;
        for (int i = 0; i < input.length; i++) {
            if (maxArra < input[i]) {
                maxArra = input[i];
                index = i;
            }
        }
            return maxArra;
    }
    public static int indexArra(int[] input) {
        int maxArra = input[0];
        int index = 0;
        for (int i = 0; i < input.length; i++) {
            if (maxArra < input[i]) {
                maxArra = input[i];
                index = i;
            }
        }
            return index;
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
    public static int indexArr(int[] input) {
        int minArra = input[0];
        int index = 0;
        for (int i = 0; i < input.length; i++) {
            if (minArra > input[i]) {
                minArra = input[i];
                index = i;
            }
        }
            return index;
    }
}
