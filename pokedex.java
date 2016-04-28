import java.io.*;

public class pokedex {

	public static void main(String[] args) throws IOException{
		FileReader fr = new FileReader("Pokedex.csv");
	    BufferedReader br = new BufferedReader(fr);

	    String zeile1 = br.readLine();
	    System.out.println(zeile1);
	    String zeile2 = br.readLine();
	    System.out.println(zeile2);
	    String zeile3 = br.readLine();
	    System.out.println(zeile3);

	    br.close();
	}
}