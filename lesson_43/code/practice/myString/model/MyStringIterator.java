package practice.myString.model;

import java.util.Iterator;

public class MyStringIterator implements Iterator<Character> {
    private StringBuilder str;

    private int size;
    private int currPosition;

    public MyStringIterator(StringBuilder str){
        this.str=str;
        this.size=str.length();

    }

    //проверка есть ли следующий
    @Override
    public boolean hasNext() {
        return currPosition<size;//логическое выражение, тру когда есть элементы ещё.
    }

    //этот метод должен вернуть элемент множества
    @Override
    public Character next() {
        Character curCharacter= str.charAt(currPosition);
        currPosition++;
        return curCharacter;
    }

    public void remove(){
        str.deleteCharAt(--currPosition);
        size--;
    }
}
