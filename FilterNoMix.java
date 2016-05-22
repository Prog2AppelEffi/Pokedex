import java.util.function.Predicate;
	/**
	* @author Martin Appelmann 4685580 Group 2a 
	* @author Benjamin Effner 4633079 Group 2a
	* Hat das Pokemon einen zweiten Typen
	*/
public class FilterNoMix implements Predicate<Pokemon> {
    /**
     * Evaluates this predicate on the given argument.
     * @param p - the input argument
     * @return true if the input argument matches the predicate, otherwise false
     */
    public boolean test(Pokemon p) {
    	
        return p.getType2().toString().equals("None");
    }

}
