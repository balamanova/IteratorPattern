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
public class Waitress {
    Menu breakfastMenu;
    Menu dinerMenu;
    Menu cafeMenu;
    
    public Waitress(Menu breakfastMenu, Menu dinerMenu, Menu cafeMenu){
        this.breakfastMenu = breakfastMenu;
        this.dinerMenu = dinerMenu;
        this.cafeMenu = cafeMenu;
    }
    
    public void printMenu(){
        
        Iterator breakfastIterator = breakfastMenu.createIterator();
        Iterator dinerIterator = dinerMenu.createIterator();
        Iterator cafeIterator = cafeMenu.createIterator();
        
        
        System.out.println("\n*-----MENU------*\n");
        System.out.println("    BREAKFAST   ");
        printMenu(breakfastIterator);
        System.out.println("\n*-----------------*\n");
        System.out.println("     DINER      ");
        printMenu(dinerIterator);
        System.out.println("\n*-----------------*\n");
        System.out.println("    CAFE   ");
        printMenu(cafeIterator);
        
    }

    public void printMenu(Iterator iterator) {
        while(iterator.hasNext()){
            
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.println("Name: " + menuItem.getName());
            System.out.println("Description: " + menuItem.getDesciption());
            System.out.println("Price: " + menuItem.getPrice());
            if(menuItem.vegeterian){
                System.out.println("Is Vegeterian");
            } else {
                System.out.println("Is not Vegeterian");
            }
        }
    }
    
}
