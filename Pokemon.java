
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

	public int getSpeed(){
		return speed;
	}
	
	public int getNr(){
		return this.Nr;
	}
	public String getName(){
		return this.Name;
	}
	public String getType1(){
		return this.Type1;
	}
	public String getType2(){
		return this.Type2;
	}
	public int getTotal(){
		return this.Total;
	}
	public int getHP(){
		return this.HP;
	}
	public int getAttack(){
		return this.Attack;
	}
	public int getDefence(){
		return this.Defence;
	}
	public int getSpAtk(){
		return this.SpAtk;
	}
	public int getSpDef(){
		return this.SpDef;
	}
	public int getSpeed(){
		return this.Speed;
	}
}
