package practice.sentensies;

public class Sentence {

    public int countWords(String str) {
        String[] words = str.split(" ");
        int n = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals("–") || words[i].equals("-")|| words[i].isEmpty() || words[i].equals(",")|| words[i].equals(".")) {
                n++;
            }
        }
        return words.length - n;
    }

    public int countSymbol(String str) {
        String[] symbol = str.split("");
        int m = 0;
        for (int i = 0; i < symbol.length; i++) {
            if ( symbol[i].equals(" ")) {
                m++;
            }
        }
        return symbol.length-m;
    }
}
