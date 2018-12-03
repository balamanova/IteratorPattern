/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iteratorpattern;

import java.util.HashMap;
import java.util.Hashtable;

/**
 *
 * @author пк
 */
public class CafeMenuIterator implements Iterator{

    Hashtable items;
    MenuItem[] arr;
    int pos = 0;
    public CafeMenuIterator(Hashtable items){
        this.items = items;
        arr = new MenuItem[7];
        
        
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
        MenuItem menuItem = (MenuItem) items.get(pos);
        pos ++;
        return menuItem;
    }
    
    @Override
    public void remove() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
