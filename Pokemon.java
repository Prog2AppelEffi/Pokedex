
public class Pokemon {
	
	int Nr;
	String Name;
	String Type1;
	String Type2;
	int Total;
	int HP;
	int Attack;
	int Defence;
	int SpAtk;
	int SpDef;
	int Speed;
	
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
	
}
