package practice.computer.dao;

import practice.computer.model.Computer;

public class ShopImpl implements Shop {
     private Computer[] computers;

    private int size;
    public ShopImpl(int capacity) {
        computers=new Computer[capacity];
    }
    @Override
    public boolean addComputer(Computer computer) {
        if(computer == null || size == computers.length || findComputer(computer.getSerialnumber()) != null){
            return false;
        }
        computers[size]=computer;
        size++;
        return true;
    }


    @Override
    public Computer removeComputer(String serialnumber) {
        for (int i = 0; i < size; i++) {
            if(computers[i].getSerialnumber()==serialnumber){
                Computer victim =computers[i];
                computers[i]=computers[size-1];// на место найденного поставили последнего кто естi in
                computers[size-1]=null;// ОБНУЛИЛИ ПОСЛЕДНЕГО
                size --;
                return victim;
            }
        }
        return null;
    }

    @Override
    public Computer findComputer(String serialnumber) {
        for (int i = 0; i < size; i++) {
            if(computers[i].getSerialnumber() ==  serialnumber){
                return computers[i];
            }
        }
        return null;
    }

    @Override
    public int quantity() {
        return size;
    }

    @Override
    public void printComputer() {
    for (int i = 0; i < size; i++) {
        System.out.println(computers[i]);
    }

    }
}
