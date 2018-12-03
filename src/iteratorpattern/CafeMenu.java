/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iteratorpattern;

import java.util.Hashtable;

/**
 *
 * @author пк
 */
public class CafeMenu implements Menu{

    Hashtable menuItems = new Hashtable();
    int index=0;
    public CafeMenu(){
        addItem("Veggite Burger", "Burger on a whole wheat bun, tomato and fries", true, 3.99);
         addItem("Soup of the day", "A cup of soup", false, 3.69);
         addItem("Burrito", "A large burito, with whole pinto", true, 4.29);
    }
    
    @Override
    public void addItem(String name, String description, boolean isVegeterian, double price) {
         MenuItem menuItem = new MenuItem(name, description, isVegeterian, price);
         menuItems.put(index++, menuItem);
    }

    @Override
    public Iterator createIterator() {
        return new CafeMenuIterator(menuItems);
    }
    
}
