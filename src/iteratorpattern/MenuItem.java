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
public class MenuItem {
   String name;
   String description;
   boolean vegeterian;
   double price;
    
    MenuItem(String name, String description, boolean vegeterian, double price) {
     this.name = name;
     this.description = description;
     this.vegeterian = vegeterian;
     this.price = price;
    }
    
    public String getName(){
        return name;
    }
    
    public String getDesciption(){
        return description;
    }
    
    public boolean isVegeterian(){
        return vegeterian;
    }
    
    public double getPrice(){
        return price;
    }
}
