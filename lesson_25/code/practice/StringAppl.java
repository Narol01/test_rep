package practice;

public class StringAppl {
    public static void main(String[] args) {
        System.out.println("-----------------");
        String str="Hello";
        char[] chars={32,'w','o','r','l','d'};
        String str1=new String(chars);
        str=str + str1;
        System.out.println(str);
        str = str.concat(str1);
        System.out.println(str);
        int l = str.length();
        System.out.println("Length of string "+str+" : "+l);
        char c= str.charAt(str.length()-1);
        System.out.println("Last symbol of string: " + c );
        System.out.println();
        System.out.println("---------Print by letters--------");
        for (int i = 0; i < str.length(); i++) {
            System.out.print(" "+ str.charAt(i));
        }
        System.out.println();
        System.out.println("-----------------");
        String str2=" World";
        System.out.println(str1.equals(str2));//ожидаем false
        System.out.println(str1.equalsIgnoreCase(str2));//ожидаем true
        String str3 = str1.toUpperCase();//перводим строку в UpperCase
        System.out.println(str3);
        System.out.println(str3.toLowerCase());//переводим в низкий регистр
        System.out.println("-_______________-");
        //index - позиция символа в строке
        System.out.println(str);
        int index= str.indexOf('l');//str = "Hello"
        System.out.println("Index of 'l' = "+index);
        index = str.indexOf("or");
        System.out.println(index);
    }
}
