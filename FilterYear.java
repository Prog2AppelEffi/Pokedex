import java.util.function.Predicate;
	/**
	* @author Martin Appelmann 4685580 Group 2a 
	* @author Benjamin Effner 4633079 Group 2a
	* Kam die Episode 2005 oder davor
	*/
public class FilterYear  implements Predicate<Episode> {
    /**
     * Evaluates this predicate on the given argument.
     * @param e - the input argument
     * @return true if the input argument matches the predicate, otherwise false
     */
    public boolean test(Episode e) {
    	String[] yearString = e.getJp().split(". ");
    	int year = Integer.parseInt(yearString[2]);
    	//System.out.println(yearString[2]);
        return year <= 2005;
    }

}
