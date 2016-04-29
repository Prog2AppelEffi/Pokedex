import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Paths;
import java.nio.file.Files;

public class DoubleLinkedList implements List {

	Pokemon firstPokemon = null;
	Pokemon lastPokemon = null;

	public DoubleLinkedList(){
		try {
			BufferedReader br = Files.newBufferedReader(Paths.get("Pokedex.csv"));
			String line = null;
			DoubleLinkedList list = null;
			br.readLine();

			while ((line = br.readLine()) != null) {
				if(!line.equals("")){
					insert (new Pokemon(line));
				}	
			}
		}catch(IOException ioe){
			System.out.println("blablabla");
		}
	}

	public boolean isEmpty(){
		if (firstPokemon == null){
			return true;
		} else {
			return false;
		}
	}

	public int length(){
		return 2;
	}

	public Pokemon firstPokemon(){
		return firstPokemon;
	}

	public void insert(Pokemon p){
		Pokemon tempPoke;
		if(firstPokemon == null){
			firstPokemon = p;
			System.out.println(firstPokemon.toString());
		} else {
			tempPoke.setNextPoke(p);


			/*
			if(lastPokemon = null){
				lastPokemon = p;
				lastPokemon.setPrefPoke(firstPokemon);
				firstPokemon.setNextPoke(lastPokemon); 
			System.out.println(firstPokemon.toString());
			} else {
				p.setNextPoke(lastPokemon)
				p.setPrefPoke()
			//System.out.println(poke.toString());
			}*/
		}
		Pokemon tempPoke = p;
		firstPokemon.setNextPoke(tempPoke);
		lastPokemon.setPrefPoke(tempPoke);
		//DoubleLinkedList list = new DoubleLinkedList(p);
	}

	public void	delete(Pokemon p){
		
	}

}	
