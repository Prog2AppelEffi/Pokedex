/**
 * Interface for a List
 *
 * @author Jane Doe 1234567 Group 42h
 * @author John Doe 1234567 Group 42h
 */
public interface List {
    /**
     * Returns true if this list contains no elements.
     * @return true if this list contains no elements
     */
    boolean isEmpty();

    /**
     * Returns the number of elements in this list.
     * @return the number of elements in this list
     */
    int length();

    /**
     * Retrieves, but does not remove, the first Pokemon of this list, or returns null if this list is empty.
     * @return the first Pokemon of this list, or null if this list is empty
     */
    Pokemon firstPokemon();

    /**
     * Inserts the specified Pokemon in this list.
     * @param p Pokemon to be inserted
     */
    void insert(Pokemon p);

    /**
     * Removes the first occurrence of the Pokemon from this list, if it is present.
     * @param p Pokemon to be removed from this list, if present
     */
    void delete(Pokemon p);
}