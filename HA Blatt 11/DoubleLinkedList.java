/**
 * Class for a circular double-ended list
 * @author Jane Doe 1234567 Group 42h
 * @author John Doe 1234567 Group 42h
 */
public class DoubleLinkedList<T extends Comparable<T>> implements List<T>{ {

    private DoubleLinkedList prev;
    private DoubleLinkedList next;
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
    private DoubleLinkedList(DoubleLinkedList prev, DoubleLinkedList next, T pokemon) {
        this.prev = prev;
        prev.next = this;
        this.next = next;
        next.prev = this;
        this.pokemon = pokemon;
    }

    @Override
    public boolean isEmpty() {
        return firstPokemon() == null;
    }

    @Override
    public int length() {
        DoubleLinkedList cur = this;
        int length = 0;
        while (!cur.isEmpty()) {
            length++;
            cur = cur.next;
        }
        return length;
    }

    @Override
    public T firstPokemon() {
        return next.pokemon;
    }

    @Override
    public void insert(T p) {
        DoubleLinkedList cur = next;
        while (cur.pokemon != null && cur.pokemon.getNr() < p.getNr()) {
            cur = cur.next;
        }
        new DoubleLinkedList(cur.prev, cur, p);
    }

    @Override
    public void delete(T p) {
        DoubleLinkedList cur = next;
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
        DoubleLinkedList cur = this;
        while (!cur.isEmpty()) {
            stringBuilder.append(cur.firstPokemon()).append("\n");
            cur = cur.next;
        }
        return stringBuilder.toString();
    }
}
