/**
 * Class for a Pokemon with all attributes
 *
 * @author Jane Doe 1234567 Group 42h
 * @author John Doe 1234567 Group 42h
 */
public class Pokemon implements Comparable<Pokemon>{

    /**
     * Enum for the Pokemon types
     */
    public enum Type {
        Bug, Dark, Dragon, Electric, Fairy, Fighting, Fire, Flying, Ghost,
        Grass, Ground, Ice, Normal, None, Poison, Psychic, Rock, Steel, Water
    }

    private int nr;
    private String name;
    private Type type1;
    private Type type2;
    private int total;
    private int hp;
    private int attack;
    private int defence;
    private int spAtk;
    private int spDef;
    private int speed;

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
    public Pokemon(String nr, String name, String type1, String type2, String total, String hp, String attack, String defence, String
        spAtk, String spDef, String speed) {
        this(Integer.parseInt(nr), name, type1.isEmpty() ? Type.None : Type.valueOf(type1),
            type2.isEmpty() ? Type.None : Type.valueOf(type2), Integer.parseInt(total),
            Integer.parseInt(hp), Integer.parseInt(attack), Integer.parseInt(defence),
            Integer.parseInt(spAtk), Integer.parseInt(spDef), Integer.parseInt(speed));
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
    public Pokemon(int nr, String name, Type type1, Type type2, int total, int hp, int attack, int defence, int
        spAtk, int spDef, int speed) {
        this.nr = nr;
        this.name = name;
        this.type1 = type1;
        this.type2 = type2;
        this.total = total;
        this.hp = hp;
        this.attack = attack;
        this.defence = defence;
        this.spAtk = spAtk;
        this.spDef = spDef;
        this.speed = speed;
    }

    public int getNr() {
        return nr;
    }

    @Override
    public String toString() {
        return String.format("%3d | %15s | %8s | %8s | %5d | %3d | %3d | %3d | %6d | %6d | %5d", nr, name, type1,
            type2, total, hp, attack, defence, spAtk, spDef, speed);
    }

    public int compareTo(Pokemon poke){
        if(poke.getNr() == this.getNr()){
            return 0;
        } else if(poke.getNr() > this.getNr()){
            return -1;
        } else {
            return 1;
        }
    }
}
