package practic;

public class NumbersBy13 {
    public static void main(String[] args) {
        int count = 1;
        while (count<=200){
            if (count%13==0){
                System.out.print(count + " | ");
            }

            count++;
        }

    }
}
