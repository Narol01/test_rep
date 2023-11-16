package practice.linked_list;

import practice.ilist.IlistImpl;

public class NodeListAppl {
    public static void main(String[] args) {
        //создадим список из целых чисел а после список из строк

        NodeListImpl<Integer> listNumber=new NodeListImpl<>();
        System.out.println(listNumber.size());
        System.out.println(listNumber.isEmpty());

        listNumber.add(100);
        listNumber.add(200);
        listNumber.add(300);
        listNumber.add(400);
        System.out.println(listNumber.size());
        System.out.println(listNumber.isEmpty());
        for (Integer n:listNumber) {
            System.out.println(n);
        }
        System.out.println();
        listNumber.add(2,250);
        for (Integer n:listNumber) {
            System.out.println(n);
        }
        System.out.println();
        listNumber.remove(3);
        for (Integer n:listNumber) {
            System.out.println(n);
        }
        System.out.println();
        listNumber.add(4,null);
        for (Integer n:listNumber) {
            System.out.println(n);
        }
        System.out.println();
    }
}
