package practice.linked_list;

import java.util.Iterator;

public class NodeListImpl<E> implements NodeList<E> {

    // fields
    private Node<E> first;
    private Node<E> last;

    private int size;

    // O(1)
    @Override
    public int size() {
        return size;
    }

    // O(1)
    @Override
    public boolean add(E element) { // добавляем элемент в список
        Node<E> newNode = new Node<>(last, element, null); // создаем новый, следующий узел, он последний
        if (last != null) {
            last.next = newNode;
        } else {
            first = newNode; // если список был пустой, то новый создаваемый становится первым
        }
        last = newNode;
        size++;
        return true;
        // узел новый, следующий, в конец списка
    }
    // O(1)
    @Override
    public void clear() {
        last=null;
        first = null;
        size = 0;
    }
    // O(n)
    @Override
    public boolean add(int index, E element) {
        if (index == size) { // добавление элемента в конец
            return add(element);
        }
        Node<E> node = getNodeByIndex(index); // берем узел по его индексу
        Node<E> newNode = new Node<>(node.prev, element, node); // создаем новый узел для вставки в список
        node.prev = newNode;
        if (index != 0) {
            newNode.prev.next = newNode;
        } else {
            first = newNode; // вставка в начало списка
        }
        size++;
        return true;
    }

    // разобраться, как работает метод
    // O(n)
    private Node<E> getNodeByIndex(int index) {
        checkIndex(index);
        Node<E> node;
        if (index < size / 2) {
            node = first;
            for (int i = 0; i < index; i++) {
                node = node.next;
            }
        } else {
            node = last;
            for (int i = size - 1; i > index; i--) {
                node = node.prev;
            }
        }
        return node;
    }
    // O(1)
    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException(index);
        }
    }
    // O(1)
    @Override
    public E get(int index) {
        Node<E> node = getNodeByIndex(index);
        return node.data;
    }
    // O(n)
    @Override
    public int indexOf(Object o) {
        int index = 0;
        if (o != null) {
            for (Node<E> node = first; node != null; node = node.next, index++) {
                if (o.equals(node.data)) {
                    return index;
                }
            }
        } else {
            for (Node<E> node = first; node != null; node = node.next, index++) {
                if (o == node.data) {
                    return index;
                }
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }
    // O(1)
    @Override
    public E remove(int index) {
        Node<E> node = getNodeByIndex(index);
        return unlink(node);
    }
    // O(1)
    private E unlink(Node<E> node) {
        E victim = node.data;//удаляемый элемент
        Node<E> prev = node.prev;//ссылка на предыдущий узел
        Node<E> next = node.next;//ссылка на следующий узел
        if (prev != null) {// если ссылка на предыдущий узел не равна нулю
            prev.next = next;//из ссылки на предыдущий узел мы делаем ссылку на следующий узел
            node.prev = null;// а ссылку на предыдущий узел мы обнуляем
        } else {// если ссылка на предыдущий узел равна нулю, то мы удаляем первый узел и первому узлу задаём ссылку на следующий узел
            first = next;
        }
        if (next != null) {// если ссылка на следующий узел не равна нулю
            next.prev = prev;//из ссылки на следующий узел мы делаем ссылку на предыдущий узел
            node.next = null;// а ссылку на следующий узел мы обнуляем
        } else {// если ссылка на след узел равна нулю, то мы удаляем последний узел и последнему узлу задаём ссылку на предыдущий узел
            last = prev;
        }
        node.data = null;//обнуляем
        size--;// уменьшаем количество элементов
        return victim;// суть метода в том что бы обнулить все значения и вернуть удалённый узел у которого все значения равны нулю
    }
    // O(1)
    @Override
    public E set(int index, E element) {
        Node<E> node = getNodeByIndex(index);//нашли узел по индексу
        E victim = node.data;
        node.data = element;//обновили данные
        return victim;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            Node<E> current=first;
            @Override
            public boolean hasNext() {
                return current!=null;
            }

            @Override
            public E next() {
                E data =current.data;
                current=current.next;
                return data;
            }
        };
    }
}
