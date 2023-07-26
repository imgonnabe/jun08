package jun08;

public class Test05 {
	public static void main(String[] args) {
		String word = "Hello";

		for (int i = 0; i < word.length(); i++) {
			System.out.print((char)(word.charAt(i) + 3));
		}
		System.out.println("");
		System.out.println(word.substring(2));
		System.out.println(word.substring(0, 2));
		
		String name = "가나다라마법사";
		System.out.println(name.substring(4, name.length()));
	}

}
