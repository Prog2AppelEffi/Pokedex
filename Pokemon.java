
public class Pokemon {
	
	private int Nr;
	private String Name;
	private String Type1;
	private String Type2;
	private int Total;
	private int HP;
	private int Attack;
	private int Defence;
	private int SpAtk;
	private int SpDef;
	private int Speed;
	
	Pokemon(int Nr, 
			String Name, 
			String Type1, 
			String Type2, 
			int Total, 
			int HP, 
			int Attack, 
			int Defence,
			int SpAtk, 
			int SpDef, 
			int Speed){
		this.Nr = Nr;
		this.Name = Name; 
		this.Type1 = Type1;
		this.Type2 = Type2;
		this.Total = Total;
		this.HP = HP;
		this.Attack = Attack;
		this.Defence = Defence;
		this.SpAtk = SpAtk;
		this.SpDef = SpDef;
		this.Speed = Speed;
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
