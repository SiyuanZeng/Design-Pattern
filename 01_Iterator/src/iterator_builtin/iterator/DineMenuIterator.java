package iterator_builtin.iterator;

import java.util.*;

/**
 * Created by SiyuanZeng's on 6/15/2014.
 */
//public class DineMenuIterator implements Iterator {
public class DineMenuIterator implements Iterator<String> {
    private String[] items;
    private int position = 0; // create indication


    public DineMenuIterator() { }

    public DineMenuIterator(String[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if (position >= items.length || items[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public String next() {
        String menuItem = items[position];
        position = position + 1;
        return menuItem;
    }

    /**
     * Removes from the underlying collection the last element returned
     * by this iterator (optional operation).  This method can be called
     * only once per call to {@link #next}.  The behavior of an iterator
     * is unspecified if the underlying collection is modified while the
     * iteration is in progress in any way other than by calling this
     * method.
     *
     * @throws UnsupportedOperationException if the {@code remove}
     *                                       operation is not supported by this iterator
     * @throws IllegalStateException         if the {@code next} method has not
     *                                       yet been called, or the {@code remove} method has already
     *                                       been called after the last call to the {@code next}
     *                                       method
     */
    @Override
    public void remove() {

    }
}
