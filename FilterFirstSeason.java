import java.util.function.Predicate;
	/**
	* @author Martin Appelmann 4685580 Group 2a 
	* @author Benjamin Effner 4633079 Group 2a
	* Ist die Episode aus der Ersten Staffel
	*/
class FilterFirstSeason implements Predicate<Episode> {
    
    /**
     * Enthaelt der Code der Episode EP
     * @param e - the input argument
     * @return true if the input argument matches the predicate, otherwise false
     */
    public boolean test(Episode e) {
        return e.getCode().contains("EP");
    }
}