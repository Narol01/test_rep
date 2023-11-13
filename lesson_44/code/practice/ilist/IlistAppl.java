package practice.ilist;

public class IlistAppl {
    public static void main(String[] args) {

        //Список с целыми числами
        Ilist<Integer> list=new IlistImpl<>();
        System.out.println(list.size());
        System.out.println(list.isEmpty());

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println("----------------------");
        System.out.println(list.indexOf(30));
        System.out.println("----------------------");
        System.out.println(list.get(2));
        System.out.println("----------------------");
        list.set(2,31);
        System.out.println(list.get(2));
        System.out.println("----------------------");
        list.add(2,29);
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println("----------------------");
        list.remove(2);
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println("----------------------");
        list.clean();
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println("----------------------");
        System.out.println("----------------------");
        for (int s: list) {
            System.out.println(s);
        }
        System.out.println("-----City-------");
        Ilist<String> listCity=new IlistImpl<>();
        System.out.println(listCity.size());
        System.out.println(listCity.isEmpty());
        listCity.add("10");
        listCity.add("20");
        listCity.add("30");
        listCity.add("40");
        listCity.add("50");
        listCity.add("60");
        listCity.add("70");
        listCity.add("80");
        System.out.println(listCity.size());
        System.out.println(listCity.isEmpty());
        System.out.println("----------------------");
        System.out.println(listCity.indexOf("30"));
        System.out.println("----------------------");
        System.out.println(listCity.get(2));
        System.out.println("----------------------");
        listCity.set(2,"31");
        System.out.println(listCity.get(2));
        System.out.println("----------------------");
        listCity.add(2,"w");
        System.out.println(listCity.size());
        System.out.println(listCity.isEmpty());
        System.out.println("----------------------");
        listCity.remove(2);
        System.out.println(listCity.size());
        System.out.println(listCity.isEmpty());
        System.out.println("----------------------");
        for (String s: listCity) {
            System.out.println(s);
        }
        System.out.println("=================");
        listCity.clean();
        System.out.println(listCity.size());
        System.out.println(listCity.isEmpty());
        System.out.println("----------------------");
    }
}
