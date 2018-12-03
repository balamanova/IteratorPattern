/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iteratorpattern;

import java.util.ArrayList;

/**
 *
 * @author пк
 */
public class BreakfastMenuIterator implements Iterator {

    ArrayList<MenuItem> items;
    int pos = 0;

    public BreakfastMenuIterator(ArrayList<MenuItem> items) {
        this.items = items;
       
    }

    @Override
    public boolean hasNext() {
        
        if( pos >= items.size() || items.get(pos)==null){
            return false;
        } else{
            return true;
        }
    }

    @Override
    public Object next() {
        MenuItem menuItem = items.get(pos);
        pos ++;
        return menuItem;
    }

    @Override
    public void remove() {
       
    }

}
