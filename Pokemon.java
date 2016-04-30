
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

	Pokemon(String line){
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

	public void setNextPoke(Pokemon nextPoke) {
        this.nextPoke = nextPoke;
   }
	    
    public void setPrevPoke(Pokemon prevPoke) {
	    this.prevPoke = prevPoke;
    }

    public Pokemon getNextPoke() {
        return nextPoke;
    }
	    
    public Pokemon getPrevPoke() {
        return this.prevPoke;
    }

	public Pokemon getPokemon() {
        return this;
	}

	public int getNumber(){
		return number;
	}

//=========================================to String===========================================

	public String toString(){
		String full="";
		full += insertPart(parts[0], 3);
		full += insertPart(parts[1], 15);	
		full += insertPart(parts[2], 8);
		full += insertPart(parts[3], 8);
		full += insertPart(parts[4], 3);
		full += insertPart(parts[5], 3);
		full += insertPart(parts[6], 3);
		full += insertPart(parts[7], 3);
		full += insertPart(parts[8], 3);
		full += insertPart(parts[9], 3);
		full += insertPart(parts[10], 3);
		full = full.substring(0,full.length() - 3);
		return full;
	}

	public String insertPart(String part, int spaceSize){
		String line = "";
		while(line.length() < (spaceSize - part.length())){
			line += " ";
		}
		line += part + " | ";
		return line;
	}
}
