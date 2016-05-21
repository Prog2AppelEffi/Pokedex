/**
 * Class for a Pokemon with all attributes
 *
 * @author Jane Doe 1234567 Group 42h
 * @author John Doe 1234567 Group 42h
 */
public class Episode implements Comparable<Episode>{

    /**
     * Enum for the Pokemon types
     */

public String code;
public String title;
public String us;
public String jp;
public int time;

    /**
     * Create a new Pokemon
     *
     * @param nr      Pokedex index
     * @param name    name
     * @param type1   first type
     * @param type2   second type
     * @param total   sum of all stats
     * @param hp      hit points
     * @param attack  attack power
     * @param defence defence power
     * @param spAtk   special attack power
     * @param spDef   special defence power
     * @param speed   speed
     */
    public Episode(String code, String title, String us, String jp, String time) {
        this(code, title, us, jp, Integer.parseInt(time));
    }

    /**
     * Create a new Pokemon
     *
     * @param nr      Pokedex index
     * @param name    name
     * @param type1   first type
     * @param type2   second type
     * @param total   sum of all stats
     * @param hp      hit points
     * @param attack  attack power
     * @param defence defence power
     * @param spAtk   special attack power
     * @param spDef   special defence power
     * @param speed   speed
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
        return String.format("%15s | %15s | %15s | %15s | %4d", code, title, us, jp, time);
    }
    public String getCode() {
        return code;
    }
    public int compareTo(Episode poke){
        if(poke.getCode() == this.getCode()){
            return 0;
        } else {
            return 1;
        }
    }
}
