package practice.ilist;

public interface Ilist<E> {
    int size();// узнать размер списка
    boolean isEmpty();// есть ли что-то в списке или он пустой
    void clean();//Удалить всё из мписка
    boolean add(E element);// добавить элемент списка
    boolean contains(Object o);//есть ли элемент в списке
    boolean remove(Object o);// удалить элемент, если он есть (а все ли элементы мы удалим?)
    // добавить (вставить) элемент по индексу

    // удалить элемент из списка по индексу

    // обновить элемент в списке по его индексу

    // есть ли элемент в списке

    // найти элемент по его индексу

    // зная элемент, найти его индекс

    // удалить все из списка

    // ищем индекс элемента с конца списка
}
