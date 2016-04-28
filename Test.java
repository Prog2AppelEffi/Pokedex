import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Paths;
import java.nio.file.Files;

public class Test{

	public static void main(String[] args){

		

		try {
			BufferedReader br = Files.newBufferedReader(Paths.get("Pokedex.csv"));
			String line = null;
			DoubleLinkedList list = null;
			br.readLine();
			while ((line = br.readLine()) != null) {

				if(!line.equals("")){
					System.out.println(line);
					Pokemon poke = new Pokemon(line);
					if(list == null){
						list = new DoubleLinkedList(poke);
					} else	{
						list.insert(poke);	
					}
					
				}
					
				
				
				
				
			}

		}catch(IOException ioe){
			System.out.println("blablabla");
		}

	}
}