package iterator;

/**
 * Created by SiyuanZeng's on 6/15/2014.
 */
public class DineMenuIterator implements Iterator {
    private String[] items;
    private int position = 0; // create indication


    public DineMenuIterator() {
    }

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
    public Object next() {
        String menuItem = items[position];
        position = position + 1;
        return menuItem;
    }
}
