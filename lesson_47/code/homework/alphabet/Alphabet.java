package homework.alphabet;

import java.util.ArrayList;

public class Alphabet {
    public static void main(String[] args) {
        ArrayList<Character> alphabetList = new ArrayList<>();

        for (char ch = 65; ch <= 90; ch++) {
            alphabetList.add(ch);
        }

        System.out.println("Latin alphabet characters from A to Z:");
        for (char ch : alphabetList) {
            System.out.print(ch + " ");
        }
    }
}
