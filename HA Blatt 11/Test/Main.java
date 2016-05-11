public class Main {

	public static void main(String[] args) {
		Pocket<Integer> intPocket = new Pocket<Integer>();
		Pocket<String> stringPocket = new Pocket<String>();

		intPocket.set(1);
		int x = intPocket.get();
		stringPocket.set("jo deine mutter stinkt");
		String s = stringPocket.get();
	}
}