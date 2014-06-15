package iterator_builtin.iterator;

import java.util.Iterator;

/**
 * Created by SiyuanZeng's on 6/15/2014.
 */
//public class DineMenu extends DineMenuIterator implements Menu {
public class DineMenu implements Menu {
    private static final int MAX_ITEMS = 6;
    private int numberOfItems = 0;
    String [] menuItems;

    public DineMenu() {
        menuItems = new String[MAX_ITEMS];
        addItem("Vegetarian BLT");
        addItem("BLT");
        addItem("Soup of the day");
        addItem("Hotdog");
        addItem("Steamed Veggies and Brown Rice");
        addItem("Pasta");

    }

    /* public Iterator createIterator() {
        return new DineMenuIterator(menuItems);
    }*/
    @Override
    public Iterator<String> createIterator() {
        return new DineMenuIterator(menuItems);
    }

    public java.util.ArrayList<String> menuItems() {
        return null;
    }

    public void addItem (String name){
        if (numberOfItems >= MAX_ITEMS) {
            System.err.println("Sorry, menu full");
        } else {
            menuItems[numberOfItems] = name;
            numberOfItems = numberOfItems + 1;
        }

    }

    public static int getMaxItems() {
        return MAX_ITEMS;
    }

    public int getNumberOfItems() {
        return numberOfItems;
    }

    public void setNumberOfItems(int numberOfItems) {
        this.numberOfItems = numberOfItems;
    }

    public String[] getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(String[] menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public String toString() {
        return "Diner Menu";
    }
}
