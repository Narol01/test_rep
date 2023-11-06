package practice.computers;

import practice.computers.model.Handy;
import practice.computers.model.Laptop1;

public class ComputerAppl {
    public static void main(String[] args) {

        Computer[] comp=new Computer[4];
        comp[0]=new Computer("i9",16,512,"ASUS");
        //System.out.println(comp[0]);
        System.out.println("_________________________________");
        comp[1]=new Laptop1("i5",8,256,"acer","14",5000,2);
        //System.out.println(comp[1]);
        comp[2]=new Laptop1("M2",16,512,"MacBook","14",5000,1.6);
        comp[3]=new Handy("A15",4,128,"iPhone","6.1",3095,0.164,"12MP");

        for (int i = 0; i < comp.length; i++) {
            System.out.println(comp[i]);
            System.out.println("_________________________________");
        }
        int sumHdd = 0;
        for (int i = 0; i < comp.length; i++) {
            sumHdd+=comp[i].getHdd();
        }
        System.out.println("Total HDD= "+sumHdd);
    }
}
