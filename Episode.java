/**
 * Class for a Episode with all attributes
 *
 * @author Martin Appelmann 4685580 Group 2a 
 * @author Benjamin Effner 4633079 Group 2a
 */
public class Episode implements Comparable<Episode> {

    /**
     * Enum for the Pokemon types
     */

	private String code;
	private String title;
	private String us;
	private String jp;
	private int time;

    /**
     * Create a new Episode
     *
	 @param code Episode Code
	 @param title Episode Title
	 @param us USA broadcast
	 @param jp Japan broadcast
	 @param time Abstand ausstrahlung US und JP
     */
    public Episode(String code, String title, String us, String jp, String time) {
        this(code, title, us, jp, Integer.parseInt(time));
    }

    /**
     * Create a new Episode
     @param code Episode Code
	 @param title Episode Title
	 @param us USA broadcast
	 @param jp Japan broadcast
	 @param time Abstand ausstrahlung US und JP
     */
    public Episode(String code, String title, String us, String jp, int time) {
		this.code = code;
		this.title = title;
		this.us = us;
		this.jp = jp;
		this.time = time;
    }

    @Override
    public String toString() {
        return String.format("%6s | %35s | %20s | %20s | %4d", code, title, us, jp, time);
    }
    public String getCode() {
        return code;
    }
	
	public String getCode() {
		return this.code;
	}
	public String getJp() {
		return this.jp;
	}
	
	/**
	Vergleicht den Code von zwei Episoden miteinander
	@param poke ist die eine Episode
	@return int 0 wenn gleicher Code
	*/
    public int compareTo(Episode poke) {
        if (poke.getCode() == this.getCode()) {
            return 0;
        } else {
            return 1;
        }
    }
}
