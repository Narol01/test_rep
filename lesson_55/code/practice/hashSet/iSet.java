package practice.hashSet;

public interface iSet<E>  extends Iterable<E>{
boolean add(E element);
boolean remove(E element);
boolean contains(E element);
void size();
}
