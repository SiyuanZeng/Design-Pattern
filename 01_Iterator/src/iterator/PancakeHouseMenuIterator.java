package iterator;

/**
 * Created by SiyuanZeng's on 6/15/2014.
 */
public class PancakeHouseMenuIterator implements Iterator {
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
}
