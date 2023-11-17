package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ConvMethod {
    public static void main(String[] args) {
        List<String> namesList = Arrays.asList("Peter", "Vladimir", "Stepan");
        System.out.println(namesList);

        MethodConv<String> methodConv = new MethodConv<String>();

        ArrayList<String> namesListReverse = methodConv.listConvertor(namesList);
        System.out.println(namesListReverse);
    }
}
