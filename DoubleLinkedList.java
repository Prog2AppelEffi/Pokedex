
public class DoubleLinkedList implements List {

	private Pokemon obj;
	private DoubleLinkedList nextElement;
	private DoubleLinkedList preElement;

	public DoubleLinkedList(Pokemon obj){
		this.obj = obj;
		nextElement = null;
	}


	


		

	public boolean isEmpty(){
		return true;
	}

	public int length(){
		return 2;
	}

	public Pokemon firstPokemon(){
		Pokemon test = new Pokemon("460,Abomasnow,Grass,Ice,494,90,92,75,92,85,60");
		return test;
	}

	public void insert(Pokemon p){
		DoubleLinkedList list = new DoubleLinkedList(p);
	}

	public void	delete(Pokemon p){
		
	}
}	
