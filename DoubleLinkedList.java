import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Paths;
import java.nio.file.Files;

/**
 * Creates a list for every Pokemon
 * @author Martin Appelmann 4685580 Group 2a 
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
			br.readLine();
			while ((line = br.readLine()) != null) {
				if (!line.equals("")) {
					insert(new Pokemon(line));
				}	
			}
		} catch (IOException ioe) {

		}
	}

	/**
     * Inserts the specified Pokemon in this list.
     * @param p Pokemon to be inserted
     */
	
	public void insert(Pokemon p) {
		Pokemon tempPoke;
		if (firstPokemon == null) {
			firstPokemon = p;
			lastPokemon = firstPokemon;
		} else {
			if (p.getNumber() < firstPokemon.getNumber()) {
				tempPoke = firstPokemon;
				firstPokemon = p;
				firstPokemon.setNextPoke(tempPoke);
				tempPoke.setPrevPoke(firstPokemon);
			} else {
				tempPoke = firstPokemon.getNextPoke();
				while (p.getNumber() > tempPoke.getNumber()) {
					if (tempPoke == lastPokemon) {
						tempPoke.setNextPoke(p);
						p.setPrevPoke(tempPoke);
						lastPokemon = p;
						return;
					} else {
						tempPoke = tempPoke.getNextPoke();
					}
				}
				p.setNextPoke(tempPoke);
				p.setPrevPoke(tempPoke.getPrevPoke());
				tempPoke.getPrevPoke().setNextPoke(p);
				tempPoke.setPrevPoke(p);
			}
		}
	}

	/**
     * Removes the first occurrence of the Pokemon from this list, if it is present.
     * @param p Pokemon to be removed from this list, if present
     */

	public void	delete(Pokemon p) {
		Pokemon tempPoke = firstPokemon;
		while (!(tempPoke.equals(p))) {
			tempPoke = tempPoke.getNextPoke();
			if (tempPoke == null) {
				System.out.println("Pokemon not found.");
				return;
			}
		}
		if (tempPoke == firstPokemon) {
			tempPoke.getNextPoke().setPrevPoke(null);
			firstPokemon = tempPoke.getNextPoke();
			tempPoke = null;
		} else if (tempPoke == lastPokemon) {
			lastPokemon = tempPoke.getPrevPoke();
			tempPoke.getPrevPoke().setNextPoke(null);
			tempPoke = null;
		} else {
			tempPoke.getNextPoke().setPrevPoke(tempPoke.getPrevPoke());
			tempPoke.getPrevPoke().setNextPoke(tempPoke.getNextPoke());
			tempPoke = null;
		}
	}

	/**
	 * Returns a String with the whole content of the list
	 * @return String containing all listelements
	 */

	public String toString() {
		Pokemon poke = firstPokemon;
		String list = " Nr |       Name      |  Type 1  |  Type 2  | Total |  HP | Atk | Def | Sp Atk | Sp Def | Speed\n";
		list += "------------------------------------------------------------------------------------------------\n";
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
		int counter = 0;
		Pokemon tempPoke = firstPokemon;
		while (tempPoke != null) {
			counter++;
			tempPoke = tempPoke.getNextPoke();
		}
		return counter;
	}

	/**
	 * Retrieves, but does not remove, the first Pokemon of this list, or returns null if this list is empty.
	 * @return the first Pokemon of this list, or null if this list is empty
	 */

	public Pokemon firstPokemon() {
		return firstPokemon;
	}
}	
