package customers;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class SkipNextCustomerIterator<T> implements Iterator<T> {

    private final List<T> list;
    private int position;

    public SkipNextCustomerIterator(List<T> list) {
        this.list = list;
        position = 0;
    }

    public Iterator<T> iterator(){
        return this;
    }

    @Override
    public boolean hasNext() {
        return position < list.size();
    }

    @Override
    public T next() {
        if(!hasNext()){
            throw new NoSuchElementException();
        }
        T nextElement = list.get(position);
        position += 2;
        return nextElement;
    }
}
