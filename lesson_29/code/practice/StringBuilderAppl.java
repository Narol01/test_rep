package practice;

public class StringBuilderAppl {
    public static void main(String[] args) {
        //StringBuilder-это класс ,у него есть полезные методы для работы со String.
        //append = добавление

        String str="Java";
        //str= str + "_" + 11
        str=str.concat("_");
        str = str.concat(""+11);
        System.out.println(str);

        //StringBuilder = mutable!
        StringBuilder sb= new StringBuilder("Java");
        System.out.println(sb);
        sb.append("_").append(11);
        System.out.println(sb);// object sb = мутирует
        sb.reverse(); // строка задом наперёд
        System.out.println(sb);
        // можно ли вернуть тип StringBuilder обратно в тип String?
        str = sb.toString(); // да можем
        System.out.println(str);


    }
}
