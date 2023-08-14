package customers;

import java.util.*;
import java.util.function.Predicate;

public class AgeIterator<T> implements Iterator<T> {
    private final List<T> list;
    private final Comparator<T> ageComparator;
    private int position;

    public AgeIterator(List<T> list, Comparator<T> ageComparator) {
        this.list = list;
        this.ageComparator = ageComparator;
        this.position = 0;
        this.list.sort(ageComparator);
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

        return list.get(position++);
    }
}