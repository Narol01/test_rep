package practice;

import java.util.ArrayList;
import java.util.List;

public class MethodConv<E> {
    public ArrayList<E> listConvertor(List<E> list) {
        ArrayList<E> array = new ArrayList<>();
        int count = 0;
        int l = list.size();
        for (E el : list) {
            array.add(count, list.get(l - 1 - count));
            count++;
        }
        return array;
    }
}
