package practice.ilist;

import java.util.Arrays;
import java.util.Iterator;

public class IlistImpl<E> implements Ilist<E>,Iterable<E> {
    private Object[] elements;
    private int size;//размер списка

    public IlistImpl(int initialCapacity) {
        if (initialCapacity < 0) {
            throw new IllegalArgumentException("Illegal capacity=" + initialCapacity);//выбросили исключения
        }
        elements = new Object[initialCapacity];
    }

    public IlistImpl() {
        this(10);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clean() {
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        size = 0;
    }

    @Override
    public boolean add(E element) {
        ensureCapacity();
        elements[size++] = element;
        return true;
    }

    private void ensureCapacity() {
        if (size==elements.length){
        if (size == Integer.MAX_VALUE) {
            throw new OutOfMemoryError();//
        }
        int newCapacity = elements.length + elements.length / 2;
        if (newCapacity < 0) {
            newCapacity = Integer.MAX_VALUE;
        }
        elements = Arrays.copyOf(elements, newCapacity);
    }
    }

    @Override
    public boolean add(int index, E element) {
        if (index == size) {
            add(element);
            return true;
        }
        //добавление в средину списка
        checkIndex(index);
        ensureCapacity();
        System.arraycopy(elements, index, elements, index + 1, size++ - index);
        elements[index] = element;
        return true;
    }

    private void checkIndex(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException(index);
        }
    }


    @Override
    public E remove(int index) {
        checkIndex(index);
        E el = (E) elements[index];
        System.arraycopy(elements, index + 1, elements, index, --size - index);
        elements[size] = null;
        return el;
    }

    @Override
    public E get(int index) {
        checkIndex(index);
        return (E) elements[index];
    }

    @Override
    public E set(int index, E element) {
        checkIndex(index);
        E victim = (E) elements[index];
        elements[index]=element;
        return null;
    }

    @Override
    public int indexOf(Object o) {
        if (o != null) {
            for (int i = 0; i < size; i++) {
                if (o.equals(elements[i])) {
                    return i;
                }
            }
        } else {//когда в листе есть обьект null;
            for (int i = 0; i < size; i++) {
                if (o == (elements[i])) {
                    return i;
                }
            }
        }
        return -1;
    }

    @Override
    public int lastindexOf(Object o) {
        return 0;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            int i =0;

            @Override
            public boolean hasNext() {
                return i<size;
            }

            @Override
            public E next() {
                return (E) elements[i++];
            }
        };
    }

}
