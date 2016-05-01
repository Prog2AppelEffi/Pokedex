import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Paths;
import java.nio.file.Files;

/**
 * Creates a list for every Pokemon
 * @author Martin Appelmann 0000000 Group 2a 
 * @author Benjamin Effner 4633079 Group 2a
 */
public class DoubleLinkedList implements List {

	private Pokemon firstPokemon = null;
	private Pokemon lastPokemon = null;
/**
 * Creates the List with every Pokemon from the csv
 */
	public DoubleLinkedList() {
		try {
			BufferedReader br = Files.newBufferedReader(Paths.get("Pokedex.csv"));
			String line = null;
			DoubleLinkedList list = null;
			br.readLine();

			while ((line = br.readLine()) != null) {
				if (!line.equals("")) {
					insert(new Pokemon(line));
				}	
			}
		} catch (IOException ioe) {
			System.out.println("blablabla");
		}
	}
/**
 * Returns a String with the whole content of the list
 * @return String containing all listelements
 */
	public String toString() {
		Pokemon poke = firstPokemon;
		String list = "";
		while (poke != null) {
			list += poke.toString() + "\n";
			poke = poke.getNextPoke();
		}
		return list;
	}
	/**
     * Returns true if this list contains no elements.
     * @return true if this list contains no elements
     */
	public boolean isEmpty() {
		if (firstPokemon == null) {
			return true;
		} else {
			return false;
		}
	}
	/**
     * Returns the number of elements in this list.
     * @return the number of elements in this list
     */
	public int length() {
		int c = 0;
		Pokemon poke = firstPokemon;
		while (poke.getNextPoke() != null) {
			poke = poke.getNextPoke();
			c++;
		}
		
		return c;
	}
	/**
     * Retrieves, but does not remove, the first Pokemon of this list, or returns null if this list is empty.
     * @return the first Pokemon of this list, or null if this list is empty
     */
	public Pokemon firstPokemon() {
		return firstPokemon;
	}
	/**
     * Inserts the specified Pokemon in this list.
     * @param p Pokemon to be inserted
     */
	public void insert(Pokemon p) {
		
		//System.out.println("================hinzufügen Pokemon " + p.getNumber() + " ====================");
	
		if (firstPokemon == null) {
			firstPokemon = p;
			lastPokemon = firstPokemon;
			//System.out.println("erstes Pokemon " + p.getNumber());
			
		} else {
			if (p.getNumber() < firstPokemon.getNumber()) {
				Pokemon tempPoke1 = firstPokemon;
				firstPokemon = p;
				firstPokemon.setNextPoke(tempPoke1);
				tempPoke1.setPrevPoke(firstPokemon);
				//System.out.println("Pokemon war kleiner als erstes: " + p.getNumber());
				//System.out.println("neues erste poke " + firstPokemon.getNumber() 
				//+ " mit pointer auf nächstes " + firstPokemon.getNextPoke().getNumber());
				//System.out.println("nächste pokemon " + tempPoke1.getNumber() + " mit pointer auf letztes " + tempPoke1.getPrevPoke().getNumber());
			} else {
				//System.out.println("Pokemon war größer als erstes: " + p.getNumber());
				Pokemon tempPoke2 = firstPokemon.getNextPoke();
				Pokemon tempPoke3 = firstPokemon;
				//System.out.println(tempPoke2.getNumber());
				//System.out.println(tempPoke3.getNumber());
 				boolean found = true;
				while (p.getNumber() > tempPoke2.getNumber()) {
					if (tempPoke2 == lastPokemon) {
						tempPoke2.setNextPoke(p);
						tempPoke3 = tempPoke2;
						tempPoke2 = null;
						lastPokemon = p;
						found = false;
						//System.out.println(lastPokemon.getNumber() + " ist letztes element");
						break;
					} else {
						tempPoke3 = tempPoke2;
						tempPoke2 = tempPoke2.getNextPoke();
					}
				}
				p.setNextPoke(tempPoke2);
				p.setPrevPoke(tempPoke3);
				if (found) {
					tempPoke3.setNextPoke(p);
					tempPoke2.setPrevPoke(p);
				}
			}
		}
	}
	/**
     * Removes the first occurrence of the Pokemon from this list, if it is present.
     * @param p Pokemon to be removed from this list, if present
     */
	public void	delete(Pokemon p) {
		Pokemon current = firstPokemon;
		while (!(current.equals(p))) {
			current = current.getNextPoke();
		}
		Pokemon tempPoke = current.getPrevPoke();
		tempPoke.setNextPoke(current.getNextPoke());
		tempPoke = current.getNextPoke();
		tempPoke.setPrevPoke(current.getPrevPoke());
		current = null;
	}
}	
