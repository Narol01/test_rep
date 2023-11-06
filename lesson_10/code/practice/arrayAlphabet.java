package practice;

public class arrayAlphabet {
    public static void main(String[] args) {
        int[] arrayNum = new int[20];
        for (int i = 0; i < arrayNum.length; i++) {
            arrayNum[i] =i+1;
        }
        for (int i = 0; i < arrayNum.length; i++) {
            System.out.print(arrayNum[i] +", ");
            
        }
        System.out.println();

        char[] alphabet = new char[26];
        for (int i = 0; i < alphabet.length; i++) {
            alphabet[i] = (char) (65 + i); //Это код большой буквы а латинского алфавита
        }
        for (int i = 0; i < alphabet.length; i++) {
            System.out.print(alphabet[i] + " ");
            
        }
    }
}
