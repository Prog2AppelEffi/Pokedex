import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
//import java.util.function.Predicate;

/**
 * Class for the Main method
	* @author Martin Appelmann 4685580 Group 2a 
	* @author Benjamin Effner 4633079 Group 2a
 */
public class Main {

    /**
     * The main method
     * reads the Pokedex.csv file in a list
     * print all Pokemon from the list
     * @param args ignored
     */
    public static void main(String[] args) {
    	DoubleLinkedList<Episode> episoden = new DoubleLinkedList<Episode>();
        initEpisode(episoden, "singleepi.csv");
        DoubleLinkedList<Episode> ersteStaffel = (DoubleLinkedList<Episode>) episoden.filter(new FilterFirstSeason());
        DoubleLinkedList<Episode> bis2005 = (DoubleLinkedList<Episode>) episoden.filter(new FilterYear());
        
        DoubleLinkedList<Pokemon> pokemon = new DoubleLinkedList<Pokemon>();
        initPokemon(pokemon, "Pokedex.csv");
        DoubleLinkedList<Pokemon> ersteGeneration = (DoubleLinkedList<Pokemon>) pokemon.filter(new FilterFirstGeneration());
        DoubleLinkedList<Pokemon> keinTyp2 = (DoubleLinkedList<Pokemon>) pokemon.filter(new FilterNoMix());
        
    	
    }
    /**
	Initialisiert eine Episodenliste
	@param filename der name der einzulesenden Datei
	@param list die bereits erstellte liste
	*/    
    public static void initPokemon(List<Pokemon> list, String filename) {
    	BufferedReader bufferedReader;
        try {
            bufferedReader = Files.newBufferedReader(Paths.get(filename));
            String line;
            String[] data;
            bufferedReader.readLine();
            while ((line = bufferedReader.readLine()) != null) {
                if (!line.equals("")) {
                    data = line.split(",");
                    list.insert(new Pokemon(data[0], data[1], data[2], data[3], data[4], data[5], data[6], data[7],
                        data[8], data[9], data[10]));
                }
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }
    }
    /**
	Initialisiert eine Episodenliste
	@param filename der name der einzulesenden Datei
	@param list die bereits erstellte liste
	*/
    public static void initEpisode(List<Episode> list, String filename) {
    	BufferedReader bufferedReader;
        try {
            bufferedReader = Files.newBufferedReader(Paths.get(filename));
            String line;
            String[] data;
            bufferedReader.readLine();
            while ((line = bufferedReader.readLine()) != null) {
                if (!line.equals("")) {
                    data = line.split(",");
                    list.insert(new Episode(data[0], data[1], data[2], data[3], data[4]));
                }
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }
    }
}
