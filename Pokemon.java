
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

	
	Pokemon(String line){

		String[] parts = line.split(",");
		
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
	
	public int getNr(){
		return this.number;
	}
	public String getName(){
		return this.name;
	}
	public String getType1(){
		return this.type1;
	}
	public String getType2(){
		return this.type2;
	}
	public int getTotal(){
		return this.total;
	}
	public int getHP(){
		return this.hp;
	}
	public int getAttack(){
		return this.attack;
	}
	public int getDefence(){
		return this.defence;
	}
	public int getSpAtk(){
		return this.spAtk;
	}
	public int getSpDef(){
		return this.spDef;
	}
	public int getSpeed(){
		return this.speed;
	}
}
