/**
 * @author Martin Appelmann 4685580 Group 2a 
 * @author Benjamin Effner 4633079 Group 2a
 */

public class Pokemon {
	
	private int number;
	private String name;
	private String type1;
	private String type2;
	private int total;
	private int hp;
	private int attack;
	private int defence;
	private int spAtk;
	private int spDef;
	private int speed;
	private String[] parts;
	private Pokemon nextPoke = null;
	private Pokemon prevPoke = null;

	/**
	 * Creates a new Pokemon object with all the values
	 * @param line is a line from the csv, that is splitted on every ','
	 */

	Pokemon(String line) {
		parts = line.split(",");
 		this.number = Integer.parseInt(parts[0]);
 		this.name = parts[1];
 		this.type1 = parts[2];
 		this.type2 = parts[3];
 		this.total = Integer.parseInt(parts[4]);
 		this.hp = Integer.parseInt(parts[5]);
 		this.attack = Integer.parseInt(parts[6]);
 		this.defence = Integer.parseInt(parts[7]);
 		this.spAtk = Integer.parseInt(parts[8]);
 		this.spDef = Integer.parseInt(parts[9]);
 		this.speed = Integer.parseInt(parts[10]);
	}

	/**
	 * Sets the Pokemon following this one
	 * @param nextPoke is the next Pokemon
	 */

	public void setNextPoke(Pokemon nextPoke) {
        this.nextPoke = nextPoke;
    }
	    
	/**
	 * Sets the Pokemon preceding the current one
	 * @param prevPoke is the previous pokemon
	 */

    public void setPrevPoke(Pokemon prevPoke) {
	    this.prevPoke = prevPoke;
    }

    /**
	 * returns the pokemon following the current one
	 * @return the Pokemon following this one
	 */

    public Pokemon getNextPoke() {
        return nextPoke;
    }
	
	/**
     * @return the pokemon preceding the current one
     */

    public Pokemon getPrevPoke() {
        return this.prevPoke;
    }

    /**
     * @return the current Pokemon
     */

	public Pokemon getPokemon() {
        return this;
	}

	/**
	 * @return the Index of the current Pokemon
	 */

	public int getNumber() {
		return number;
	}

	/**
 	 * Creates one large String filled with all parts and formatted to the given pattern
	 * @return String with every data of the Pokemon
 	 */

	public String toString() {
		String full = "";
		full += insertPart(parts[0], 3);
		full += insertPart(parts[1], 15);	
		full += insertPart(parts[2], 8);
		full += insertPart(parts[3], 8);
		full += insertPart(parts[4], 5);
		full += insertPart(parts[5], 3);
		full += insertPart(parts[6], 3);
		full += insertPart(parts[7], 3);
		full += insertPart(parts[8], 6);
		full += insertPart(parts[9], 6);
		full += insertPart(parts[10], 5);
		full = full.substring(0, full.length() - 3);
		return full;
	}

	/**
 	 * Formats the lineoutput to match the given pattern
	 * @param part is the part which has to be output
	 * @param spaceSize is the amount of positions the part has to fill
	 * @return String with the part filled to the spaceSize
	 */

	public String insertPart(String part, int spaceSize) {
		String line = "";
		while (line.length() < (spaceSize - part.length())) {
			line += " ";
		}
		line += part + " | ";
		return line;
	}
}
