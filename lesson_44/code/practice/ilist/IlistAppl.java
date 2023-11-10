package practice.ilist;

public class IlistAppl {
    public static void main(String[] args) {

        //Список с целыми числами
        Ilist<Integer> list=new IlistImpl<>();
        System.out.println(list.size());
        System.out.println(list.isEmpty());
    }
}
