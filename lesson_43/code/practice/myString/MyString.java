package practice.myString;

import practice.myString.model.MyStringIterator;

import java.util.Iterator;

public class MyString implements Iterable<Character> {

    private StringBuilder str;

    public MyString(StringBuilder str) {
        this.str =new StringBuilder(str);
    }

    public StringBuilder getStr() {
        return str;
    }

    public void setStr(StringBuilder str) {
        this.str = str;
    }
    //метод добавления символа
    public void addChar(char ch){
        str.append(ch);
    }
    //метод удаления символа
    public void removeChar(char ch){
        //int index = str.indexOf(String.valueOf(ch));
        int index = str.indexOf(Character.toString(ch));
        str.deleteCharAt(index);
    }

    @Override
    public String toString(){
        return str.toString();
    }

    @Override
    public Iterator<Character> iterator() {
        return new MyStringIterator(str);
    }
}
