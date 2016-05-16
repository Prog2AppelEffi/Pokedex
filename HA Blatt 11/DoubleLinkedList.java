/**
 * Class for a circular double-ended list
 * @author Jane Doe 1234567 Group 42h
 * @author John Doe 1234567 Group 42h
 */
public class DoubleLinkedList<T extends Comparable<T>> implements List<T>{ 

    private DoubleLinkedList<T> prev;
    private DoubleLinkedList<T> next;
    private T pokemon;

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
     * @param pokemon the Pokemon
     */
    private DoubleLinkedList(DoubleLinkedList<T> prev, DoubleLinkedList<T> next, T pokemon) {
        this.prev = prev;
        prev.next = this;
        this.next = next;
        next.prev = this;
        this.pokemon = pokemon;
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
        return next.pokemon;
    }

    @Override
    public void insert(T p) {
        DoubleLinkedList<T> cur = next;
        while (cur.pokemon != null && cur.pokemon.getNr() < p.getNr()) {
            cur = cur.next;
        }
        new DoubleLinkedList<T>(cur.prev, cur, p);
    }

    @Override
    public void delete(T p) {
        DoubleLinkedList<T> cur = next;
        while (cur.pokemon != null && cur.pokemon.getNr() != p.getNr()) {
            cur = cur.next;
        }
        if (cur.pokemon != null) {
            cur.prev.next = cur.next;
            cur.next.prev = cur.prev;
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        DoubleLinkedList<T> cur = this;
        while (!cur.isEmpty()) {
            stringBuilder.append(cur.firstPokemon()).append("\n");
            cur = cur.next;
        }
        return stringBuilder.toString();
    }

    
}
