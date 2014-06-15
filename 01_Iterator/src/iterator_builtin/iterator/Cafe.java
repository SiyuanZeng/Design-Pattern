package iterator_builtin.iterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by SiyuanZeng's on 6/15/2014.
 */
public class Cafe {
    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DineMenu dineMenu = new DineMenu() ;

        // with no iterators
        System.out.println("Java Built-in ....");
        System.out.println("\nMENU\n-----\nBREAKFAST");
        ArrayList<String> breakfastItems = pancakeHouseMenu.getMenuItems();

        for (int i = 0; i < breakfastItems.size(); i++){
            String menuItem = (String)breakfastItems.get(i);
            System.out.println(menuItem);
        }

        System.out.println("\nLUNCH");
        String[] lunchItems = dineMenu.getMenuItems();

        for (int i = 0; i < lunchItems.length; i++) {
            String menuItem = lunchItems[i];
            System.out.println(menuItem);
        }

        // with iterators
        Iterator<String> pancakeIterator = pancakeHouseMenu.createIterator();
        Iterator<String> dinnerIterator = dineMenu.createIterator();

        System.out.println("\nMENU (with iterators)\n---\nBREAKFAST");
        printMenu(pancakeIterator);
        System.out.println("\nLUNCH");
        printMenu(dinnerIterator);
    }

    private static void printMenu(Iterator iterator) {
        while (iterator.hasNext()){
            String menuItem = (String)iterator.next();
            System.out.println(menuItem);
        }
    }
}



/*
Java Built-in ....

MENU
-----
BREAKFAST
K&B's Pancake Breakfast
Regular Pancake Breakfast
Blueberry Pancakes
Waffles

LUNCH
Vegetarian BLT
BLT
Soup of the day
Hotdog
Steamed Veggies and Brown Rice
Pasta

MENU (with iterators)
---
BREAKFAST
K&B's Pancake Breakfast
Regular Pancake Breakfast
Blueberry Pancakes
Waffles

LUNCH
Vegetarian BLT
BLT
Soup of the day
Hotdog
Steamed Veggies and Brown Rice
Pasta

Process finished with exit code 0

 */