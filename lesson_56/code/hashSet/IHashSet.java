package hashSet;

import javax.swing.text.Element;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class IHashSet<E> implements iSet<E> {

    private LinkedList<E>[] hashset; //это массив из связных листов.Каждый отдельный элемент - это отдельный линкедлист
    private int size;
    private int capacity;
    private double loadFActor;

    public IHashSet(int capacity, double loadFActor) {
        this.size = size;
        this.capacity = capacity;
        this.loadFActor = loadFActor;
        hashset = new LinkedList[capacity];
    }

    public IHashSet(int capacity) {
        this(capacity, 0.75);
    }

    public IHashSet() {
        this(16, 0.75);
    }

    @Override
    public boolean add(E element) {
        if (size >= capacity * loadFActor) {
            rebuilArray();
        }
        int index = getIngex(element);
        if (hashset[index]==null){
            hashset[index]=new LinkedList<>();
        }
        if (hashset[index].contains(element)) {
            return false;
        }
        hashset[index].add(element);
        size++;
        return true;
    }

    private void rebuilArray() {
        capacity = capacity * 2;
        LinkedList<E>[] newHashSet = new LinkedList[capacity];
        for (int i = 0; i < hashset.length; i++) {
            if (hashset[i] != null) {
                for (E e : hashset[i]) {
                    int index = getIngex(e);
                    if (newHashSet[index] == null) {
                        newHashSet[index]=new LinkedList<>();
                    }
                    newHashSet[index].add(e);
                }
            }
        }
        hashset= newHashSet;//переопределили ссылку,garbage collector очистит память
    }

    private int getIngex(E element) {
        int hashcode = element.hashCode();
        hashcode=hashcode>=0 ? hashcode: -hashcode;
        return hashcode%capacity;
    }


    @Override
    public boolean remove(E element) {
        int index = getIngex(element);
        if (hashset[index] == null){
            return false;
        }
        boolean res= hashset[index].remove(element);
        if (res){
            size--;

        }
        return res;
    }

    @Override
    public boolean contains(E element) {
        int index= getIngex(element);
        if (hashset[index]==null){
            return false;
        }
        return hashset[index].contains(element);
    }

    @Override
    public int size() {
    return size;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            int i;
            int j;

            int totalCounter;
            @Override
            public boolean hasNext() {
                return totalCounter<size;
            }

            @Override
            public E next() {
                while (hashset[i] == null || hashset[i].isEmpty()){
                    i++;
                }
                E res = hashset[i].get(i);
                totalCounter++;
                if (j<hashset[i].size()-1){
                    j++;
                }else {
                    j=0;
                    i++;
                }
                return res;
            }
        };
    }
}
