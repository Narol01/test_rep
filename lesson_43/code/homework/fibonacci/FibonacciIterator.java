package homework.fibonacci;

import java.util.Iterator;

public class FibonacciIterator implements Iterator<Integer> {

    private int start;
    private int count;

    private int currPosition;

    public FibonacciIterator(int quantity) {
        this.currPosition = 1;
        this.count=quantity;
        this.start=1;
    }

    @Override
    public boolean hasNext() {
        return count>0;
    }

    @Override
    public Integer next() {
        int result = currPosition;
        count--;
        int temp = currPosition + start;
        currPosition = start;
        start = temp;
        return result;
    }
}
