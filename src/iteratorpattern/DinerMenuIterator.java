package iteratorpattern;

public class DinerMenuIterator implements Iterator {

    MenuItem[] items;
    int pos = 0;

    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        
        if(pos >= items.length || items[pos] == null){
            return false;
        } else{
            return true;
        }
    }

    @Override
    public Object next() {
        MenuItem menuItem = items[pos];
        pos += 1;
        return menuItem;
    }

    @Override
    public void remove() {
     }

}
