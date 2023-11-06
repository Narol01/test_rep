package homework;

public class StrAppl {
    public static void main(String[] args) {
        String str ="I'm proud to learn Java! Java is the most famous programming language!!!";
        char c= str.charAt(str.length()-1);
        System.out.println("Last symbol of string: " + c );
        int index= str.indexOf("Java");
        System.out.println("Index of 'Java' = "+ index);
        boolean checker = str.contains("Java");
        System.out.println(checker);
        System.out.println(str.replace("o","a"));
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.substring(0,19)+str.substring(23));
        boolean checker1 = str.endsWith("!!!");
        System.out.println(checker);
        boolean checker2 = str.startsWith("I'm proud");
        System.out.println(checker);
    }
}
