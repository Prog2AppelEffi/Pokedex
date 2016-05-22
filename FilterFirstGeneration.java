import java.util.function.Predicate;
	/**
	* @author Martin Appelmann 4685580 Group 2a 
	* @author Benjamin Effner 4633079 Group 2a
	* ist das Pokemon von der Ersten Generation
	*/
public class FilterFirstGeneration implements Predicate<Pokemon> {
    /**
     * ist das Pokemon von der Ersten Generation
     * @param p - the input argument
     * @return true if the input argument matches the predicate, otherwise false
     */
    public boolean test(Pokemon p) {
        return p.getNr() <= 151;
    }

}
