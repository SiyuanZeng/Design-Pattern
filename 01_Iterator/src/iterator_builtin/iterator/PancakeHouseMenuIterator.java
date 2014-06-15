/*
package iterator_builtin.iterator;

import java.util.Iterator;

*/
/**
 * Created by SiyuanZeng's on 6/15/2014.
 *//*

//public class PancakeHouseMenuIterator implements Iterator {
public class PancakeHouseMenuIterator implements Iterator<String> {
    private java.util.ArrayList<String> items;
    private int position = 0;

    @Override
    public boolean hasNext() {
        if (position >= items.size()) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public String next() {  // Change the return type here.
        String menuItem = (String) items.get(position);
        position = position + 1;
        return menuItem;
    }

    */
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
     *//*

    @Override
    public void remove() {

    }
}
*/
