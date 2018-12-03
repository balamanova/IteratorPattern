/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iteratorpattern;

import java.util.ArrayList;

public class BreakfastMenu implements Menu{
    ArrayList menuItems;

    public BreakfastMenu() {
        menuItems = new ArrayList();
        
        addItem("K&B`s Pancake Breakfast", "Egg, toast", true, 2.99);
        addItem("Regular Pancake Breakfast", "Egg, sausage", false, 2.99);
        addItem("Blueberry Pancakes", "Fresh blubberies", true, 3.49);
        addItem("Waffles", "Waffles with choice of blubberies or strawberry", true, 3.59);
    
    }

    @Override
    public void addItem(String name, String description, boolean isVegeterian, double price) {
        MenuItem menuItem = new MenuItem(name, description, isVegeterian, price); //To change body of generated methods, choose Tools | Templates.
        menuItems.add(menuItem);
    }
    
    public  Iterator createIterator(){
        return new BreakfastMenuIterator(menuItems);
    }
    
    
}
