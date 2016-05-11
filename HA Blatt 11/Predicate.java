/**
 * simple version of the Predicate from Java 8.
 * @param <T>
 *
 * @author Jane Doe 1234567 Group 42h
 * @author John Doe 1234567 Group 42h
 */
public interface Predicate<T> {
    /**
     * Evaluates this predicate on the given argument.
     * @param t - the input argument
     * @return true if the input argument matches the predicate, otherwise false
     */
    public boolean test(T t);
}