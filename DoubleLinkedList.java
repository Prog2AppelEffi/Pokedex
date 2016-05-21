/**
 * Class for a circular double-ended list
 * @author Jane Doe 1234567 Group 42h
 * @author John Doe 1234567 Group 42h
 */
public class DoubleLinkedList<T extends Comparable<T>> implements List<T>{ 

    private DoubleLinkedList<T> prev;
    private DoubleLinkedList<T> next;
    private T item;

    /**
     * Create a empty list
     */
    public DoubleLinkedList() {
        this.prev = this;
        this.next = this;
    }

    /**
     * Create a list and link a new element
     * @param prev previous list element
     * @param next next list element
     * @param item the item
     */
    private DoubleLinkedList(DoubleLinkedList<T> prev, DoubleLinkedList<T> next, T item) {
        this.prev = prev;
        prev.next = this;
        this.next = next;
        next.prev = this;
        this.item = item;
    }

    @Override
    public boolean isEmpty() {
        return firstItem() == null;
    }

    @Override
    public int length() {
        DoubleLinkedList<T> cur = this;
        int length = 0;
        while (!cur.isEmpty()) {
            length++;
            cur = cur.next;
        }
        return length;
    }

    @Override
    public T firstItem() {
        return next.item;
    }
    
    public T get(int i){
    	DoubleLinkedList<T> cur = prev;
    	int c = 0;
    	while (c <= i) {
    		c++;
            cur = cur.next;
        }
    	return cur.item;
    }

    @Override
    public void insert(T p) {
        DoubleLinkedList<T> cur = next;
        while (cur.item != null && cur.item.compareTo(p) == -1 ) {
            cur = cur.next;
        }
        new DoubleLinkedList<T>(cur.prev, cur, p);
    }

    @Override
    public void delete(T p) {
        DoubleLinkedList<T> cur = next;
        while (cur.item != null && cur.item.compareTo(p) != 0) {
            cur = cur.next;
        }
        if (cur.item != null) {
            cur.prev.next = cur.next;
            cur.next.prev = cur.prev;
        }
    }
    
    public T delete() {
    	DoubleLinkedList<T> cur = next;
    	cur.prev.next = cur.next;
        cur.next.prev = cur.prev;
    	return cur.item;
    	//return first.getObj();
        
    }
    
    public boolean isInList(T x) {
    	DoubleLinkedList<T> cur = next;
    	if(x == null){
    		return false;
    	}
        while(cur != null) {
            if(x.equals(cur.item))
                return true;
            cur = cur.next;
        }
        return false;
    }
    public void addAll(List<T> list){
        for (int i = 1; i < list.length()+1; i++) {
            this.insert(list.get(i));
        }
    }
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        DoubleLinkedList<T> cur = this;
        while (!cur.isEmpty()) {
            stringBuilder.append(cur.firstItem()).append("\n");
            cur = cur.next;
        }
        return stringBuilder.toString();
    }

    
}
