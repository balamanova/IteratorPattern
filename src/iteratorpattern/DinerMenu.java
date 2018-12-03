/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iteratorpattern;

/**
 *
 * @author пк
 */
public class DinerMenu implements Menu{
    static final int MAX = 6;
    int numberOfItems = 0;
    
    MenuItem[] menuItems;
    
    public DinerMenu(){
        menuItems = new MenuItem[MAX];
        
        addItem("Vegeterian BLT", "Tomato, Whole wheat", true, 2.99);
        addItem("BLT", "Tettuce, Tomato", false, 2.99);
        addItem("Soup of the day", "Soup with Tomato", false, 3.29);
        addItem("HotDog", "A hot dog, with saurkraft, relish", false, 3.05);
    
    }

    @Override
    public void addItem(String name, String description, boolean isVegeterian, double price) {
        
         
        MenuItem menuItem = new MenuItem(name, description, isVegeterian, price);
        if(numberOfItems >= MAX){
            System.err.println("Sorry, menu is full! Can`t add item");
        } else{
            menuItems[numberOfItems] = menuItem;
            numberOfItems ++;
        }
    }
    
    
    @Override
    public Iterator createIterator(){
        return new DinerMenuIterator(menuItems);
    }
    
}
