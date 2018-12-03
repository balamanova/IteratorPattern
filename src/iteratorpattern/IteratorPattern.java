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
public class IteratorPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BreakfastMenu bfMenu = new BreakfastMenu();
        DinerMenu dMenu = new DinerMenu();
        CafeMenu cMenu = new CafeMenu();
        
        Waitress waitress = new Waitress(bfMenu, dMenu, cMenu);
        
        waitress.printMenu();
    }
    
}
