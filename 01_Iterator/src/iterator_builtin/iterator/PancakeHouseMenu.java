package iterator_builtin.iterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by SiyuanZeng's on 6/15/2014.
 */
//public class PancakeHouseMenu extends PancakeHouseMenuIterator implements Menu {//Why iterator and menu?
public class PancakeHouseMenu implements Menu {//Why iterator and menu?
    ArrayList<String> menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList<String>();

        addItem("K&B's Pancake Breakfast");
        addItem("Regular Pancake Breakfast");
        addItem("Blueberry Pancakes");
        addItem("Waffles");
    }

    @Override
    public Iterator<String> createIterator() {
//        return new PancakeHouseMenuIterator();
          return menuItems.iterator();
    }

    public void addItem(String item) {
        menuItems.add(item);
    }

    @Override
    public String toString() {
        return "Pancake House Menu";
    }


    public ArrayList<String> getMenuItems() {
        return menuItems;
    }
}
