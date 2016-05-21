import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Class for the Main method
 * @author Jane Doe 1234567 Group 42h
 * @author John Doe 1234567 Group 42h
 */
public class Main {

    /**
     * The main method
     * reads the Pokedex.csv file in a list
     * print all Pokemon from the list
     * @param args ignored
     */
    public static void main(String[] args) {
        /*DoubleLinkedList<Pokemon> list = new DoubleLinkedList<Pokemon>();
        initPokemon(list, "Pokedex.csv");
        
    	
        System.out.printf("Pokemon: %d %n%n", list.length()); // Optional

        System.out.printf("%3s | %15s | %8s | %8s | %5s | %3s | %3s | %3s | %6s | %6s | %5s%n", "Nr", "Name", "Type 1",
            "Type 2", "Total", "HP", "Atk", "Def", "Sp Atk", "Sp Def", "Speed");
        System.out.println("-----------------------------------------------------------------------------------------------");
        System.out.println(list);
        */
    	DoubleLinkedList<Episode> list = new DoubleLinkedList<Episode>();
        initEpisode(list, "singleepi.csv");
        //System.out.println(list.get(3));
        DoubleLinkedList<Episode> copy = new DoubleLinkedList<Episode>();
        copy.addAll(list);
        System.out.println(copy);
    	
    }
    
    public static void initPokemon(List<Pokemon> list, String filename){
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
    
    public static void initEpisode(List<Episode> list, String filename){
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
